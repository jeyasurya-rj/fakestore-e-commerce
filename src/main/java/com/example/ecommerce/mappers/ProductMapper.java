package com.example.ecommerce.mappers;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.entities.Product;

public class ProductMapper
{
    public static ProductDTO toDTO(Product product)
    {
       return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .category(product.getCategory())
                .price(product.getPrice())
                .description(product.getDescription())
                .imageUrl(product.getImageUrl())
                .rating(product.getRating())
                .ratingCount(product.getRatingCount())
                .build();
    }

    public static Product toEntity(ProductDTO productDTO)
    {
        return Product.builder()
                .title(productDTO.getTitle())
                .price(productDTO.getPrice())
                .rating(productDTO.getRating())
                .category(productDTO.getCategory())
                .imageUrl(productDTO.getImageUrl())
                .description(productDTO.getDescription())
                .ratingCount(productDTO.getRatingCount())
                .build();
    }
}
