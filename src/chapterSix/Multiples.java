package chapterSix;

public class Multiples {
    public static void main(String[] args) {
        boolean multiple = isMultiples(15, 10);
        System.out.println(multiple);
    }
    public static boolean isMultiples(int number, int multiple){
        if (number % multiple == 0){
            return true;
        }
        else return false;

    }
}
