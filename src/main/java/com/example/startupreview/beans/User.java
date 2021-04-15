package com.example.startupreview.beans;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(columnDefinition = "varchar(255) default 'ROLE_USER'")
    private String role;

    public User() {
    }

    public User(String name, String email, String password, String username, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.username = username;
        this.role = role;
    }

    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
