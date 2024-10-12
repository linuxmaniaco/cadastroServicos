package br.com.cadastroServicos.repository;

import br.com.cadastroServicos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
