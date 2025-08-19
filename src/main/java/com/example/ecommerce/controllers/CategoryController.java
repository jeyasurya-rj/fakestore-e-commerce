package com.example.ecommerce.controllers;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController
{
    private final ICategoryService categoryService;

    public CategoryController(@Qualifier("categoryService") ICategoryService categoryService)
    {
        this.categoryService = categoryService;
    }

    @GetMapping
    List<CategoryDTO> getAllCategories() throws Exception
    {
        return categoryService.getAllCategories();
    }

    @PostMapping
    ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) throws Exception
    {
        return ResponseEntity.ok(categoryService.createCategory(categoryDTO));
    }
}
