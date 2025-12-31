package com.example.myapp.DTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @GetMapping("/")
    F m1(){
        return new F();
    }
    @GetMapping("/a")
    String m2(){
        return "Hello";
    }

}
