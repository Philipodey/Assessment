package chapterSix;

public class DivisibleBy5 {
    public static void main(String[] args) {
        boolean dividedByFive = divisibleBy5(3,10,20,25);
        System.out.println(dividedByFive);
    }
    public static boolean divisibleBy5(int... numbers){
        for (int count = 0; count < numbers.length; count++) {
            if (!(numbers[count] % 5 == 0)){
                return false;
            }
        }
        return true;
    }
}
