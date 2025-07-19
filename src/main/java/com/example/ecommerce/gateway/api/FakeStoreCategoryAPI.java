package com.example.ecommerce.gateway.api;


import com.example.ecommerce.gateway.dto.FakeStoreCategoryResponseDTO;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreCategoryAPI
{
    @GET("products/category")
    Call<FakeStoreCategoryResponseDTO> getAllCategories();
}
