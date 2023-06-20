package com.microorder.orderservice.ordermanager;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microorder.orderservice.ordermanager.model.OrderRequest;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
class OrderManagerController
{
    private final OrderManagerFacade orderManager;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    String placeOrder(@RequestBody final OrderRequest orderRequest)
    {
        orderManager.placeOrder(orderRequest);
        return orderManager.placeOrder(orderRequest);
    }


}
