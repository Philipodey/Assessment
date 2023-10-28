package classWork;

public class FunctionThatTakesANumberAndTwoIndices {
    public static void main(String[] args) {
        System.out.println(number("1357", 2, 3, 6));
    }
    public static boolean number(String  number, int index1, int index2,int target) {
        for (int count = 0; count < number.length(); count++) {
            for (int counts = 0; counts < number.length(); counts++) {
                if (count == index1 && counts ==index2){
                    int firstRange = Integer.parseInt(String.valueOf(number.charAt(index1)));
                    int secondRange = Integer.parseInt(String.valueOf(number.charAt(index2)));
                    return target > firstRange && target < secondRange;
                }
                else return false;
            }
        }
//        int firstRange = Integer.parseInt(String.valueOf(number.charAt(index1)));
//        int secondRange = Integer.parseInt(String.valueOf(number.charAt(index2)));
            return true;
    }
}
