package com.curso.app.repositorio;

import com.curso.app.entidades.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositorio extends CrudRepository<Producto, Long> {

}
