package com.lowes.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testing")
@RequiredArgsConstructor
public class TestController {

    @GetMapping
    public String testEndpoint() {
        return "Hello from Home Renovation Planner!";
    }
@GetMapping("path")
public String greet() {
return" hey user welcome back ";
}



}
