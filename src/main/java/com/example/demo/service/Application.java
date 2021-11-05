package com.example.demo.service;

import com.example.demo.data.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Application {

    // MENGIMPLEMENTASIKAN
    private DataService dataService;

    // MEMBUAT CONSTUCTOR
    public Application(DataService dataService){
        super();
        this.dataService = dataService;
    }

    @GetMapping("/hello")
    public String helloService(){
        return dataService.sayGreeting();
    }


}
