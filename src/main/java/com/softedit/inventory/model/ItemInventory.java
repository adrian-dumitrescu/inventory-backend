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
@Table(name = "ITEM_INVENTORY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemInventory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_inventory_id", nullable = false, updatable = false)
    private Long id;

    private Integer quantity;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, mappedBy = "itemInventory", orphanRemoval = true)
    //@JsonIgnore
    //@JsonManagedReference
    private Set<Item> items = new HashSet<>();


}
