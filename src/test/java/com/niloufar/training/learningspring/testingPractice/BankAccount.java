package com.niloufar.training.learningspring.testingPractice;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isAcive = true;

    public boolean isAcive() {
        return isAcive;
    }

    public void setAcive(boolean acive) {
        isAcive = acive;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    private String holderName;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public double withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
            return amount;
        }
         else
            throw new RuntimeException();
    }
    public double deposite (double amount){
        return balance += amount;
}

}
