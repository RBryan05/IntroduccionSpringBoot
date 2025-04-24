package com.introduccion.springnott.web.springboot_web.models.DTO;

import com.introduccion.springnott.web.springboot_web.models.User;

public class UserDTO {
    private String title;
    private User user;
    private String email;

    public UserDTO() {
    }

    public UserDTO(String title, User user, String email) {
        this.title = title;
        this.user = user;
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return email;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
