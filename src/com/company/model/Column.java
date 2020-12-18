package com.company.model;

public class Column {
    private int number;
    private Fuel allFuel;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setAllFuel(Fuel allFuel) {
        this.allFuel = allFuel;
    }

    public int getNumber() {
        return number;
    }

    public Fuel getAllFuel() {
        return allFuel;
    }
}
