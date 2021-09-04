package com.dio.controle.ponto.acesso.productcatalog.controller;

import com.dio.controle.ponto.acesso.productcatalog.model.Product;
import com.dio.controle.ponto.acesso.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Product findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }

}
