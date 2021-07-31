package com.example.site.User;

import com.example.site.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<Role, String> {

    Role findByName(String name);
    Role findById(Integer Id);

}
