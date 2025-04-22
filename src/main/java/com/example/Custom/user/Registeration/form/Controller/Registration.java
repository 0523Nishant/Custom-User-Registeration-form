package com.example.Custom.user.Registeration.form.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registration {
    @GetMapping("/check")
    public String checking(){
        System.out.print("hello");
        return "hello";
    }


}

