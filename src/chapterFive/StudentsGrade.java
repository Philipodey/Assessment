package chapterFive;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your name: ");
            String name = check.nextLine();
            System.out.println("Enter the students grade: ");
            String grade = check.nextLine();

            switch (grade) {
                case "A" -> ++countA;
                case "B" -> ++countB;
                case "C" -> ++countC;
                case "D" -> ++countD;
                default -> System.out.println("Invalid input\nAbi you no get sense!");

            }
        }
        System.out.printf("The number of student that got A is %d%nThe number of student that got B is %d%nThe number of student that got C is %d%nThe number of student that got D is %d",countA,countB,countC, countD);
    }
}