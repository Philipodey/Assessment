package chapterSeven.Main;

public class CollegeStudentsGrade {
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    private String courseName;
    private int[][] grades;

    public CollegeStudentsGrade(String courseName, int[][] grades) {
        this.grades = grades;
        this.courseName = courseName;
    }

    public void gradesProcesses() {
        gradesOutput();
        System.out.printf("%nThe lowest scores is %d%nThe highest scores is %d%n",getMinimum(), getMaximum());

        barchartOutput();


    }

    private void barchartOutput() {
        System.out.println("score grade: \n");
        int[] scoreFrequency = new int[11];
        for (int[] score: grades) {
            for (int studentScore: score) {
                ++scoreFrequency[studentScore / 10];
            }
        }
        for (int count = 0; count < scoreFrequency.length; count++) {
            if (count == 10) {
                System.out.printf("%7d", 100);
            } else {
                System.out.printf("%02d - %02d",count * 10, count * 10 + 9);
            }
            for (int score = 0; score < scoreFrequency[count]; score++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public int getMaximum() {
        int maximum = grades[0][0];
        for (int[] highScore : grades) {
            for (int count: highScore) {
                if (count > maximum) maximum = count;
            }
        }
        return maximum;
    }

        public int getMinimum() {
            int minimum = grades[0][0];
            for (int[] count : grades) {
                for (int lowScore: count) {
                    if (minimum > lowScore ) minimum = lowScore;
                }
            }
            return minimum;
        }


        public void gradesOutput(){
            System.out.print("The grades are :\n\n");
            System.out.printf("%11s", "");
            for (int testCount = 0; testCount < grades[0].length; testCount++) {
                System.out.printf("Subjects%d\t", (testCount+1));
            }
            System.out.println("Average");
            for (int student = 0; student < grades.length; student++) {
                System.out.printf("Students%2d", (student+1));
                for (int count: grades[student]) {
                    System.out.printf("%9d", count);
                }
                double average = getAverage(grades[student]);
                System.out.printf("%17.2f%n", average);
            }
        }



    public double getAverage(int[] grade) {
        int total = 0;
        for (int i : grade) {
            total += i;
        }
        return (double) total / grade.length;
    }
}
