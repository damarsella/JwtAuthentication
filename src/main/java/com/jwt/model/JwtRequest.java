package com.jwt.model;

public class JwtRequest {
    String username;
    String password;

    //generate class
    public JwtRequest() {
    }

    //generate class and value
    public JwtRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //getter and setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //to string
    @Override
    public String toString() {
        return "JwtRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
