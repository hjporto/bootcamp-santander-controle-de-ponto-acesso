package com.dio.controle.ponto.acesso.shopping.cart.repository;

import com.dio.controle.ponto.acesso.shopping.cart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
