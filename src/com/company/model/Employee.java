package com.company.model;

public class Employee {
    private String name;
    private  int pinKod;
    private int age;
    private String telephoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPinKod(int pinKod) {
        this.pinKod = pinKod;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPinKod() {
        return pinKod;
    }

    public int getAge() {
        return age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
