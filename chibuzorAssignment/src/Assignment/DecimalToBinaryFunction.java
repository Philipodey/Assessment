package Assignment;

public class DecimalToBinaryFunction {
    public static void main(String[] args) {
        int decimal = binaryToDecimal(100010110);
    }
    public static int decimalToBinary(int number){
       int value = 0;

       int[] binary = new int[50];
       while(number != 0){
          binary[value++] = number % 2;
          number /= 2;
       }
        int index = value -1;
        for (; index >= 0 ; index--) {
            System.out.print(binary[index]);
        }
        return binary[index];
    }
    public static int binaryToDecimal(int number){
        int value = 0;
        int power = 0;
//        int[] binary = new int[30];
        while(number != 0){
            int digit = number % 10;
            value += digit * Math.pow(2, power);
            number = number / 10;
            power++;
        }
        return value;
    }
}
