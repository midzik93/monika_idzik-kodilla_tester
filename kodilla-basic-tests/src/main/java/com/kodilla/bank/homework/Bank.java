package com.kodilla.bank.homework;

public class Bank {

    CashMachine[] cashMachines;

    public Bank(int numberOfCashMachines){
        this.cashMachines=new CashMachine[numberOfCashMachines];
        for ( int i=0; i<numberOfCashMachines; i++){
            this.cashMachines[i]= new CashMachine();
        }
    }
    public int getTotalBalance() {
        int totalBalance=0;
        for (CashMachine cashMachine: cashMachines){
            totalBalance += cashMachine.getBalance();
        }
        return totalBalance;

    }
    public int getTotalWithdrawalCount() {
        int totalWithdrawalCount = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalWithdrawalCount += cashMachine.getWithdrawalCount();
        }
        return totalWithdrawalCount;

    }
    public int getTotalDepositCount() {
        int totalDepositCount=0;
        for (CashMachine cashMachine: cashMachines){
            totalDepositCount+=cashMachine.getDepositCount();
        }
        return totalDepositCount;
    }
    public int getAverageWithdrawal() {
        int totalWithdrawalCount = getTotalWithdrawalCount();
        if (totalWithdrawalCount == 0) {
            return 0;
        }

        int totalWithdrawal = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalWithdrawal += cashMachine.getAverageWithdrawal();
        }

        return totalWithdrawal / totalWithdrawalCount;
    }

    public int getAverageDeposit() {
        int totalDepositCount = getTotalDepositCount();
        if (totalDepositCount == 0) {
            return 0;
        }

        int totalDeposit = 0;
        for (CashMachine cashMachine : cashMachines) {
            totalDeposit += cashMachine.getAverageDeposit();
        }

        return totalDeposit / totalDepositCount;
    }
}