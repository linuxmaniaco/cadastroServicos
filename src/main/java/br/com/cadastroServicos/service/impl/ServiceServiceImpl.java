package br.com.cadastroServicos.service.impl;

import br.com.cadastroServicos.model.Product;
import br.com.cadastroServicos.repository.ServiceRepository;
import br.com.cadastroServicos.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import br.com.cadastroServicos.model.Services;

@Service
@RequiredArgsConstructor
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;


    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Services create(Services service) {
        return serviceRepository.save(service);
    }

    @Override
    public Services update(Services services) {
        Optional<Services> id = findById(services.getId());
        if(id.isPresent()) {
            return serviceRepository.save(services);
        }
        return null;
//        return serviceRepository.save(services);
    }


    @Override
    public void delete(Long id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Optional<Services> findById(Long id) {
        return serviceRepository.findById(id);
    }

}
