package com.geektext.demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Controller
public class ProfileEditController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/profile")
    public String profileForm(Model model)
    {
        model.addAttribute("user", new UserDto());
        return "profile";
    }


    @PostMapping("/profile")
    public String profileSubmit(@ModelAttribute UserDto userDto, @AuthenticationPrincipal UserDetails userDetails)
    {
        User user = userRepo.findByEmail(userDetails.getUsername());

        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setFname(userDto.getFname());
        user.setLname(userDto.getLname());
        user.setAddress(userDto.getAddress());
        user.setPhone(userDto.getPhone());
        userRepo.save(user);
        return "profile";

    }
}
