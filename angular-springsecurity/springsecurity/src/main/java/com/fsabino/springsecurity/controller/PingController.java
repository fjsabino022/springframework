package com.fsabino.springsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Pong");
    }
}
