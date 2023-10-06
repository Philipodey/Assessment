package classWork;

public class SumArray {
    public static int sumOfNumberInEvenPosition(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i+=2) {
            total = total + numbers[i];
        }

        return total;
    }
    public static int sumOfNumberInOddPosition(int[] numbers){
        int total = 0;
        for (int i = 1; i < numbers.length; i+=2) {
            total += numbers[i];
        }
        return total;
    }

    public static int sumOfOddNumbers(int[] numbers) {
        int total = 0;
        for (int count = 0; count < numbers.length; count++) {
            if(numbers[count] % 2 == 1){
                total += numbers[count];
            }
        }
        return total;
    }
    public static int sumOfEvenNumbers(int[] numbers){
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                total = total + numbers[i];
            }
        }
        return total;
    }
}
