package com.billwang2001.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class NewUserDTO {
    @NotNull
    @NotEmpty
    private String userName;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String machingPassword) {
        this.matchingPassword = machingPassword;
    }
}
