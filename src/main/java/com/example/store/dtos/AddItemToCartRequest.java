package com.example.store.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AddItemToCartRequest {
    @NotNull(message = "must pass a product id to be added to cart")
    private Long productId;
}
