package com.example.ticketmanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "enabled", nullable = false)
    private boolean enabled;

    @Column(name = "isAdmin", nullable = false)
    private boolean isAdmin;

    public User() {
        // Mặc định giá trị cho enabled là true (1) khi tạo mới đối tượng User
        this.enabled = true;
    }
    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.enabled = true; // Mặc định giá trị cho enabled là true (1) khi tạo mới đối tượng User
        this.isAdmin = isAdmin;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}