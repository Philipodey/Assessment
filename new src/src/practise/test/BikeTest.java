import javax.security.auth.kerberos.KerberosTicket;
import java.util.Scanner;

public class BikeTest {
    public static void main(String[] args){
        Bike toyota = new Bike();
        Scanner scanner = new Scanner(System.in);
        System.out.print("The name is : ");
        String name = scanner.nextLine();
        toyota.setName("toyota");
        System.out.print("\tand isOn is: ");
        boolean isOn = scanner.nextBoolean();
        toyota.isOn();

        System.out.printf("\nThe name of bike is\t%s and isOn is\t%b",toyota.getName(),toyota.isOn());

       // System.out.print("\tand isOn is: ");
//      boolean isOn = scanner.nextBoolean();
//        toyota.isOn();
//        toyota.getName();
//        System.out.printf("%s The name of bike is\t%s\tand isOn is\t%b", toyota.getName(), toyota.isOn());
    }
}
