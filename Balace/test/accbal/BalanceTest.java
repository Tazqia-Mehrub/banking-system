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
public class BalanceTest {
    
    public BalanceTest() {
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
     * Test of getAccountNum method, of class Balance.
     */
    @Test
    public void testGetAccountNum() {
        System.out.println("getAccountNum");
        Date date = new Date();
        Balance instance = new Balance(1010,500,date);
        long expResult = 1010;
        long result = instance.getAccountNum();
        assertEquals(expResult, result);  
    }

    /**
     * Test of getBalance method, of class Balance.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        Date date = new Date();
        Balance instance = new Balance(1010,500,date);
        double expResult = 500;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setBalance method, of class Balance.
     */
    @Test
    public void testSetBalance() {
        System.out.println("setBalance");
        double balance = 10.0;
        Balance instance = new Balance();
        instance.setBalance(balance);
        double res = instance.getBalance();
        assertEquals(balance, res,0.0);
    }

    /**
     * Test of getDate method, of class Balance.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date date = new Date();
        Balance instance = new Balance(1010,500,date);
        Date expResult = new Date();
        Date result = instance.getDate();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of setDate method, of class Balance.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = new Date();
        Balance instance = new Balance();
        instance.setDate(date);
        Date result = instance.getDate();
        assertEquals(date.toString(), result.toString());
    }

    /**
     * Test of toString method, of class Balance.
     */
    @Test
    public void testToString() {
    System.out.println("toString");
        Balance instance = new Balance();
        String expResult = "A/C no.: 0" +" Current balance: 0.0"
                + " Last date of update: null";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}