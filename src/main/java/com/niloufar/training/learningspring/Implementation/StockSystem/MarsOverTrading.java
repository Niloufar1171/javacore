package com.niloufar.training.learningspring.Implementation.StockSystem;

import java.util.*;

class StockMatchingSystem {
    private Map<String, PriorityQueue<Stock>> buyOrders;
    private Map<String, PriorityQueue<Stock>> sellOrders;

    public StockMatchingSystem() {
        buyOrders = new HashMap<>();
        sellOrders = new HashMap<>();
    }

    public void processTransactions(List<Stock> transactions) {
        for (Stock stock : transactions) {
            if (stock.isBuyOrder) {
                buyOrders.putIfAbsent(stock.name, new PriorityQueue<>((a, b) -> Double.compare(b.price, a.price)));
                buyOrders.get(stock.name).offer(stock);
            } else {
                sellOrders.putIfAbsent(stock.name, new PriorityQueue<>((a, b) -> Double.compare(b.price, a.price)));
                sellOrders.get(stock.name).offer(stock);
            }
            matchOrders(stock.name);
        }
    }

    private void matchOrders(String stockName) {
        if (!buyOrders.containsKey(stockName) || !sellOrders.containsKey(stockName)) return;

        PriorityQueue<Stock> buyers = buyOrders.get(stockName);
        PriorityQueue<Stock> sellers = sellOrders.get(stockName);

        while (!buyers.isEmpty() && !sellers.isEmpty()) {
            Stock buyer = buyers.peek();
            Stock seller = sellers.peek();

            if (buyer.price >= seller.price) { // Match found
                int transactedQuantity = Math.min(buyer.quantity, seller.quantity);
                double transactionPrice = Math.max(buyer.price, seller.price);

                System.out.println("Transaction: " + transactedQuantity + " units of " + stockName + " at price " + transactionPrice);

                buyer.quantity -= transactedQuantity;
                seller.quantity -= transactedQuantity;

                if (buyer.quantity == 0) buyers.poll(); // Remove if fully satisfied
                if (seller.quantity == 0) sellers.poll(); // Remove if fully satisfied
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        List<Stock> transactions = Arrays.asList(
                new Stock("AAPL", 150.0, 10, true),
                new Stock("AAPL", 155.0, 5, false),
                new Stock("AAPL", 148.0, 7, true),
                new Stock("AAPL", 152.0, 6, false)
        );

        StockMatchingSystem system = new StockMatchingSystem();
        system.processTransactions(transactions);
    }
}
