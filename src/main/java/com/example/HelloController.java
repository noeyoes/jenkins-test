package com.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        System.out.println("hello!!");
        return "Hello World!";
    }

    @GetMapping("/bye")
    public String sayBye() {
        System.out.println("Bye!!!");
        return "Bye...!";
    }

    @GetMapping("/hi")
    public String sayHi() {
        System.out.println("Hi!!");
        return "Hi!!!!!!";
    }
}