package chibuzoAssignment;

public class PowerTable {
    public static void main(String[] args){
        int number = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int power = 2;
        int power2 = 3;
        int power3 = 4;
        int power4 = 5;
        int power5 = 6;
        int result = 1;
        int result2 = 1;
        int result3 = 1;
        int result4 = 1;
        int result5 = 1;

        System.out.println("a\t\tb\t\tpow(a,b)");
        for (int count = 1; count <= 2 ; count++) {
            result = result * number;
//            System.out.println(result);
        }
        System.out.printf("%d\t\t%d\t\t%d", number, power, result);

        for (int count = 1; count <= 3 ; count++) {
            result2 = result2 * number2;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", number2, power2, result2);

        for(int count = 1; count <= 4; count++){
            result3 = result3 * number3;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", number3, power3, result3);

        for(int count = 1; count <= 5; count++){
            result4 = result4 * number4;
        }
        System.out.printf("\n%d\t\t%d\t\t%d", number4, power4, result4);

        for(int count = 1; count <= 6; count++) {
            result5 = result5 * number5;
        }
            System.out.printf("\n%d\t\t%d\t\t%d", number5, power5, result5);


    }
}
