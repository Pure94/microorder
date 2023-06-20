package com.microorder.orderservice.ordermanager;

import com.microorder.orderservice.ordermanager.model.OrderItemDto;
import com.microorder.orderservice.ordermanager.model.OrderRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import lombok.experimental.UtilityClass;

@UtilityClass
class OrderMapper
{
    static Order mapToOrderEntity(final OrderRequest orderRequest)
    {
        final Order orderEntity = new Order();

        final List<OrderItem> orderItemEntity = orderRequest.getOrderItems().stream()
                .map(OrderMapper::mapToOrderItemEntity)
                .collect(Collectors.toList());

        orderEntity.setOrderItems(orderItemEntity);
        return orderEntity;
    }

    static OrderItem mapToOrderItemEntity(final OrderItemDto orderItemDto)
    {
        final OrderItem orderItemEntity = new OrderItem();
        orderItemEntity.setPrice(BigDecimal.valueOf(orderItemDto.getPrice()));
        orderItemEntity.setQuantity(orderItemDto.getQuantity());
        orderItemEntity.setSkuCode(orderItemDto.getSkuCode());
        return orderItemEntity;
    }
}
