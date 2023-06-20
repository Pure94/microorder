package com.microorder.orderservice.ordermanager;

import com.microorder.orderservice.ordermanager.model.OrderRequest;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class OrderManager implements OrderManagerFacade
{
    private final OrderRepository orderRepository;

    public String placeOrder(final OrderRequest orderRequest)
    {
        final Order orderEntity = OrderMapper.mapToOrderEntity(orderRequest);
        orderEntity.setOrderNumber(UUID.randomUUID());

        orderRepository.save(orderEntity);

        return orderEntity.getOrderNumber().toString();
    }
}