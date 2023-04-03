package com.softedit.inventory.model;

import com.softedit.inventory.model.enums.Category;
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
@Table(name = "ITEM_CATEGORY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_category_id", nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String categoryName;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "itemCategory", orphanRemoval = true)
    //@JsonIgnore
    //@JsonManagedReference
    private Set<Item> items = new HashSet<>();
}
