package practise;

public class Numbers {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int number = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = number;
        System.out.printf("The first number is %d, The second number is %d, The third number is %d", firstNumber, secondNumber, thirdNumber);
    }
}
