package com.jony.cloud2022.gatewayprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class PController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
