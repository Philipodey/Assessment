public class Play_Button {
    public static void main(String[] args) {
        int first = firstRow(5);
        int columnFirst = firstColumn(5);
    }
    public static int firstRow(int number) {
        for (int space = 1; space <= number; space++) {
//            System.out.println(" ");
            for (int row = 1; row > 3 - space; row--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return number;
    }
    public static int firstColumn(int number){
        for (int row = 1; row < number; row++) {
//            System.out.println(" ");
            for (int column = 1; column < 6-row ; column++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        return number;
    }
}
