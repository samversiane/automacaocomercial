package com.samuellversiane.concelltelecom.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public ResponseEntity<List<String>> listarTodos(){
        return ResponseEntity.ok(Arrays.asList("Celular", "Capa", "Pelicula"));
    }

    @PutMapping
    public ResponseEntity atualizarProduto() throws URISyntaxException {
        return ResponseEntity.created(new URI("123")).build();
    }

    @PostMapping
    public ResponseEntity<List<String>> cadastrarProduto(){
        return ResponseEntity.ok(Arrays.asList("Celular", "Capa", "Pelicula"));
    }

    @DeleteMapping
    public ResponseEntity<List<String>> deletarProduto(){
        return ResponseEntity.ok(Arrays.asList("Celular", "Capa", "Pelicula"));
    }
}
