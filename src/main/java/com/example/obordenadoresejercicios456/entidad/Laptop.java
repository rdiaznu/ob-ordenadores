package com.example.obordenadoresejercicios456.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String marca;
    private String modelo;
    private Integer capacidadRAM;
    private Integer capacidadDisco;
    private Double precio;
    private Boolean licenciaSO;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String modelo, Integer capacidadRAM, Integer capacidadDisco, Double precio, Boolean licenciaSO) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadRAM = capacidadRAM;
        this.capacidadDisco = capacidadDisco;
        this.precio = precio;
        this.licenciaSO = licenciaSO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCapacidadRAM() {
        return capacidadRAM;
    }

    public void setCapacidadRAM(Integer capacidadRAM) {
        this.capacidadRAM = capacidadRAM;
    }

    public Integer getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(Integer capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getLicenciaSO() {
        return licenciaSO;
    }

    public void setLicenciaSO(Boolean licenciaSO) {
        this.licenciaSO = licenciaSO;
    }
}
