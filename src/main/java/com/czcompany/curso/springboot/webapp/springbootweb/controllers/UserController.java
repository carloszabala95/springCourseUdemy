package com.czcompany.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.czcompany.curso.springboot.webapp.springbootweb.models.User;




@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){
        
        model.addAttribute("title", "Hola Mundo desde Spring");
        User user = new User("Andres", "Zabala");
        user.setEmail("cz@gmail.com");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        
        // model.addAttribute("users", users);
        model.addAttribute("title", "Estado de usuarios");
        return "list";
    }
    
    @ModelAttribute("users")
    public List<User> userModel(){
        return Arrays.asList(
            new User("Pepa", "Gonzalez"),
            new User("Lalo", "Perez", "lalo77@hotmail"), 
            new User("Juanita", "Roe", "Juana@gmail.com"), 
            new User("Andrés", "Doe"));
    }

}
