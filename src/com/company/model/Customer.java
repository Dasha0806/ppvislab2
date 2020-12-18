package com.company.model;

public class Customer {
    private String name;
    private  int balance;
    private int age;
    private String telephoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
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

    public int getBalance() {
        return balance;
    }

    public int getAge() {
        return age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
