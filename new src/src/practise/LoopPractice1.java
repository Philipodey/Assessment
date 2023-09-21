package practise;

public class LoopPractice1 {
    public static void main(String[] args) {
        int number = 6;
        for (int row = 1; row <= 6; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println(" ");

        }
        for (int space = 0; space <= 1; space++) {
            System.out.print("\t");
        }
            for (int row = 1; row <= 6; row++) {
                for (int space = 1; space >= 1; space--) {
                    System.out.println(" ");
                }
                for (int column = 1; column <= 7 - row; column++) {
                    System.out.print(column);
                }

            }
//        for (int row = number - 1; row <=1; row--) {
//            for (int i = 0; i < ; i++) {
//
//            }

        }
        }
//    }
