package br.com.cadastroServicos.service;

import br.com.cadastroServicos.model.Services;

import java.util.List;
import java.util.Optional;

public interface ServiceService {

    List<Services> findAll();
    Services create(Services services);
    Services update(Services services);
    void delete(Long id);
    Optional<Services> findById(Long id);
}
