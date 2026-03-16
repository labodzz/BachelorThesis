package org.example.monitoringapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.Map;

@RestController
public class GreetController {

    @PostMapping("/greet")
    public Map<String, String> greetUser(@RequestBody Map<String, String> request) {
        String name = request.get("name");
        String message = "Hello, " + (name != null ? name : "Guest") + "!";
        return Collections.singletonMap("message", message);
    }
}