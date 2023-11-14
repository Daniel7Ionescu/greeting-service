package com.dan.greetingservice.controllers;

import com.dan.greetingservice.services.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greet/{name}")
    public ResponseEntity<String> greet(@PathVariable String name){
        return ResponseEntity.ok(greetingService.getGreeting(name));
    }
}
