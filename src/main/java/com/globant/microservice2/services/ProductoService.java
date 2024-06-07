package com.globant.microservice2.services;

import com.globant.microservice2.entities.Producto;
import com.globant.microservice2.repositories.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> buscarProductosPorNombre(String filtro) {
        return productoRepository.findByNombreContainingIgnoreCase(filtro);
    }
}