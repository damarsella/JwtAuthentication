package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping("/welcome")
    public String welcome(){
        String text = "this is private page ";
        text += "halaman ini tidak diizinkan untuk pengguna yang tidak diautentikasi";
        return text;
    }

    @RequestMapping("/getusers")
    public String getUsers(){
        return "{\"name\":\"Damar\"}";
    }

}
