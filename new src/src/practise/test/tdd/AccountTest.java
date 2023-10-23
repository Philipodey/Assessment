package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

     class AccountTest{

        @Test
         public void accountCanBeCreated(){
            Account philipAccount = new Account(0);
             assertNotNull(philipAccount);
        }

        @Test
         public void deposit(){
            //Given
            Account philipAccount = new Account(0);
            //when
               philipAccount.deposit(5000);
               //expect
                assertEquals(5000, philipAccount.checkBalance());
        }
        @Test
         public void depositTwice(){
            //Given
              Account philipAccount = new Account(0);
              //when
                philipAccount.deposit(2000);
                //when
                    philipAccount.deposit(5000);
                    //expect
                      assertEquals(7000,philipAccount.checkBalance());
        }
        @Test
          public void withdraw(){
            //Given
              Account philipAccount = new Account(2500);
              //when
                philipAccount.withdraw(1000);
            //expect
              assertEquals(1500, philipAccount.checkBalance());

        }
          @Test
          public void secondWithdrawal(){
              //Given
                Account philipAccount = new Account(2500);
                //when
                  philipAccount.secondWithdraw(3500);
                  //expect
                    assertEquals(2500, philipAccount.checkBalance());
          }
     }
