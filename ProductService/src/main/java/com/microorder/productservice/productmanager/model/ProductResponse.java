package com.microorder.productservice.productmanager.model;

import lombok.Builder;

@Builder
public record ProductResponse(String name, String description, Double price)
{ }
