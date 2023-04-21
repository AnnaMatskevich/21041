package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class user  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    public user() {
    }
    public user(String firstname, String lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public long getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname=firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname=lastname;
    }

    @Override
    public String toString() {
        return "user [firstname=" + firstname + ", lastname=" + lastname+"]";
    }
}
