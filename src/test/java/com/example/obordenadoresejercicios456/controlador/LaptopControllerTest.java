package com.example.obordenadoresejercicios456.controlador;

import com.example.obordenadoresejercicios456.entidad.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;

    @BeforeEach
    void serUp(){
        restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:"+ port);
        testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

//    @Test
//    void findAll() {
//        ResponseEntity<Laptop[]> laptopResponseEntity =
//                testRestTemplate.getForEntity("/api/latops", Laptop[].class);
//        assertEquals(HttpStatus.OK, laptopResponseEntity.getStatusCode());
//        assertEquals(200, laptopResponseEntity.getStatusCodeValue());
//
//        List<Laptop> laptops = Arrays.asList(laptopResponseEntity.getBody());
//        System.out.println(laptops.size());
//    }

//    @Test
//    void findOneById() {
//        ResponseEntity<Laptop> laptopResponseEntity =
//                testRestTemplate.getForEntity("/api/latops/1", Laptop.class);
//        assertEquals(HttpStatus.NOT_FOUND, laptopResponseEntity.getStatusCode());
//
//    }

//    @Test
//    void create() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//
//        String json = """
//                {
//                    "marca": "DELL - NUEVO",
//                    "modelo": "E-1000",
//                    "capacidadRAM": 8,
//                    "capacidadDisco": 250,
//                    "precio": 1500.0,
//                    "licenciaSO": true
//                }
//                """;
//        HttpEntity<String> stringHttpEntity = new HttpEntity<>(json, headers);
//        ResponseEntity<Laptop> laptopResponseEntity =
//                testRestTemplate.exchange("/api/laptops", HttpMethod.POST, stringHttpEntity, Laptop.class);
//
//        Laptop laptopResult = laptopResponseEntity.getBody();
//        assertEquals(1L, laptopResult.getId());
//        assertEquals("DELL - NUEVO", laptopResult.getMarca());
//    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteAll() {
    }
}