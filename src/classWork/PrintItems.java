package classWork;

public class PrintItems {
    public static void main(String[] args) {
        int[][] items = {{34,23,65},{23,67,44,68}};
        for (int[] count: items) {
            System.out.print("\n");
            for(int item : count){
                System.out.print(item+"\t");
            }
        }
    }
}
