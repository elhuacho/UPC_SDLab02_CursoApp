package com.curso.app.rest;

import com.curso.app.entidades.Producto;
import com.curso.app.negocio.Negocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServicioProducto {

    @Autowired
    private Negocio negocio;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        return negocio.obtenerCatalogo();
    }

    @PostMapping("/producto")
    public Producto crear(@RequestBody Producto producto) {
        return negocio.crear(producto);
    }

}
