package com.example.ecommerce.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class ProductDTO
{
    private Long id;
    private String title;
    private Long categoryId;
    private BigDecimal price;
    private String description;
    private Integer rating;
    private Integer ratingCount;
    private String imageUrl;
}
