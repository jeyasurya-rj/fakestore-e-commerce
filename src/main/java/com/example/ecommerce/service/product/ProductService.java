package com.example.ecommerce.service.product;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.entities.Category;
import com.example.ecommerce.entities.Product;
import com.example.ecommerce.mappers.ProductMapper;
import com.example.ecommerce.repositories.CategoryRepository;
import com.example.ecommerce.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository)
    {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
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
        Category category = categoryRepository.findById(productDTO.getCategoryId()).orElseThrow(()-> new Exception("Category not found"));
        Product savedProduct = productRepository.save(ProductMapper.toEntity(productDTO, category));
        return ProductMapper.toDTO(savedProduct);
    }
}
