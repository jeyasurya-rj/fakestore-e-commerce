package com.example.ecommerce.repositories;

import com.example.ecommerce.dto.ProductDTO;
import com.example.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>
{ }
