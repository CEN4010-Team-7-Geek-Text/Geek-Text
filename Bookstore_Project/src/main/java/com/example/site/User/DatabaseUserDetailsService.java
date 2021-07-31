package com.example.site.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DatabaseUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    private UserDetailsMapper userDetailsMapper;

    public void DatabaseUserDetailsService(UserRepository userRepository,
                                      UserDetailsMapper userDetailsMapper) {
        this.userRepository = userRepository;
        this.userDetailsMapper = userDetailsMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        com.geektext.demo.User user = userRepository.findByEmail(username);
        return userDetailsMapper.toUserDetails(user);
    }
}