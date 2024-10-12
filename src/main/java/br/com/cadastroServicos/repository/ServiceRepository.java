package br.com.cadastroServicos.repository;

import br.com.cadastroServicos.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Services, Long> {
}
