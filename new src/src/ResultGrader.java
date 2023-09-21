import java.util.Scanner;

public class ResultGrader {
    public static void main(String[] args) {
//        input any number betweeen 0 and 100
//        if the number is between 90 and 100
//                print "A"
//        if the number is between 80 and 89
//                print "B"
//        if the number is between 70 and 79
//                print "C"
//         if the number is between 60 and 69
//                print "D"
//        if the number is less than 60
//                print "F"

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any between 0 t0 100: ");
        int number = input.nextInt();

        if(number == 59 || number <= 0){
            System.out.println("F");
        }
        else if (number == 60 || number <= 69) {
            System.out.println("D");
        }
        else if(number == 70 || number <= 79){
            System.out.println("C");
        }
        else if(number == 80 || number <= 89){
            System.out.println("B");
        }
        else if(number == 90 || number <= 100){
            System.out.println("A");
        }
    }
}
