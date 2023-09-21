import java.util.Scanner;

public class FactorNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            int count = 1;
            int factor = 0;
          for(count = 1; count <= number; count++)
              if(number % count == 0) {
                factor++;
              }
            System.out.println(factor);
    }
}


