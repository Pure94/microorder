package com.microorder.orderservice.ordermanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto
{
    private String skuCode;
    private Integer quantity;
    private Double price;
}
