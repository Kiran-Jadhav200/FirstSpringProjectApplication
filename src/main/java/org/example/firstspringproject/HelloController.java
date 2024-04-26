package org.example.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(){
    return "<h1><b>Hello World</b></h1>";
    }
    @GetMapping("/")
    public String getHome(){
        return "<h1>welcome home</h1>";
    }
    @GetMapping("/test")
    public String getTest(){
        return "<h1>Kiran.... Jadhav</h1>";
    }
}
