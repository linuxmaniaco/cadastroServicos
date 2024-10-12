package br.com.cadastroServicos.service;

import br.com.cadastroServicos.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Product create(Product product);
    Product update(Product product);
    void deleteById(Long id);
    Optional<Product> findById(Long id);

}
