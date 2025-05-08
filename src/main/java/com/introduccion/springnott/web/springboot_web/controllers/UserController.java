package com.introduccion.springnott.web.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.introduccion.springnott.web.springboot_web.models.User;
import com.introduccion.springnott.web.springboot_web.models.DTO.UserDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    // Muestra el formulario vacío
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new User()); // objeto vacío para el formulario
        return "formulario"; // nombre de la vista HTML
    }

    // Procesa el formulario con @ModelAttribute
    @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute User usuario, Model model) {
        // Aquí ya tienes los datos del formulario en el objeto
        model.addAttribute("mensaje", "Usuario guardado: " + usuario.getNombre());
        return "resultado"; // vista de confirmación
    }

    @ModelAttribute("user")
    public List<User> userModel(){
        List<User> user = Arrays.asList(
        new User("Bryan", "Rauda", "bryan@gamil.com"),
        new User("Alexis", "Gómez", "alexis@outlook.com"),
        new User("Marbelly", "Moreno")
        );
        return user;
    }
}