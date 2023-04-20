package com.microorder.productservice.productmanager;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microorder.productservice.productmanager.model.ProductRequest;
import com.microorder.productservice.productmanager.model.ProductResponse;
import java.util.List;

@RestController
@RequestMapping("/api/product")
class ProductManagerController
{
    private final ProductManagerFacade productManager;

    public ProductManagerController(ProductManagerFacade productManager)
    {
        this.productManager = productManager;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    String createProduct(@RequestBody ProductRequest product)
    {
        return productManager.createProduct(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<ProductResponse> getProducts()
    {
        return productManager.getProducts();
    }
}