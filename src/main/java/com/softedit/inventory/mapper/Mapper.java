package com.softedit.inventory.mapper;

public interface Mapper <Entity, Dto>{

    Dto convertToDto(Entity entity);
    Entity convertToEntity(Dto dto);

}
