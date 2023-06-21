package com.InteractiveMap.interactiveMap.resources;

import com.InteractiveMap.interactiveMap.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "test_name", "test_location");
        return ResponseEntity.ok().body(u);
    }
}
