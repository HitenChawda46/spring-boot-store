package com.example.store.mappers;

import com.example.store.dtos.CartDto;
import com.example.store.dtos.CartItemDto;
import com.example.store.entities.Cart;
import com.example.store.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
