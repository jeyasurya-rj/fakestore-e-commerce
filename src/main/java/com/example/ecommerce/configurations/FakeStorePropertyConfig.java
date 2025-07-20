package com.example.ecommerce.configurations;

import com.example.ecommerce.properties.FakeStoreProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FakeStoreProperties.class)
public class FakeStorePropertyConfig {}
