package com.example.ecommerce.service.product;

import com.example.ecommerce.dto.ProductDTO;

public interface IProductService
{
    ProductDTO getProductById(Long id) throws Exception;

    ProductDTO createProduct(ProductDTO productDTO) throws Exception;

}
