package com.example.ecommerce.service;

import com.example.ecommerce.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService
{
    List<CategoryDTO> getAllCategories() throws Exception;
}
