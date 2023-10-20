package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for (int k = 10-i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int q = 10-i; q > 0; q--) {
                System.out.print("*");
            }
            for (int a = 0; a <= i; a++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= i; y++) {
                System.out.print(" ");
            }
            for (int s = 10-i; s > 0 ; s--) {
                System.out.print("*");
            }
            for (int z = 10-i; z > 0; z--) {
                System.out.print(" ");
            }
            for (int p = 0; p <= i; p++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}