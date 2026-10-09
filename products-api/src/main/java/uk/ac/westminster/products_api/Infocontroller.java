package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Infocontroller {
    @GetMapping("/info")
    public String info() {
        return "products-api: a Spring Boot REST API for the OOP module.";
    }

}
