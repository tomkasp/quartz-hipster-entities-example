package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("/hello")
@EnableWebMvc
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome() {
        return "hello";
    }
}