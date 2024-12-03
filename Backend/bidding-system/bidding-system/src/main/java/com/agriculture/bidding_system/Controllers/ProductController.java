package com.agriculture.bidding_system.Controllers;
import com.agriculture.bidding_system.Entities.ProductEntity;

import com.agriculture.bidding_system.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")


public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
    @PostMapping
    public ProductEntity createUser(@RequestBody ProductEntity product) {
        return productRepository.save(product);
    }


}
