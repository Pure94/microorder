package com.microorder.orderservice.ordermanager;

import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<OrderEntity, Long>
{
}
