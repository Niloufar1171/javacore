package com.niloufar.training.learningspring.testingPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test Bank Account Class")
class BankAccountTest {

    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }
    @Test
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, -1000);
        bankAccount.deposite(500);
        assertEquals(900,bankAccount.getBalance());
}
    @Test
    @DisplayName("Withdraw will be become negative")
    public void testWithrawNotStuck(){
        BankAccount bankAccount = new BankAccount(400, -1000);
        bankAccount.deposite(800);
        assertNotEquals(0,bankAccount.getBalance());
    }
    @Test
    @DisplayName("Checking Activation ")
    public void testisActive(){
        BankAccount bankAccount = new BankAccount(50,-1000);
        assertTrue(bankAccount.isAcive());
    }
    @Test
    @DisplayName("Account holder name ")
    public void testHolderName(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        bankAccount.setHolderName("niloufar");
        assertNotNull(bankAccount.getHolderName());
    }
    @Test
    @DisplayName("Testing  ")
    public void testNowithrawBelowMinimum(){
        BankAccount bankAccount = new BankAccount(500,-1000);
        assertThrows(RuntimeException.class, ()->bankAccount.withdraw(2000));
    }
}