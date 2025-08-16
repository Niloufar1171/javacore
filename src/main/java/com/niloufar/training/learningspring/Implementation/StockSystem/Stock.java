package com.niloufar.training.learningspring.Implementation.StockSystem;

public class Stock {
    String name;
    double price;
    int quantity;
    boolean isBuyOrder;

    public Stock(String name, double price, int quantity, boolean isBuyOrder) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isBuyOrder = isBuyOrder;
    }
}
