package com.curso.app.negocio;

import com.curso.app.entidades.Producto;
import com.curso.app.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Negocio {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public Producto crear(Producto producto) {
        return productoRepositorio.save(producto);
    }
}
