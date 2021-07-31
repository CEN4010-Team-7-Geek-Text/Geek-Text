package com.example.site.entity;

import com.example.site.entity.User;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name = "authorities")
 public class Role {
    @Id
     private Integer id;

    private String name;

    @ManyToMany(mappedBy = "roles")
     private Set<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<User> getUsers() {
        return users;
    }
}