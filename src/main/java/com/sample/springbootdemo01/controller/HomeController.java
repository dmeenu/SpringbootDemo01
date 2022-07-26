package com.sample.springbootdemo01.controller;

import com.sample.springbootdemo01.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {

    @PostMapping(value = "addUsers")
    public UserDetails addUserDetails(@RequestBody UserDetails userDetails){
    }
}
