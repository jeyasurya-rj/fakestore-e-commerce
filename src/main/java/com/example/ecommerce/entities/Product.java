package com.example.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private String imageUrl;
    private Integer rating;

    @Column(columnDefinition = "INT DEFAULT 0")
    private int ratingCount;

    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;
}
