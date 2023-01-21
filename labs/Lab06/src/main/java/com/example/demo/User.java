package com.example.demo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Users")
public class User {
    private @Id @GeneratedValue Long id;
    @NotNull
    @Size(min=3,max=30)
    private String name;
    @Email
    private String email;

    public User() {};

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User [" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                "toString()=" + super.toString() +']';
    }
}

