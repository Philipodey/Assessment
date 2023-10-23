package classWork;

import java.util.Arrays;

public class  Shuffle {
    public static void main(String[] args) {
        String[] chars = {"A", "M", "C", "W", "I", "T"};
        System.out.println(Arrays.toString(shuffleOne(chars)));
    }
//    public static String[] shuffle(int number,String[] array) {
//        String[] strings = new String[array.length];
//        int length = (array.length/2)-1;
//        int counter = 0;
//        for (int count = 0; count < array.length; count++) {
//            if (count % 2 == 0){
//                strings[counter] = array[count];
//            }
//            else if (count % 2 == 1) {
//                strings[counter] = array[count+2];
//                count -= 1;
//            }
//            counter++
//            if (counter == array.length){
//                break;
//            }
//
//        }
//
//        return strings;
//    }
//}


    public static String[] shuffleOne(String[] chars) {
        String [] newList = new String[chars.length];
        int length = (chars.length/2) - 1;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(count % 2 ==0){
                newList[count] = chars[i];
            }
            else {
                newList[count] = chars[i + length];
                i -= 1;
            }
            count++;
            if(count == chars.length){
                break;
            }

        }
        return newList;
    }
}