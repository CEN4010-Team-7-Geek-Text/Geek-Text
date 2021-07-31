package com.example.site.User;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsMapper
{
    UserDetails toUserDetails(com.geektext.demo.User user)
    {
        return org.springframework.security.core.userdetails.User.withUsername(user.getEmail())
        .password(user.getPassword()).roles(user.getRoles().toArray(String[]::new)).build();
    }
}