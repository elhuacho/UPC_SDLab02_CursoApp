package com.curso.app;

import com.curso.app.entidades.Producto;
import com.curso.app.repositorio.ProductoRepositorio;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest //ojo para probar el repositorio
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) //database
@Rollback(false)
@SpringBootTest
public class AppApplicationTests {

	@Autowired
	ProductoRepositorio productoRepositorio;
	@Test
	public void contextLoads() {
	}

	@Test
	public void probarRegistro() {
		Producto producto = new Producto();
		producto.setDescripcion("Papel Carta A4");
		producto.setPrecio(12.00);
		Producto p = productoRepositorio.save(producto);


	}

}
