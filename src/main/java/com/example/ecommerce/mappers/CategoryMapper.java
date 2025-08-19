package com.example.ecommerce.mappers;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.entities.Category;

public class CategoryMapper
{
    public static CategoryDTO toDTO(Category category)
    {
        return CategoryDTO.builder()
                .id(category.getId())
                .name(category.getName())
                .build();
    }

    public static Category toEntity(CategoryDTO categoryDTO)
    {
        return Category.builder()
                .name(categoryDTO.getName())
                .build();
    }
}
