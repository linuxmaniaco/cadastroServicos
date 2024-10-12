package br.com.cadastroServicos.repository;

import br.com.cadastroServicos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
