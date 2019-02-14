package com.xj.bean;

public class User {
    private String name;
    private  String passward;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public User() {
    }

    public User(String name, String passward) {
        this.name = name;
        this.passward = passward;
    }
}
