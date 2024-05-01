/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibb.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author trainer
 */
@RestController
public class HelloWorldController {
    
    
    @GetMapping(path = "greeting")
    public String doSomething(){
        return "Hallo Spring Boot World";
    }
    
    
    
    
     @GetMapping(path = "greet")
    public String doSomething1(){
        return "Hallo Spring Boot World 2";
    }
}
