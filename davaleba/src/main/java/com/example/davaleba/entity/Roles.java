package com.example.davaleba.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "core",name="Roles")
public class Roles {
    @Id
    private Integer id;

    @Column(name="mame")
    private String name;

    @ManyToMany
    @Column(name="users")
    private List<Users> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
