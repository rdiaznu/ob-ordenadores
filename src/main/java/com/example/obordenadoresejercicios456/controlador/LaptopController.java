package com.example.obordenadoresejercicios456.controlador;

import com.example.obordenadoresejercicios456.entidad.Laptop;
import com.example.obordenadoresejercicios456.repositorio.LaptopRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {

    private final Logger log = LoggerFactory.getLogger(LaptopController.class);
    private LaptopRespository laptopRespository;

    public LaptopController(LaptopRespository laptopRespository) {
        this.laptopRespository = laptopRespository;
    }

    /**
     * Listar las laptops de la base de datos
     * @param laptop
     * @return
     */
    @GetMapping("api/laptops")
    public List<Laptop> findAll(Laptop laptop){
         return laptopRespository.findAll();
    }


    /**
     * Listar libros por Id
     *
     * @param id
     * @return
     */
    @GetMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> findOneById(@PathVariable Long id){
        Optional<Laptop> optionalLaptop = laptopRespository.findById(id);
        if(optionalLaptop.isPresent()){
            return ResponseEntity.ok(optionalLaptop.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Crear Laptops
     *
     * @param laptop
     * @param headers
     * @return
     */
    @PostMapping("/api/laptops")
    public ResponseEntity<Laptop> create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        if(laptop.getId() != null){
            log.warn("Trying to create a Laptop with id");
            return ResponseEntity.badRequest().build();
        }
        Laptop resultado = laptopRespository.save(laptop);
        return ResponseEntity.ok(resultado);

    }

    /**
     * Update la base de datos
     * @param laptop
     * @return
     */

    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        if (laptop.getId() == null){
            log.warn("Tring to update a non exist");
            return ResponseEntity.badRequest().build();
        }

        if(!laptopRespository.existsById(laptop.getId())){
            log.warn("Trying to update a non exist");
            return ResponseEntity.notFound().build();
        }

        Laptop resultado = laptopRespository.save(laptop);
        return ResponseEntity.ok(resultado);

    }

    /**
     * Delete Laptops por ID
     * @param id
     * @return
     */
    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        if (!laptopRespository.existsById(id)){
            log.warn("Trying to update a non exist");
            return ResponseEntity.notFound().build();
        }
        laptopRespository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


    /**
     * Delete todas las laptops
     *
     * @return
     */
    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        log.info("REST Request Delete all Laptops");
        laptopRespository.deleteAll();
        return ResponseEntity.noContent().build();
    }



}
