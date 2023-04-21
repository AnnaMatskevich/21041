package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    private final UserRepository userRepository;
    public Controller(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<user> getAllUsers(@RequestParam(required =
            false) String title) {
        List<user> tutorials = new ArrayList<user>();
        
        return tutorials;
    }
    
    @PostMapping("/users")
    public user createUser(@RequestBody user user) {
        return userRepository.save(user);
    }
    @DeleteMapping("/users/{index}")
    public ResponseEntity<Void> deleteText(@PathVariable("index") Long
                                                   index) {
        userRepository.deleteById(index);

        return ResponseEntity.noContent().build();
    }
    
}