package chapterFive;

public class TrianglePrinting {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print('*');
            for (int j = 10; j >= i; j--) {
                System.out.print(' ');
                for (int k = 10; k >= i; k--) {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
