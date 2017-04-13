package com.htisolutions.jsonparser.models;

import java.util.List;

public class Student {

    private Integer id;
    private String forename;
    private String surname;
    private Boolean fullTime;
    private Address address;
    private List<Module> modules;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getForename() {
        return this.forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getFullTime() {
        return this.fullTime;
    }
    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Module> getModules() {
        return this.modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
