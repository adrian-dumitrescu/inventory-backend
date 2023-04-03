package com.softedit.inventory.mapper;

import com.softedit.inventory.dto.model.AppRoleDto;
import com.softedit.inventory.dto.model.AppUserDto;
import com.softedit.inventory.dto.model.UserStashDto;
import com.softedit.inventory.model.AppUser;
import jakarta.validation.constraints.Email;

import java.util.Set;

public class AppUserMapper implements Mapper<AppUser, AppUserDto> {

    @Override
    public AppUserDto convertToDto(AppUser entity) {
        AppUserDto dto = new AppUserDto();
        dto.setId(entity.getId());
        dto.setFirstName(entity.getFirstName());
        dto.setLastName(entity.getLastName());
        dto.setEmail(entity.getEmail());
        dto.setPassword(entity.getPassword());
        dto.setRoles(entity.getRoles());
        dto.setProfileImageUrl(entity.getProfileImageUrl());
        dto.setIsNotLocked(entity.getIsNotLocked());
        dto.setIsEnabled(entity.getIsEnabled());
        return dto;
    }

    @Override
    public AppUser convertToEntity(AppUserDto dto) {
        return null;
    }
}
//
//    private Long id;
//
//    private String firstName;
//
//    private String lastName;
//
//    private Long userUniqueId;
//
//    @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
//    private String email;
//
//    private String password;
//
//    private String profileImageUrl;
//
//    private Boolean isNotLocked;
//
//    private Boolean isEnabled;
//
//    private Set<AppRoleDto> roles;
//
//    private UserStashDto userStash;
