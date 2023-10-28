package chapterSix;

import java.security.SecureRandom;

public class RoundingNumbers {
    public static void main(String[] args) {
        double x = 2.34;
        double y = Math.floor(x + 0.5);
        System.out.printf("%f", y);

        double y1 = Math.floor(x * 10 + 0.5) / 10;
        System.out.printf("%n%f", y1);

        double y2 = Math.floor(x * 100 + 0.5) / 100;
        System.out.printf("%n%f", y2);

        double y3 = Math.floor(x + 1) ;
        System.out.printf("%n%f", y3);

        SecureRandom secureRandom = new SecureRandom();
        int numbers = 1 + secureRandom.nextInt(6);
        if(numbers >= 2){
            System.out.printf("%n%d", numbers);
        }
        if (numbers >= 4 ){
            System.out.printf("%n%d",numbers);
        }
    }
}