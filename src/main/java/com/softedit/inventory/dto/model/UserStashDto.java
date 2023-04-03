package com.softedit.inventory.dto.model;

import com.softedit.inventory.model.AppUser;
import com.softedit.inventory.model.Item;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
public class UserStashDto {

    private Long id;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    private AppUserDto user;

    private Set<Item> items;

}
