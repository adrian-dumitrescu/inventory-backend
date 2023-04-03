package com.softedit.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "USER_STASH")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserStash implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_stash_id", nullable = false, updatable = false)
    private Long id;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    @OneToOne(mappedBy = "userStash", fetch = FetchType.LAZY, optional = false)
    private AppUser user;

    @OneToMany(mappedBy = "userStash", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<Item> items = new HashSet<>();

}
