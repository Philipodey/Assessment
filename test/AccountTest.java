import chapterEight.bank.serverClass.Account;
import chapterEight.bank.exception.InsufficientFundsException;
import chapterEight.bank.exception.InvalidAmountException;
import chapterEight.bank.exception.InvalidPinException;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest {
    private Account account;
    @BeforeTest
    public void bankTestFirst(){
        account = new Account();
    }
    @Test
    public void accountExistTest(){
        Account account = new Account();
        assertNotNull(account);
    }
    @Test
    public void depositAmountGreaterThanZeroTest(){
        account = new Account(2500,"1234");
        assertEquals(2500,account.checkBalance("1234"));
    }
    @Test
    public void depositAmountLessThanZeroThrowExceptionTest(){
        account = new Account(-2300);
        assertThrows(InvalidAmountException.class, ()-> account.deposit(-2300));
    }
    @Test
    public void withdrawAmountGreaterThanZeroTest(){
        account = new Account(5000.00,"1234");
        account.withdraw(2500.00, "1234");
        assertEquals(2500, account.checkBalance("1234"));
    }
    @Test
    public void withdrawAmountUsingTheWrongPinTest(){
        account = new Account(5000.00,"1235");
        assertThrows(InvalidPinException.class, ()-> account.withdraw(2000,"1234"));
        assertEquals(5000.00, account.checkBalance("1235"));
    }
    @Test
    public void withdrawInvalidAmountLessThanTheBalanceTest(){
        account = new Account(2000.00,"1234");
        assertThrows(InsufficientFundsException.class, ()-> account.withdraw(4000.00, "1234"));
        assertEquals(2000, account.checkBalance("1234"));
    }


}
