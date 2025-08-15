package com.him.project_him.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import java.util.UUID;
import com.him.project_him.enums.Role;


@Table("USERS")
public class User {

    @Id
    private UUID id;

    private String username;
    private String password;
    private String email;
    private String name;
    private Role role;

    public User() {}

    public User(UUID id, String username, String password, String email, String name, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.name = name;
        this.role = role;
    }

    public UUID getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public Role getRole() { return role; }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}