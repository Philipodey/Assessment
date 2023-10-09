package main;

public class SwapElements {
    public static  int[] elementSwap(int[] numbers, int firstIndex, int secondIndex){

        numbers[firstIndex] = numbers[secondIndex] + numbers[firstIndex];
        numbers[secondIndex] = numbers[firstIndex] - numbers[secondIndex];
        numbers[firstIndex] = numbers[firstIndex] - numbers[secondIndex];
        return numbers;
    }
}
