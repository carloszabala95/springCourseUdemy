package com.czcompany.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czcompany.curso.springboot.webapp.springbootweb.models.User;
import com.czcompany.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("Andress", "Zabala");
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo desde Spring");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        
        User user1 = new User("Carlos", "Zabala");
        User user2 = new User("Andres", "Doe");
        User user3 = new User("Jhon", "Doe");

        List<User> users = Arrays.asList(user1, user2, user3);
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){

        User user = new User("Andres", "Zabala");
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola Mundo desde Spring");
        body.put("user", user );

        return body;
    }


}
