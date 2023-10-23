package chapterFour.tdd;

import chapterFour.main.CreditLimitCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditLimitCalculatorTest {
    @Test
    public void testAccountNumber(){
        CreditLimitCalculator spar = new CreditLimitCalculator();
        int account = spar.accountNumber(234567891);
        assertEquals(234567891,account);
    }
    @Test
    public void testBalanceAtTheBeginOfTheMonth(){
        CreditLimitCalculator spar = new CreditLimitCalculator();
        int beginBalance = spar.balance(50000);
        assertEquals(50000, beginBalance);
    }
    @Test
    public void testItemsChargedByCustomerThisMonth(){
        CreditLimitCalculator spar = new CreditLimitCalculator();
        int itemCharged = spar.charges(10000);
        assertEquals(10000, itemCharged);
    }
    @Test
    public void testTotalCreditApplied(){
        CreditLimitCalculator spar = new CreditLimitCalculator();
        int creditApplied = spar.creditApplied(30000);
        assertEquals(30000, creditApplied);
    }
    @Test
    public void testAllowedCreditLimit(){
        CreditLimitCalculator spar = new CreditLimitCalculator();
        int allowedCredit = spar.creditLimit(50000);
            assertEquals(50000, allowedCredit);
        }
    @Test
    public void newBalance(){
        CreditLimitCalculator spar = new CreditLimitCalculator();
        spar.setNewBalance(5000, 1000, 3000);
           assertEquals(3000, spar.getNewBalance());

    }
}



