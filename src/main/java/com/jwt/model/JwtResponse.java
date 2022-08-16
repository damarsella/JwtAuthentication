package com.jwt.model;

public class JwtResponse {
    String token;

    //generate class
    public JwtResponse() {
    }

    //generate value
    public JwtResponse(String token) {
        this.token = token;
    }

    //getter and setter
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
