package com.example.ecommerce.controllers;

import com.example.ecommerce.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController
{
    @GetMapping
    public List<Product> getProducts()
    {
        List<Product> products = new ArrayList<>();

        Product kitKat = Product.builder().name("Kit-Kat").category("Food").build();

        products.add(kitKat);

        return products;
    }
}
