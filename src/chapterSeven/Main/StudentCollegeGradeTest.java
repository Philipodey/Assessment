package chapterSeven.Main;

public class StudentCollegeGradeTest {
    public static void main(String[] args) {
        int[][] studentScore =  {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73}};
        CollegeStudentsGrade studentGrade = new CollegeStudentsGrade("The grade for computer science 101", studentScore);
        System.out.printf("The grade for student in CS101%s%n%n", (Object) studentGrade.getCourseName());
        studentGrade.gradesProcesses();
    }
}
