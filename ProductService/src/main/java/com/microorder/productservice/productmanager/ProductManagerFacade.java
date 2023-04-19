package com.microorder.productservice.productmanager;

import com.microorder.productservice.productmanager.model.ProductRequest;
import com.microorder.productservice.productmanager.model.ProductResponse;
import java.util.List;

public interface ProductManagerFacade
{
    String createProduct(ProductRequest product);
    List<ProductResponse> getProducts();
}
