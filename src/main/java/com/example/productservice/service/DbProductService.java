package com.example.productservice.service;

import com.example.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dbProductService")
public class DbProductService implements ProductService {
    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id , Product product) {
        return null;
    }

    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
}
