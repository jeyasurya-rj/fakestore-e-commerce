package com.example.ecommerce.gateway;

import com.example.ecommerce.dto.CategoryDTO;
import com.example.ecommerce.gateway.api.FakeStoreCategoryAPI;
import com.example.ecommerce.gateway.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway
{
    private final FakeStoreCategoryAPI fakeStoreCategoryAPI;

    public FakeStoreCategoryGateway(FakeStoreCategoryAPI fakeStoreCategoryAPI)
    {
        this.fakeStoreCategoryAPI = fakeStoreCategoryAPI;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws Exception
    {
        FakeStoreCategoryResponseDTO response = fakeStoreCategoryAPI.getAllCategories().execute().body();
        if(Objects.isNull(response))
        {
            throw new IOException("Call to fetch categories from FakeStore is unsuccessful");
        }
        return response.getCategories()
                .stream()
                .map(fakeStoreCategory -> CategoryDTO.builder().name(fakeStoreCategory).build())
                .toList();
    }
}
