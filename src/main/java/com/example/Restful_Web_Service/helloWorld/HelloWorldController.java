
//Q) Create a simple REST ful service in Spring Boot which returns the Response "Welcome to spring boot"
package com.example.Restful_Web_Service.helloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String returnString(){
        return "Welcome to Spring boot";
    }

    @GetMapping("/helloWorld")
    public HelloWorldBean getString(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean pathVariableName(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World!,%s",name));
    }

}
