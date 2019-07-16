package com.springflux.springflux.controller;

import com.springflux.springflux.bean.User;
import com.springflux.springflux.flux.Handder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Handder handder;
    @PostMapping("/user/insert")
    public User insert(@RequestParam("name") String name){

        return null;

    }
}
