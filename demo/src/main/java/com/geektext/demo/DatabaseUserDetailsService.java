package com.geektext.demo;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DatabaseUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    private UserDetailsMapper userDetailsMapper;

    public DatabaseUserDetailsService(UserRepository userRepository,
                                      UserDetailsMapper userDetailsMapper) {
        this.userRepository = userRepository;
        this.userDetailsMapper = userDetailsMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username);
        if (user == null)
        {
            throw new UsernameNotFoundException("User not found");
        }

        return userDetailsMapper.toUserDetails(user);
    }
}