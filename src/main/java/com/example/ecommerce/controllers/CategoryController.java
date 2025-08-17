package com.example.ecommerce.controllers;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.service.category.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController
{
    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService)
    {
        this.categoryService = categoryService;
    }

    @GetMapping
    List<CategoryDTO> getAllCategories() throws Exception
    {
        return categoryService.getAllCategories();
    }
}
