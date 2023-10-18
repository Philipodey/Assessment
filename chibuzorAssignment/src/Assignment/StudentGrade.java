package Assignment;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        String student = collectInput("How many student do you have: ");
        while (!student.matches("\\d+")) {
            student = collectInput("How many student do you have: ");
        }

        String subjects = collectInput("How many subject do they offer: ");
        while (!student.matches("\\d+")) {
            subjects = collectInput("How many subject do they offer: ");
        }
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully
                """);
        int studentConvert = Integer.parseInt(student);
        int subjectConvert = Integer.parseInt(subjects);

        String [][] studentGrade = new String[studentConvert][subjectConvert];
        heading(studentConvert,subjectConvert);


    }

    public static String collectInput(String prompt) {
        Scanner check = new Scanner(System.in);
        System.out.println(prompt);
        return check.nextLine();
    }

    public static void heading(int studentsConvert, int subjectConvert) {
        Scanner check = new Scanner(System.in);
        String [][] array = new String[studentsConvert][subjectConvert];
        int[][] convertArray = new int[studentsConvert][subjectConvert];
            int row = 0;
            int column = 0;
        for (row = 0; row < convertArray.length; row++) {
            System.out.println("Entering score for student " + (row + 1) + "\n");
            for (column = 0; column < convertArray[row].length; column++) {
                System.out.print("Enter score for subject "+ "\t" + (column + 1) + " : ");
                array[row][column] = check.nextLine();
                System.out.println("""
                                      Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>
                                      Saved successfully
                       """);
                while (!array[row][column].matches("\\d+")){
                    System.out.print("Score " + " " + (column + 1) + " : ");
                    array[row][column] = check.nextLine();
                }
                convertArray[row][column] = Integer.parseInt(array[row][column]);
            }
        }
        System.out.printf("%-15s","Students");
        for (int heading = 0; heading < studentsConvert; heading++) {
            System.out.printf("%-13s","SUB"+(heading+1));
        }
        System.out.printf("%-13s%-12s%-12s","TOT","AVE","POS");
        int total = 0;
        double average = 1;
        int count = 1;
        int position = 0;
        int largest = 0;
        int increaseLargest = 0;
        System.out.println();
        for (int tableRow = 0; tableRow < convertArray.length; tableRow++) {
            System.out.println();
            System.out.printf("%-15s","STUDENT"+(tableRow+1));

            for (int tableColumn = 0; tableColumn < convertArray[tableRow].length; tableColumn++) {

                System.out.printf("%-13s",convertArray[tableRow][tableColumn]);
                total += convertArray[tableRow][tableColumn];

            }
            average = (double) total / convertArray[tableRow].length;
            System.out.printf("%-13s%-12s", total, average);
//            total = 0;
//            average = 0;
        }



    }
}
