package com.microorder.orderservice.ordermanager.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderRequest
{
    private List<OrderItemDto> orderItems;
}
