package com.introduccion.springnott.web.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.introduccion.springnott.web.springboot_web.models.User;
import com.introduccion.springnott.web.springboot_web.models.DTO.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class UserController {

    @GetMapping("/detalles")
    public String getMethodName(Model model) {
        User identificarUsuario = new User("Bryan", "Rauda");

        UserDTO dtoEmailUserTitleCorreo = new UserDTO(
                "Titulo desde DTO",
                identificarUsuario,
                "correo@servidor");

        model.addAttribute(
                "userDTO",
                dtoEmailUserTitleCorreo);
        return "detalles2";
    }

    @GetMapping("/lista")
    public String lista(ModelMap model) {
        List<User> user = Arrays.asList(
            new User("Bryan", "Rauda", "bryan@servidor"),
            new User("Alexis", "Gómez", "alexis@servidor"),
            new User("Juan", "Pérez"));
        model.addAttribute("user", user);
        model.addAttribute("title", "Lista de usuarios");
        return "lista";
    }
}
