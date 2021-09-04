package com.dio.controle.ponto.acesso.productcatalog.repository;

import com.dio.controle.ponto.acesso.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
