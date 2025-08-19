package com.example.ecommerce.mappers;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.entities.Category;
import com.example.ecommerce.entities.Product;

public class ProductMapper
{
    public static ProductDTO toDTO(Product product)
    {
       return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .categoryId(product.getCategory().getId())
                .price(product.getPrice())
                .description(product.getDescription())
                .imageUrl(product.getImageUrl())
                .rating(product.getRating())
                .ratingCount(product.getRatingCount())
                .build();
    }

    public static Product toEntity(ProductDTO productDTO, Category category)
    {
        return Product.builder()
                .title(productDTO.getTitle())
                .price(productDTO.getPrice())
                .rating(productDTO.getRating())
                .category(category)
                .imageUrl(productDTO.getImageUrl())
                .description(productDTO.getDescription())
                .ratingCount(productDTO.getRatingCount())
                .build();
    }
}
