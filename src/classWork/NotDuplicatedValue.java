package classWork;

public class NotDuplicatedValue {
    public static int nonDuplicatedValue(int[] numbers){
//        int[] newArray = new int[numbers.length-1];

        for (int count = 0; count < numbers.length; count++) {
            int counts = 0;
            for (int counter = 0; counter < numbers.length; counter++) {
                if (numbers[count] == numbers[counter] && count != counter) {
                    counts++;
                    numbers[counter] = 0;
               }
                    if(counts > 0) numbers[count]  = 0;
            }

        }
        return addNumberThatAreNotZero(numbers);
    }

    public static int addNumberThatAreNotZero(int[] numbers){
        int num = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] != 0){
                num = numbers[count];
                break;
            }
        }
        return num;
    }
}
