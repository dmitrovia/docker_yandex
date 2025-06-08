package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/create")
    public ResponseEntity<String> createResource(@RequestBody String data) {
        // Логика создания ресурса на основе переданных данных
        return new ResponseEntity<>("Resource created successfully", HttpStatus.CREATED); // 201
    }


}

