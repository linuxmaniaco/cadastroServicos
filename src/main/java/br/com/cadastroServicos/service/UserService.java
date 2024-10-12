package br.com.cadastroServicos.service;

import br.com.cadastroServicos.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    User create(User user);
    User update(User user);
    void deleteById(Long id);
    Optional<User> findById(Long id);

}
