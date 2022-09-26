package com.example.davaleba.entity;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "core",name="User")
public class Users {

    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;

    @Column(name="email")
    private String email;

    @ManyToMany
    @Column(name="role")
    private List<Roles> roles;

    @ManyToMany
    @Column(name="rights")
    private List<Rights> rights;

    @OneToOne
    @Column(name="persona")
    private Personas persona;

    public List<Menus> getMenus() {
        return menus;
    }

    public void setMenus(List<Menus> menus) {
        this.menus = menus;
    }

    @ManyToMany
    @Column(name="menus")
    private List<Menus> menus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = this.roles;
    }

    public List<Rights> getRights() {
        return rights;
    }

    public void setRights(List<Rights> rights) {
        this.rights = rights;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }
}
