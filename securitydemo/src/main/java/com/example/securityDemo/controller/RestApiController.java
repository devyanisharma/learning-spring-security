package com.example.securityDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestApiController {
    @RequestMapping(path = "api",method = RequestMethod.GET)
    public String getAllDetails(){
        return "Welcome Everyone";
    }

    @RequestMapping(path="user",method = RequestMethod.GET)
    public String getApiUser(){
        return "Welcome User";
    }

    @RequestMapping(path="admin",method = RequestMethod.GET)
    public String getApiAdmin(){
        return ("<h1>Welcome Admin</h1> ");
    }
}
