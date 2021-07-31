package com.example.site.User;

import com.example.site.entity.Role;
import com.example.site.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;


@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String registerForm(Model model)
    {
        model.addAttribute("user", new UserDto());
        return "register";
    }


    @PostMapping("/register")
    public String registerSubmit(@ModelAttribute UserDto userDto)
    {
        User newUser = new User();
        Set<Role> addRole = new HashSet<Role>();
        addRole.add(roleRepo.findByName("USER"));

        newUser.setEmail(userDto.getEmail());
        newUser.setPassword(passwordEncoder.encode(userDto.getPassword()));
        newUser.setFname(userDto.getFname());
        newUser.setLname(userDto.getLname());
        newUser.setAddress(userDto.getAddress());
        newUser.setPhone(userDto.getPhone());
        newUser.setEnabled(true);
        newUser.setRoles(addRole);
        userRepo.save(newUser);
        return "registrationResult";

    }
}
