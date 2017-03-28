package com.example;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController; 

@RestController  
@EnableAutoConfiguration
public class Example {
	@RequestMapping("/")  
    String home() {  
        return "Hello World!";  
    }  
      
    @RequestMapping("/hello/{name}")  
    String index(@PathVariable String name) {  
        return "Hello "+name+"!!!";  
    }  
}
