package com.example.ecommerce.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "app.fake.store")
public class FakeStoreProperties
{
    String baseUrl;
}
