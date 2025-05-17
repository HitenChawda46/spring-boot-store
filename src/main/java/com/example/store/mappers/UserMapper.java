package com.example.store.mappers;

import com.example.store.dtos.RegisterUserRequest;
import com.example.store.dtos.UserDto;
import com.example.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest request);
}
