package com.niloufar.training.learningspring.Implementation.StockSystem;

import java.util.*;

class StockOrder {
    int units;
    double price;

    public StockOrder(int units, double price) {
        this.units = units;
        this.price = price;
    }
}

class StockTransactionSystem {
    private PriorityQueue<StockOrder> buyers;
    private PriorityQueue<StockOrder> sellers;

    public StockTransactionSystem() {
        buyers = new PriorityQueue<>((a, b) -> Double.compare(b.price, a.price)); // Highest price first
        sellers = new PriorityQueue<>(Comparator.comparingDouble(a -> a.price)); // Lowest price first
    }

    public void placeBuyOrder(int units, double price) {
        buyers.offer(new StockOrder(units, price));
        matchOrders();
    }

    public void placeSellOrder(int units, double price) {
        sellers.offer(new StockOrder(units, price));
        matchOrders();
    }

    private void matchOrders() {
        while (!buyers.isEmpty() && !sellers.isEmpty()) {
            StockOrder buyer = buyers.peek();
            StockOrder seller = sellers.peek();

            if (buyer.price >= seller.price) { // Matching condition
                int transactedUnits = Math.min(buyer.units, seller.units);
                double transactionPrice = seller.price; // Selling price is taken

                System.out.println("Transaction: " + transactedUnits + " units at price " + transactionPrice);

                buyer.units -= transactedUnits;
                seller.units -= transactedUnits;

                if (buyer.units == 0) buyers.poll(); // Remove if fully satisfied
                if (seller.units == 0) sellers.poll(); // Remove if fully satisfied
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        StockTransactionSystem system = new StockTransactionSystem();

        system.placeSellOrder(10, 50.0);
        system.placeSellOrder(5, 55.0);
        system.placeBuyOrder(8, 60.0);
        system.placeBuyOrder(6, 53.0);
    }
}
