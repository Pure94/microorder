package com.microorder.productservice.productmanager.model;

import jakarta.validation.constraints.NotBlank;

public record ProductRequest(@NotBlank String name,
                      String description,
                      Double price)
{
}
