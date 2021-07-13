package com.micro.exp1.controllers;

import com.micro.exp1.entities.Product;
import com.micro.exp1.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
