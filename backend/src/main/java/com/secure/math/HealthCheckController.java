package com.secure.math;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthCheckController {

    @GetMapping("/ping")
    public String healthCheck() {
        return new String("Pong");
    }

}
