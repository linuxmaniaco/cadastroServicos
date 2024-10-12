package br.com.cadastroServicos.controller;

import br.com.cadastroServicos.model.Product;
import br.com.cadastroServicos.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/createProduct")
    public ResponseEntity<?> create(@RequestBody Product product) {
        productService.create(product);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getProduct")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(productService.findAll());
    }

    @PutMapping("/updateProduct")
    public ResponseEntity<?> update(@RequestBody Product product) {
        productService.update(product);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> delete(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
