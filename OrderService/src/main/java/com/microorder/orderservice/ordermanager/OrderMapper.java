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
    static OrderEntity mapToOrderEntity(final OrderRequest orderRequest)
    {

        final OrderEntity orderEntity = new OrderEntity();
        final List<OrderItemEntity> orderItemEntity = orderRequest.getOrderItems().stream()
                .map(OrderMapper::mapToOrderItemEntity)
                .collect(Collectors.toList());

        orderEntity.setOrderItems(orderItemEntity);
        return orderEntity;
    }

    static OrderItemEntity mapToOrderItemEntity(final OrderItemDto orderItemDto)
    {
        OrderItemEntity orderItemEntity = new OrderItemEntity();
        orderItemEntity.setPrice(BigDecimal.valueOf(orderItemDto.getPrice()));
        orderItemEntity.setQuantity(orderItemDto.getQuantity());
        orderItemEntity.setSkuCode(orderItemDto.getSkuCode());
        return orderItemEntity;
    }
}
