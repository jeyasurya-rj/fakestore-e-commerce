package com.example.ecommerce.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@Getter
@Setter
@ConfigurationProperties(prefix = "app.fake.store")
public class FakeStoreProperties
{
    String baseUrl;
    Duration timeout;
    Duration delay;
}
