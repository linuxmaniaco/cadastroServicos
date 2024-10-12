package br.com.cadastroServicos.controller;

import br.com.cadastroServicos.model.Services;
import br.com.cadastroServicos.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/services")
public class ServicesController {

    private final ServiceService serviceService;

    @PostMapping("/createServices")
    public ResponseEntity<?> create(@RequestBody Services services){
        serviceService.create(services);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getService")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok().body(serviceService.findAll());
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<?> update(@RequestBody Services services){
        serviceService.update(services);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        serviceService.delete(id);
        return ResponseEntity.ok().build();
    }
}
