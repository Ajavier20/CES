package org.example.model;

import java.util.ArrayList;

public class DigitalWallet {
    private ArrayList<Cryptocurrency> cryptocurrencies;
    private double moneyBalance;

    public DigitalWallet() {
        this.cryptocurrencies = new ArrayList<>();
        this.moneyBalance = 0.0;
    }

    public double getMoneyBalance() {
        return moneyBalance;
    }
    public ArrayList<Cryptocurrency> getCryptocurrencies() {
        return cryptocurrencies;
    }

    public void addCryptocurrency(Cryptocurrency cryptocurrency) {
        this.cryptocurrencies.add(cryptocurrency);
    }

    public void depositMoney(double amount) {
        moneyBalance += amount;
    }

    public boolean withdrawMoney(double amount) {
        if (amount <= moneyBalance) {
            moneyBalance -= amount;
            return true;
        }
        return false;
    }

}
