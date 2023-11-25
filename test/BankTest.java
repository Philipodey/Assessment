import chapterEight.Account;
import chapterEight.Bank;
import chapterEight.InsufficientFundsException;
import chapterEight.InvalidAmountException;
import chapterEight.NullPointerException;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BankTest {
    @Test
    public void bankAccountCanBeCreatedTest(){
        Bank bank = new Bank("Fcmb");
        Account account = bank.createAccountFor("Martina","Odey", "1234");
        assertEquals(1, bank.getTotalNumberOfAccount());
        assertEquals("1",account.getAccountNumber());
    }
    @Test
    public void TwoOrMOreBankAccountCanBeCreatedTest(){
        Bank uba = new Bank("Fcmb");
        Account account1 = uba.createAccountFor("Favour", "Mbata", "1234");
        Account account2 = uba.createAccountFor("Philip","Odey","1235");
        Account account3 = uba.createAccountFor("Ada","Moses","1265");
        Account account4 =  uba.createAccountFor("Martina","Ode","1764");
        Account account5 =  uba.createAccountFor("Philip","Odey","1999");

        assertEquals(5, uba.getTotalNumberOfAccount());
        assertEquals("1",account1.getAccountNumber());
        assertEquals("2",account2.getAccountNumber());
        assertEquals("3", account3.getAccountNumber());
        assertEquals("4", account4.getAccountNumber());
        assertEquals("5", account5.getAccountNumber());
    }
    @Test
    public void checkAccountBalanceTest(){
        Bank bank = new Bank("First bank");
        Account account = bank.createAccountFor("odey", "odey", "1234");
        assertEquals(0.00,bank.checkBalance("1", "1234"));

    }
    @Test
    public void depositIntoTheBankAccountTest(){
        Bank bank = new Bank("Polaris Bank");
        Account account = bank.createAccountFor("Mbata","Favour", "9999");
        bank.deposit(5000.00,"1");
//        assertEquals(5000.00 ,account.checkBalance("9999"));
        assertEquals(5000.00, bank.checkBalance("1", "9999"));
    }
    @Test
    public void depositAmountLessThanThanZeroTest(){
        Bank bank = new Bank("Zenith bank");
        Account account = bank.createAccountFor("Joe ", "Idoko","1234");
        assertThrows(InvalidAmountException.class, ()-> bank.deposit(-50,"1"));
    }
    @Test
    public void withdrawMoneyFromTheAccount(){
        Bank stanbic = new Bank("Stanbic");
        Account account = stanbic.createAccountFor("Margret","Odey", "1234");
        stanbic.deposit(6000.00,"1");
        stanbic.withdraw(5000.00, "1", "1234");
        assertEquals(1000,stanbic.checkBalance("1","1234"));
    }
    @Test
    public void withdrawAmountLessThanTheBalanceTest(){
        Bank bank = new Bank("stanbic");
        Account account = bank.createAccountFor("Annie","Onyinye", "1234");
        bank.deposit(2000.00, "1");
        assertThrows(InsufficientFundsException.class, ()->  bank.withdraw(4000.00, "1", "1234"));
    }
    @Test
    public void removeAccountTest(){
        Bank bank = new Bank("Gt bank");
        Account account = bank.createAccountFor("Odey","Philip","1234");
        bank.removeAccount("1");
        bank.findAccount("1");
    }
    @Test
    public void transferFundsToAnotherAccountTest(){
        Bank bank = new Bank("Gt bank");
        Account account = bank.createAccountFor("Odey", "Philip","1234");
        bank.deposit(12000.00, "1");
        Account account1 = bank.createAccountFor("joy", "sunday","444");
        bank.transfer(10000.00, "1", "2", "1234");
        assertEquals(10000.00, account1.checkBalance("444"));
    }

}
