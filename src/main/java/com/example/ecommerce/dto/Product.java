package com.example.ecommerce.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Product
{
    String name;
    String category;
}
