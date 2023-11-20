package chapterSix;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        SecureRandom secureRandom = new SecureRandom();
        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int rolls = 1; rolls < 60_000_000; rolls++) {
            int face = 1 + secureRandom.nextInt(6);
            switch (face) {
                case 1 -> ++frequency1;
                case 2 -> ++frequency2;
                case 3 -> ++frequency3;
                case 4 -> ++frequency4;
                case 5 -> ++frequency5;
                case 6 -> ++frequency6;
            }

        }
        System.out.printf("%-7s%-10s%n","Face","Frequency");
        System.out.printf("%-7s%-10s%n%-7s%-10s%n%-7s%-10s%n%-7s%10s%n%-7s%10s%n%-7s%-10s",1,frequency1,2,frequency2,3,frequency3,4,frequency4,5,frequency5,6,frequency6);

    }
}
