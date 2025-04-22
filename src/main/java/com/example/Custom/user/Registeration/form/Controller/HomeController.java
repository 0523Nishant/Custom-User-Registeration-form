package com.example.Custom.user.Registeration.form.Controller;

import com.example.Custom.user.Registeration.form.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.Custom.user.Registeration.form.Entity.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @Autowired
    public UserRepository u1;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }
    @PostMapping("/register")
    public String submitform(@ModelAttribute("user") User user,Model model){

        System.out.println("ID: " + user.getId());
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Gender: " + user.getGender());
        System.out.println("Nationality: " + user.getNationality());

        u1.save(user);
        return "Success";
    }
}
