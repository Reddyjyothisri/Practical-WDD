package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/Mapping")
    public String Demo(@RequestParam String name, @RequestParam Integer age){
    	return name+",your age is "+ age;
    }
}
