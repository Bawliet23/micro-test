package com.micro.exp1;

import com.micro.exp1.entities.Product;
import com.micro.exp1.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class DummyDataCLR implements CommandLineRunner {

    @Autowired
    private IProductRepository productRepository;
    @Override
    public void run(String... strings) throws Exception {
    Stream.of("Pencil",   "Book",
            "Eraser").forEach(s->productRepository.save(new Product(s))); productRepository.findAll().forEach(s->System.out.println(s.getName()));
}
     }
