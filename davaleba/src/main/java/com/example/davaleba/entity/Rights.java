package com.example.davaleba.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "core",name="Rights")
public class Rights {
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @ManyToMany
    @Column(name="users")
    public List<Users> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
