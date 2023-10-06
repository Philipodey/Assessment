package chapterFour.main;

public class ChekerBoard {
    public static void main(String[] args) {
        for (int count = 0; count < 8; count++) {
            if(count % 2 == 1){
                System.out.print("* ");
            }
            else {
                System.out.print(" ");
            }
            for (int index = 0; index < 18; index++) {
                if(index % 2 == 1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}
