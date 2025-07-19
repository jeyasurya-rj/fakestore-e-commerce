package com.example.ecommerce.configurations;

import com.example.ecommerce.gateway.api.FakeStoreCategoryAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfiguration
{
    @Bean
    public Retrofit retrofit()
    {
        return new Retrofit.Builder()
                .baseUrl("https://fakestoreapi.in/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit)
    {
        return retrofit.create(FakeStoreCategoryAPI.class);
    }
}
