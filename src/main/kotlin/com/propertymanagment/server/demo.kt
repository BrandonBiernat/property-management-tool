package com.propertymanagment.server

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/demo-controller")
class demo {
    @GetMapping
    fun sayHello(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello from secured endpoint")
    }
}