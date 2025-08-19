package com.example.ecommerce.service.category;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.entities.Category;
import com.example.ecommerce.mappers.CategoryMapper;
import com.example.ecommerce.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService implements ICategoryService
{
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws Exception
    {
        return categoryRepository.findAll().stream().map(CategoryMapper::toDTO).collect(Collectors.toList());
    }

    public CategoryDTO createCategory(CategoryDTO category) throws Exception
    {
        Category savedCategory = categoryRepository.save(CategoryMapper.toEntity(category));
        return CategoryMapper.toDTO(savedCategory);
    }
}
