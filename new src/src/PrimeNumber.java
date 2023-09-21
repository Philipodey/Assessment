import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(System.in);
        int number = scanner.nextInt();
//        int divide = number / number;
            int count = 1;
            int factor = 0;
        for ( count = 1; count <= number; count++) {
            if(number % count == 0){
                factor++;
            }
        }
            System.out.println(factor);
          if(factor <= 2){
              System.out.println("it is a prime number");
          } else{
              System.out.println("it is not a prime number");
          }
        }

    }

