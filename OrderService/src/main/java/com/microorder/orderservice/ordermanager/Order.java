package com.microorder.orderservice.ordermanager;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import java.util.UUID;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private UUID orderNumber;
    private String orderStatus;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;
}
