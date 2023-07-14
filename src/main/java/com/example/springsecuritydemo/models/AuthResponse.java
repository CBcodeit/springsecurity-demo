package com.example.springsecuritydemo.models;

public class AuthResponse {
    private String jwt;
    public AuthResponse(){

    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
