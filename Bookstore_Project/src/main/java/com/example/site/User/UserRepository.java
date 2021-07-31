package com.example.site.User;

import com.example.site.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, String> {

    User findByEmail(String email);
    User findById(Integer Id);

}
