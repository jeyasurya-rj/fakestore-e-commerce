package com.example.ecommerce.service;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.gateway.FakeStoreCategoryGateway;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FakeStoreCategoryService implements ICategoryService
{
    private FakeStoreCategoryGateway fakeStoreCategoryGateway;

    public FakeStoreCategoryService(FakeStoreCategoryGateway fakeStoreCategoryGateway)
    {
        this.fakeStoreCategoryGateway = fakeStoreCategoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws Exception
    {
        return fakeStoreCategoryGateway.getAllCategories();
    }
}
