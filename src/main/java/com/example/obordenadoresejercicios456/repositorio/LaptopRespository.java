package com.example.obordenadoresejercicios456.repositorio;

import com.example.obordenadoresejercicios456.entidad.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRespository extends JpaRepository<Laptop, Long> {
}
