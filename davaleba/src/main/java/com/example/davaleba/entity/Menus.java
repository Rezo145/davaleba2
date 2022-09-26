package com.example.davaleba.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "core",name="Menus")
public class Menus {
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @ManyToMany
    @Column(name="users")
    private List<Users> users;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
