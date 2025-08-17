package com.example.ecommerce.service.product;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.entities.Product;
import com.example.ecommerce.mappers.ProductMapper;
import com.example.ecommerce.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception
    {
        return productRepository.findById(id)
                .map(ProductMapper::toDTO)
                .orElseThrow(() -> new Exception("Product not found"));
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) throws Exception
    {
        Product savedProduct = productRepository.save(ProductMapper.toEntity(productDTO));
        return ProductMapper.toDTO(savedProduct);
    }
}
