package com.softedit.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "ITEM_SERIAL_NUMBER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemSerialNumber implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_serial_number_id", nullable = false, updatable = false)
    private Long id;

    private String serialNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_fk", nullable = false)
    //@JsonBackReference
    private Item item;
}
