package com.example.davaleba.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "core",name="Personas")
public class Personas {
    @Id
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="private_number")
    private Integer privateNumber;

    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @OneToOne
    @Column(name="organization")
    private Organizations organization;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPrivateNumber() {
        return privateNumber;
    }

    public void setPrivateNumber(Integer privateNumber) {
        this.privateNumber = privateNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Organizations getOrganization() {
        return organization;
    }

    public void setOrganization(Organizations organization) {
        this.organization = organization;
    }
}
