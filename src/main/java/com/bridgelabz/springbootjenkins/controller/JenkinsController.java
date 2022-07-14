package com.bridgelabz.springbootjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping(value = {"/hello"})
    public String Hello(){
        return "Deployment of SpringBoot App in Tomcat server using Jenkins is Successfull !!!";
    }

}