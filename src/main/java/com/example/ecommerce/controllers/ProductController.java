package com.example.ecommerce.controllers;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.service.product.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController
{
    private final IProductService productService;

    public ProductController(IProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> getProducts()
    {
        List<ProductDTO> products = new ArrayList<>();

        ProductDTO kitKat = ProductDTO.builder().title("Kit-Kat").category("Food").build();

        products.add(kitKat);

        return products;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) throws Exception
    {
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO product) throws Exception
    {
        return ResponseEntity.ok(productService.createProduct(product));
    }
}
