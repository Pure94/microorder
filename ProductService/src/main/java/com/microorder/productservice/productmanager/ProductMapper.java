package com.microorder.productservice.productmanager;

import com.microorder.productservice.productmanager.model.ProductRequest;
import com.microorder.productservice.productmanager.model.ProductResponse;

import lombok.experimental.UtilityClass;

@UtilityClass
class ProductMapper
{
    ProductEntity mapToEntity(ProductRequest productRequest)
    {
        return ProductEntity.builder()
                .name(productRequest.name())
                .description(productRequest.description())
                .price(productRequest.price())
                .build();
    }

    ProductResponse mapToResponse(ProductEntity productEntity)
    {
        return ProductResponse.builder()
                .name(productEntity.getName())
                .description(productEntity.getDescription())
                .price(productEntity.getPrice())
                .build();
    }
}