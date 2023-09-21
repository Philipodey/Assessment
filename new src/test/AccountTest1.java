import java.util.Scanner;

public class AccountTest1 {
    public static void main(String[] args){
        Account1 philip = new Account1();
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter deposit amount: ");
       int depositAmount = scanner.nextInt();
       philip.deposit(depositAmount);
       System.out.printf("The balance is % d", philip.balance());
        System.out.println("\nEnter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();
        philip.withdraw(withdrawalAmount);
        System.out.printf("The balance is %d",philip.balance());
//        System.out.printf("The withdrawal is  ")
    }
}
