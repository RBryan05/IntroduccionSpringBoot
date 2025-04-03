package com.introduccion.springnott.web.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.introduccion.springnott.web.springboot_web.controllers.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    User user = new User("Alexis", "Rauda");

    @GetMapping("/detalles")
    public Map<String, Object> detalles() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola desde Spring Boot");
        body.put("user", user);
        return body;
    }
}
