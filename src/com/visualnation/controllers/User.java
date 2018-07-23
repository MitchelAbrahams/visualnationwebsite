package com.visualnation.controllers;

import com.visualnation.validation.IsEmail;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
    private String username;

    @NotNull(message = "email is required")
    @Size(min = 4, message = "email must be longer thand 4 characters")
    @IsEmail(value = "@", message = "Please enter a correct email format")
    private String email;
    private String country;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
