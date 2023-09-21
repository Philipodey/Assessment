import java.text.SimpleDateFormat;
//import java.time.LocalDa
import java.util.Date;
import java.util.Scanner;

public class HeartRateTest {
    public static  void main(String[] args) {
        HeartRates casio = new HeartRates("Scott", "Nails", 12, 1998, 20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        casio.setFirstName(firstName);
        System.out.printf("The first name is %s", casio.getFirstName());
        System.out.println();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        casio.setLastName(lastName);
        System.out.printf("Last is %s", casio.getLastName());
        System.out.printf("\nThe name is %s %s", casio.getFirstName(), casio.getLastName());

        casio.setAge();
        System.out.printf("\nThe age is %d",casio.getAge());

        casio.setMaximumHeartRate();
        System.out.printf("\nThe maximumHeartRate is %d",casio.getMaximumHeartRate());

        System.out.println("\nEnter the physical intensity: ");
        double physicalIntensity = scanner.nextDouble();
        casio.setTargetHeartRate(physicalIntensity);
//        System.out.printf("\nThe target heart rate is %d", casio.getTargetHeartRate());

    }

}
