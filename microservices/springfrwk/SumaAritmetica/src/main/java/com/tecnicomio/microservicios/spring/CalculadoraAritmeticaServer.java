package com.tecnicomio.microservicios.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tecnicomio.microservicios.spring"})
public class CalculadoraAritmeticaServer {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraAritmeticaServer.class, args);
    }

}
