/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author touhe
 */
public class BankAccountTest {
    
    public BankAccountTest() {
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
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount("x", 500);
        double expResult = 500;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testGetBalance2() {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount("y", 1000);
        double expResult = 1000;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 0.0;
        BankAccount instance = new BankAccount("x", 200);
        instance.withdraw(100);
        double expResult = 100;
        double result = instance.getBalance();
        assertEquals(expResult, result,0.0);
    }
    @Test
    public void testWithdraw2() {
        System.out.println("withdraw");
        double amount = 0.0;
        BankAccount instance = new BankAccount("y", 500);
        instance.withdraw(200);
        double expResult = 300;
        double result = instance.getBalance();
        assertEquals(expResult, result,0.0);
    }
    @Test
    public void testWithdraw3() {
        System.out.println("withdraw");
        double amount = 0.0;
        BankAccount instance = new BankAccount("z", 700);
        instance.withdraw(900);
        double expResult = 0;
        double result = instance.getBalance();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of deposite method, of class BankAccount.
     */
    @Test
    public void testDeposite() {
        System.out.println("deposite");
        double amount = 0.0;
        BankAccount instance = new BankAccount("x", 500);
        instance.deposite(100);
        double expResult = 600;
        double result = instance.getBalance();
        assertEquals(expResult, result,0.0);
    }
    @Test
    public void testDeposite2() {
        System.out.println("deposite");
        double amount = 0.0;
        BankAccount instance = new BankAccount("y", 1500);
        instance.deposite(150);
        double expResult = 1650;
        double result = instance.getBalance();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of transfer method, of class BankAccount.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer2");
        BankAccount from = new BankAccount("x", 1000);
        BankAccount to = new BankAccount("y", 5000);
        double amount = 100.0;
        double expResult = 5100;
        double result = from.transfer(to, amount);
        assertEquals(expResult, result,0.0);
        
    }
    @Test
    public void testTransfer2() {
        System.out.println("transfer2");
        BankAccount from = new BankAccount("y", 550);
        BankAccount to = new BankAccount("z", 550);
        double amount = 100.0;
        double expResult = 650;
        double result = from.transfer(to, amount);
        assertEquals(expResult, result,0.0);
        
    }
    @Test
    public void testTransfer3() {
        System.out.println("transfer2");
        BankAccount from = new BankAccount("y", 500);
        BankAccount to = new BankAccount("z", 500);
        double amount = 600.0;
        double expResult = 0;
        double result = from.transfer(to, amount);
        assertEquals(expResult, result,0.0);
        
    }
    
}
