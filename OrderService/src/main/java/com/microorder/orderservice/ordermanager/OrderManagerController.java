package com.microorder.orderservice.ordermanager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microorder.orderservice.ordermanager.model.OrderRequest;

@RestController
@RequestMapping("/api/order")
class OrderManagerController
{
    //Post mapping place order
    @PostMapping
    String placeOrder(@RequestBody OrderRequest orderRequest)
    {

    }


}
