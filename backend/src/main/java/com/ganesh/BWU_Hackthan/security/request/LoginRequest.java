package com.ganesh.BWU_Hackthan.security.request;


import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public LoginRequest() {
    }

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
}
