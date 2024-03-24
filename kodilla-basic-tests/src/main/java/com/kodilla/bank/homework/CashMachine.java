package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = size;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            int[] newTransaction = new int[size + 1];
            System.arraycopy(transactions, 0, newTransaction, 0, size);
            newTransaction[size] = amount;
            transactions = newTransaction;
            size++;
        }
    }

    public void withdraw(int amount) {
            int[] newTransaction = new int[size + 1];
            newTransaction[size] = -amount;
            transactions = newTransaction;
            size++;
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getTransactionCount() {
        return size;
    }

    public int getWithdrawalCount() {
        int withdrawalcount = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                withdrawalcount++;
            }
        }
        return withdrawalcount;
    }

    public int getDepositCount() {
        int depositCount = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                depositCount++;
            }
        }
        return depositCount;
    }

    public double getAverageWithdrawal() {
        int withdrawalCount = getWithdrawalCount();
        if (withdrawalCount == 0) {
            return 0;
        }

        int totalWithdrawal = 0;
        for (int transaction : transactions) {
            if (transaction < 0) {
                totalWithdrawal += transaction;
            }
        }
        return (double) totalWithdrawal / withdrawalCount;
    }

    public double getAverageDeposit() {
        int depositCount = getDepositCount();
        if (depositCount == 0) {
            return 0;
        }

        int totalDeposit = 0;
        for (int transaction : transactions) {
            if (transaction > 0) {
                totalDeposit += transaction;
            }
        }
        return totalDeposit / depositCount;

    }
}

