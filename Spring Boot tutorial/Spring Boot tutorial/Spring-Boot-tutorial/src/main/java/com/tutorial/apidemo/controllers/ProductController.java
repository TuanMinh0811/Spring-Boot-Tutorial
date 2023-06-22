package com.tutorial.apidemo.controllers;

import com.tutorial.apidemo.models.Product;
import com.tutorial.apidemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //DI = Denpendency Injection
    @Autowired
    private ProductRepository repository;

    @GetMapping("")
    // this request is: http://localhost:8080/api/v1/Products
    List<Product> getAllProducts(){
//        return List.of(
//                new Product(1L, "Macbook pro 16 inch", 2020, 2400.0, "" ),
//                new Product(2L , "ipad air green", 2021, 599.0, "")

//        );
        return repository.findAll();
    }
}
