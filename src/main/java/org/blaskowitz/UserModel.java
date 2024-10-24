package org.blaskowitz;

import java.io.Serializable;

public class UserModel implements Serializable {
    private final String username;
    private final String password;

    public UserModel(String userName, String password) {
        this.username = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
