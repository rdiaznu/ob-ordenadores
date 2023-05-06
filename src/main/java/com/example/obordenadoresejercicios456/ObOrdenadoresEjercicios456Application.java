package com.example.obordenadoresejercicios456;

import com.example.obordenadoresejercicios456.entidad.Laptop;
import com.example.obordenadoresejercicios456.repositorio.LaptopRespository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class ObOrdenadoresEjercicios456Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(ObOrdenadoresEjercicios456Application.class, args);
		LaptopRespository laptopRespository =  context.getBean(LaptopRespository.class);

		System.out.println("Cantidad de Laptop en la Base de datos :" + laptopRespository.count() + " unidades");

		Laptop laptop1 = new Laptop(null,"LENOVO", "TINPAK - 200 ", 16, 500, 3000d, true);
		laptopRespository.save(laptop1);

		System.out.println("Cantidad de Laptop en la Base de datos :" + laptopRespository.count() + " unidades");

	}

}
