package chapterSeven.Main;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int[] scores = {1, 23, 45, 67, 12, 87, 5475, 75, 34, 675, 23545};
        int number = scores[9];
        System.out.println(number);

        int[] r = new int[10];
        for (int count = 0; count < r.length; count++) {
            r[count] = -1;
        }
        System.out.println(Arrays.toString(r));

        double[] c = new double[100];
        double largest = 0;
        int counter = 0;
        for (int count = 0; count < c.length; count++) {
                c[counter] = count;
                counter++;
            if (largest < count) {
                largest = count;
            }
        }
        System.out.println(largest);
        System.out.println(Arrays.toString(c));
        int arrayLength = c.length;
        double[] reverseCounter = new double[arrayLength];
        for (int count = 0; count < arrayLength; count++) {
            reverseCounter[count] = c[(arrayLength - 1 )- count];
        }
        System.out.println(Arrays.toString(reverseCounter));
        double product = 1.00;
        for (int count = 0; count < arrayLength; count++) {
            if (count >= 3 && count <= 10){
                product *= count;
            }
        }
        System.out.println(product);


    }
}
