package com.introduccion.springnott.web.springboot_web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.introduccion.springnott.web.springboot_web.models.User;
import com.introduccion.springnott.web.springboot_web.models.DTO.UserDTO;

@RestController
@RequestMapping("/api")
public class UserRestController {
    User user = new User("Alexis", "Rauda");

    @GetMapping("/detalles")
    public UserDTO detalles() {
        User user = new User("Ever", "Sorto");
        UserDTO userDto = new UserDTO();
        userDto.setUser(user);
        userDto.setTitle("User Details");
        return userDto;
    }

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
}
