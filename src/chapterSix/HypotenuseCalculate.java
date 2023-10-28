package chapterSix;

public class HypotenuseCalculate {
    public static void main(String[] args) {
        double result = calculateHypotenuse(8,15);
        System.out.println(result);
    }
    public static double calculateHypotenuse(double sideOne, double sideTwo){
        double hypotenuse ;
        hypotenuse = Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2));
        return hypotenuse;
    }
}
