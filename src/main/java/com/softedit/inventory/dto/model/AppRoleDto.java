package com.softedit.inventory.dto.model;

import com.softedit.inventory.model.enums.Role;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRoleDto {

    private Long id;

    private Role role;

}
