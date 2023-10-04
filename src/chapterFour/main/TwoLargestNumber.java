package chapterFour.main;

import java.util.Scanner;

public class TwoLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        int secondLargest = 0;
        int frequently = 0;
        for (int count = 0; count <= 3; count++) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if(secondLargest > number){
                secondLargest = number;
            }
            if (frequently < count){
                frequently = number;
            }
        }
        System.out.printf("The largest number is %d\nThe second largest number is %d", largest, secondLargest);
        System.out.printf("\nThe most occur number is %d ",frequently);
    }
}

