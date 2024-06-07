package com.globant.microservice2.controller;

import com.globant.microservice2.entities.Producto;
import com.globant.microservice2.repositories.ProductoRepository;
import com.globant.microservice2.services.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/buscar/{filtro}")
    public ResponseEntity<List<Producto>> buscarProductos(@PathVariable("filtro") String filtro) {
        List<Producto> productos = productoService.buscarProductosPorNombre(filtro);

        if (productos.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.ok(productos);
        }
    }
}