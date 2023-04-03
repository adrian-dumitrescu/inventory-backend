package com.softedit.inventory.dto.model;

import com.softedit.inventory.model.Item;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemSerialNumberDto {

    private Long id;

    private String serialNumber;

    private ItemDto item;
}
