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
 * @author Minhaj
 */
public class BankTest {
    
    public BankTest() {
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
     * Test of newAccount method, of class Bank.
     */
    @Test
    public void testNewAccount() {
        System.out.println("newAccount");
        Date date = new Date();
        Balance balance = new Balance(1010,500,date);
        Bank instance = new Bank();
        instance.newAccount(balance);
        boolean result = instance.balanceList.contains(balance);
        assertEquals(true, result);
    }

    /**
     * Test of searchAccount method, of class Bank.
     */
    @Test
    public void testSearchAccount() {
        System.out.println("searchAccount");
        long accountNum = 1010;
        Date date = new Date();
        Balance balance = new Balance(accountNum,500,date);
        Bank instance = new Bank();
        instance.newAccount(balance);
        Balance result = instance.searchAccount(accountNum);
        assertEquals(balance.toString(), result.toString());
    }

    /**
     * Test of getBalanceListSize method, of class Bank.
     */
    @Test
    public void testGetBalanceListSize() {
        System.out.println("getBalanceListSize");
        Bank instance = new Bank();
        long expResult = 0L;
        long result = instance.getBalanceListSize();
        assertEquals(expResult, result);
    }
}
