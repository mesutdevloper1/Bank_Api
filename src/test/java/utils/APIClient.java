package utils;

import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class APIClient {
    private static int lastResponseCode;

    public static String authenticate(String username, String password) {
        // Simulate an API call
        lastResponseCode = 200; // Mock success
        return "secure_token_12345"; // Mock token
    }

    public static int getLastResponseCode() {
        return lastResponseCode;
    }

    public static int getTransactionHistory(String token) {
        // Simulate a token validation and history fetch
        lastResponseCode = 200; // Mock success
        return lastResponseCode;
    }

    public static boolean isTransactionHistoryValid(String token) {
        // Simulate validation
        return token.startsWith("secure");
    }

    public static List<Transaction> fetchTransactions(String token) {
        // Simulate fetching transaction data
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("123", 100.0, "2023-12-01"));
        transactions.add(new Transaction("124", 50.0, "2023-12-02"));
        return transactions;
    }
}