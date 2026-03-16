package org.example.monitoringapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.LocalDateTime;

@RestController
public class TimeController {
    @GetMapping("/time")
    public LocalDateTime vrijeme(){
        return LocalDateTime.now();
    }
}
