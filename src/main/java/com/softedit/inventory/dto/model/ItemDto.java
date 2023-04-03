package com.softedit.inventory.dto.model;

import com.softedit.inventory.model.ItemCategory;
import com.softedit.inventory.model.ItemInventory;
import com.softedit.inventory.model.ItemSerialNumber;
import com.softedit.inventory.model.UserStash;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {

    private Long id;

    private String itemName;

    private String itemDetails;

    private String itemLocation;

    private Boolean isAssigned;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private UserStashDto userStash;

    private ItemInventoryDto itemInventory;

    private ItemCategoryDto itemCategory;

    private Set<ItemSerialNumberDto> itemSerialNumbers;

}
