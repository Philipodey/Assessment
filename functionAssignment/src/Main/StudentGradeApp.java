package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGradeApp {
    public static void main(String[] args) {
        int[][] elements = elementsInTheArray(2,2);

        ArrayList<Integer> name = getTotalList(elements);
        ArrayList<Double> average = getAverageList(name,2);
        ArrayList<String> positionList = addPosition(name);
//        System.out.println(totalList);
//        System.out.println(totalList.size());


        for (int index1 = 0; index1 < elements.length; index1++) {
            System.out.printf("%-16s","Student" + (index1 + 1));
            for (int index2 = 0; index2 < elements[index1].length; index2++) {

                System.out.printf("%-15d",elements[index1][index2]);
            }
          System.out.print(totalList.get(index1));
            System.out.printf("%15s",averageList.get(index1));
            System.out.printf("%13s", addPositionList.get(index1));
            System.out.println();
        }

    }

    public static int[][] numberOfRowsAndColumns(int numberOfStudents, int numberOfSubjects){

    return new int[numberOfStudents][numberOfSubjects];
    }
    public static int numberOfStudents = 2;
    public static ArrayList<ArrayList<Integer>> elementsInAnArrayList = new ArrayList<ArrayList<Integer>>();
    public static int[][] elementsInTheArray(int numberOfStudent, int numberOfScores){
        Scanner check = new Scanner(System.in);
        String[][] studentGrade = new String[numberOfStudent][numberOfScores];
        int [][] studentsGrade = new int[numberOfStudent][numberOfScores];
        ArrayList<Integer> scores = new ArrayList<>();
        for (int row = 0; row < numberOfStudent; row++) {
            for (int column = 0; column < numberOfScores; column++) {
                System.out.println("Entering score for student " + (row +1));
                System.out.println("Enter the score for subject " + (column + 1)+": ");
                studentGrade[row][column] = check.nextLine();
                storing();
                while (!(studentGrade[row][column]).matches("\\d+")){
                    System.out.println("Invalid number!\nEnter a valid number of positive score" +
                            "\nScores should not be less than 0 and greater than 100: ");
                    studentGrade[row][column] = check.nextLine();
                        storing();
                }
                studentsGrade[row][column] = Integer.parseInt(studentGrade[row][column]);
                scores.add(studentsGrade[row][column]);
            }
            elementsInAnArrayList.add(scores);
            storing();
        }
        minusDisplay(105);
        System.out.printf("%-15s", "STUDENT");
        for (int tableHead = 0; tableHead < numberOfScores; tableHead++) {
            System.out.printf("%-15s","SUB"+(tableHead+1));
        }
        System.out.printf("%-15s","TOT");
        System.out.printf("%-14s","AVE");
        System.out.printf("%-13s","POS\n");
        minusDisplay(105);


        return studentsGrade ;
    }

    public static ArrayList<Integer> totalList = new ArrayList<>();
    public static ArrayList<Integer> getTotalList(int[][] scores){
        for (int count = 0; count< scores.length;count++){
            int total = 0;
            for (int counter = 0; counter < scores[count].length; counter++) {
                total += scores[count][counter];
            }
            totalList.add(total);
        }
        return totalList;
    }
    public static ArrayList<Double> averageList = new ArrayList<>();
    public static ArrayList<Double> getAverageList(ArrayList<Integer> scoreList, int scores){
        for (Integer count: scoreList) {
            double average = (double)count / scores;
            averageList.add(average);
        }
        return averageList;
    }
    public static ArrayList<ArrayList<Integer>> subjectList = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> getSubjectList(ArrayList<ArrayList<Integer>> subject){
        for (int index = 0; index < subject.get(0).size(); index++) {
            ArrayList<Integer> subjectCount = new ArrayList<>();
            for (int index2 = 0; index2 < subject.size(); index2++) {
                subjectCount.add(subject.get(index).get(index2));
            }
            subjectList.add(subjectCount);
        }
        return subjectList;
    }
    public static ArrayList<Integer> totalSubjectList = new ArrayList<Integer>();
    public static ArrayList<Integer> getTotalSubjectList(ArrayList<ArrayList<Integer>> subject){
        for (int index = 0; index < subject.get(0).size(); index++) {
            int totalSub = 0;
            for (int index2 = 0; index2 < subject.size(); index2++) {
                totalSub += subject.get(index).get(index2);
            }
            totalSubjectList.add(totalSub);
        }
        return totalSubjectList;
    }

    public static ArrayList<Double> averageSubjectList = new ArrayList<>();
    public static ArrayList<Double> getAverageSubjectList(ArrayList<Integer> subjectList, int subject){
        for (Integer count:subjectList) {
            double average = (double) count / subject;
            averageSubjectList.add(average);
        }
        return averageSubjectList;
    }
    public static ArrayList<Integer> maximumScoreList = new ArrayList<>();
    public static ArrayList<Integer> maximumScore(ArrayList<ArrayList<Integer>> scores){
        for (int index1 = 0; index1 < scores.get(0).size(); index1++) {
            int max = 0;
            for (ArrayList<Integer> index2 : scores) {
                if (index2.get(index1) > max) {
                    max = index2.get(index1);
                }
            }
            maximumScoreList.add(max);
        }
        return maximumScoreList;
    }
    public static ArrayList<Integer> minimumScoreList = new ArrayList<>();
    public static ArrayList<Integer> getMinimumScoreList(ArrayList<ArrayList<Integer>> scores) {
        for (int index1 = 0; index1 < scores.get(0).size(); index1++) {
            int min = Integer.MAX_VALUE;
            for (ArrayList<Integer> index2 : scores) {
                if (index2.get(index1) < min) {
                    min = index2.get(index1);
                }
            }
            minimumScoreList.add(min);
        }
        return minimumScoreList;
    }

    public static ArrayList<Integer> passList = new ArrayList<>();

    public static ArrayList<Integer> pass(ArrayList<ArrayList<Integer>> scores){
        for (int count = 0; count < scores.get(0).size(); count++) {
            int pass = 0;
            for (ArrayList<Integer> counter : scores) {
               if (counter.get(count) > 50){
                   ++pass;
               }
            }
            passList.add(pass);
        }
        return passList;
    }

    public static ArrayList<Integer> failList = new ArrayList<>();

    public static ArrayList<Integer> fail(ArrayList<ArrayList<Integer>> scores){
        for (int count = 0; count < scores.get(0).size(); count++) {
            int fail = 0;
            for (ArrayList<Integer> counter : scores) {
                if (counter.get(count) < 50) {
                    ++fail;
                }
            }
            failList.add(fail);
        }
        return failList;
    }
    public static ArrayList<String> addPositionList = new ArrayList<>();

    public static ArrayList<String> addPosition(ArrayList<Integer> scores){
        int[] setPosition = new int[scores.size()];
        Arrays.fill(setPosition,1);
        for (int count = 0; count < scores.size(); count++) {
            for (Integer index : scores){
                if(scores.get(count) < index){
                setPosition[count] += 1;}
            }
            addPositionList.add(String.valueOf(setPosition[count]));
        }
        return addPositionList;
    }

    public static void storing(){
        System.out.println("""
                Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>
                Saved successfully
                """);
    }
    public static void minusDisplay(int minusNumber){
        for (int index1 = 0; index1 < 2; index1++) {
            for (int index2 = 0; index2 < minusNumber; index2++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    
}