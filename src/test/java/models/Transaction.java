package models;

public class Transaction {
    private String id;
    private double amount;
    private String date;

    public Transaction(String id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}