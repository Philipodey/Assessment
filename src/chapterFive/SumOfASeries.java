package chapterFive;

public class SumOfASeries {
    public static void main(String[] args) {
        long sum = 0;
        System.out.println("number\tsum");
        for (int count = 0; count <= 100; count++) {
            sum += count;
            System.out.println(count+"\t\t"+sum);
        }
    }
}
