package com.example.ecommerce.gateway;

import com.example.ecommerce.dto.CategoryDTO;

import java.util.List;

public interface ICategoryGateway
{
    List<CategoryDTO> getAllCategories() throws Exception;
}
