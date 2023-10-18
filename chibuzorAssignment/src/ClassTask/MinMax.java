package ClassTask;

public class MinMax {
    public static int min(int[] numbers){
        int min = numbers[0];
        for(int count = 0; count < numbers.length; count++) {
            if(numbers[count] < min){
                min = numbers[count];
            }
        }
        return min;
    }
    public static int max(int[] numbers){
        int max = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
            if(numbers[count] > max){
                max = numbers[count];
            }
        }
        return max;
    }
    public  static int total(int[] numbers){
        int total = 0;
        for (int count = 0; count < numbers.length; count++) {
            total += numbers[count];
        }
        return total;
    }
    public static int[] minMax(int[] numbers){
        int min = min(numbers);
        int max = max(numbers);
        int total = total(numbers);
        return new int[]{total - min, total - max};
    }

}
