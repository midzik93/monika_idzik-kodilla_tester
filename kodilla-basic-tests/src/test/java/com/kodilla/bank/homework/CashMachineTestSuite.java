package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank(3);
        bank.cashMachines[0].deposit(100);
        bank.cashMachines[1].deposit(250);
        bank.cashMachines[2].withdraw(50);

        assertEquals(300, bank.getTotalBalance());
    }

    @Test
    public void shouldCalculateTotalWithdrawalCount() {
        Bank bank = new Bank(2);
        bank.cashMachines[0].withdraw(50);
        bank.cashMachines[1].withdraw(200);

        assertEquals(2, bank.getTotalWithdrawalCount());
    }

    @Test
    public void shouldCalculateTotalDepositCount() {
        Bank bank = new Bank(2);
        bank.cashMachines[0].deposit(50);
        bank.cashMachines[1].withdraw(200);

        assertEquals(1, bank.getTotalDepositCount());
    }

    @Test
    public void shouldCalculateAverageWithdrawal() {
        Bank bank = new Bank(2);
        bank.cashMachines[0].deposit(100);
        bank.cashMachines[1].withdraw(100);

        assertEquals(100, bank.getAverageWithdrawal());
    }

    @Test
    public void shouldCalculateAverageDeposit() {
        Bank bank = new Bank(3);
        bank.cashMachines[0].deposit(100);
        bank.cashMachines[1].deposit(100);
        bank.cashMachines[1].withdraw(100);

        assertEquals(100, bank.getAverageDeposit());
    }
}
