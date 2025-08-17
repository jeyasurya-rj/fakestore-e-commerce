package com.example.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends BaseEntity
{
    private String title;
    private BigDecimal price;
    private String description;
    private String category;
    private String imageUrl;
    private Integer rating;

    @Column(columnDefinition = "INT DEFAULT 0")
    private int ratingCount;
}
