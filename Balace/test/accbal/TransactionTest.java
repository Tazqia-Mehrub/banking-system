/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accbal;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nama
 */
public class TransactionTest {
    
    public TransactionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of transaction method, of class Transaction.
     */
    @Test
    public void testTransaction() {
        System.out.println("transaction");
        long accountNum = 1010;
        Date date = new Date();
        Balance balance = new Balance(accountNum,500,date);
        Bank bank = new Bank();
        bank.newAccount(balance);
        String transactionType = "withdraw";
        double amount = 50;
        Transaction instance = new Transaction(bank);
        Balance bal = instance.transaction(accountNum, transactionType, amount);
        double result = bal.getBalance();
        assertEquals(450, result,0.0);
    }
    
}
