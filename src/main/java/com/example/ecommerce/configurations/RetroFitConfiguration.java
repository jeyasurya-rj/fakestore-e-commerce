package com.example.ecommerce.configurations;

import com.example.ecommerce.gateway.api.FakeStoreCategoryAPI;
import com.example.ecommerce.properties.FakeStoreProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetroFitConfiguration
{
    public FakeStoreProperties fakeStoreProperties;

    public RetroFitConfiguration(FakeStoreProperties fakeStoreProperties)
    {
        this.fakeStoreProperties = fakeStoreProperties;
    }

    @Bean
    public Retrofit retrofit()
    {
        return new Retrofit.Builder()
                .baseUrl(fakeStoreProperties.getBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Bean
    public FakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit)
    {
        return retrofit.create(FakeStoreCategoryAPI.class);
    }
}
