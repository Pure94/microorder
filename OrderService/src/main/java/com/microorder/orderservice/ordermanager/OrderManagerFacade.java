package com.microorder.orderservice.ordermanager;

import com.microorder.orderservice.ordermanager.model.OrderRequest;

public interface OrderManagerFacade
{
    String placeOrder(final OrderRequest orderRequest);

}
