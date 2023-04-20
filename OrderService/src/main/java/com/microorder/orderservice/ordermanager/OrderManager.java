package com.microorder.orderservice.ordermanager;

import com.microorder.orderservice.ordermanager.model.OrderRequest;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class OrderManager implements OrderManagerFacade
{
    private final OrderRepository orderRepository;

    public void placeOrder(final OrderRequest orderRequest)
    {
        final OrderEntity orderEntity = OrderMapper.mapToOrderEntity(orderRequest);
        orderEntity.setOrderNumber(UUID.randomUUID());

        orderRepository.save(orderEntity);
    }
}