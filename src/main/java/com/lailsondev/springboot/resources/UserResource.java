package com.lailsondev.springboot.resources;

import com.lailsondev.springboot.entidades.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Lailson", "lailson.cabral@gmail.com", "11983027163", "la1234");
        return ResponseEntity.ok().body(u);
    }
}
