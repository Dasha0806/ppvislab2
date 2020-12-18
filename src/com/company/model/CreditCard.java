package com.company.model;

public class CreditCard {
    private String nameOwner;
    private int CVV;
    private int depositAmount;
    private String numberCard;

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public int getCVV() {
        return CVV;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public String getNumberCard() {
        return numberCard;
    }
}
