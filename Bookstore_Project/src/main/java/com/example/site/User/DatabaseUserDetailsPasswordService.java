package com.example.site.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class DatabaseUserDetailsPasswordService implements UserDetailsPasswordService
{
    private final UserRepository userRepository;

    private final UserDetailsMapper userDetailsMapper;

    public DatabaseUserDetailsPasswordService(UserRepository userRepository,
                                              UserDetailsMapper userDetailsMapper)
    {
        this.userRepository = userRepository;
        this.userDetailsMapper = userDetailsMapper;
    }

    public UserDetails updatePassword(UserDetails user, String newPass)
    {
        com.geektext.demo.User updateUser = userRepository.findByEmail(user.getUsername());
        updateUser.setPassword(newPass);

        return userDetailsMapper.toUserDetails(updateUser);
    }
}