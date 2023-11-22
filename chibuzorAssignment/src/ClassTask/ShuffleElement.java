package ClassTask;

public class ShuffleElement {

    public static int[] shuffleElement(int[] elements) {
        int[] newArray = new int[elements.length];
        int elementCompared = 0;
        int counts = 0;
        for (int count = 0; count < elements.length; ) {
            int counter;
            for (counter = count+1; counter < elements.length; counter++) {
//                elementCompared = elements[counter];
                if (elements[count] > elements[counter]) break;
            }
            if (counter == elements.length){
                newArray[count] = elements[count];
                count++;
            }
            else{
                int hold = elements[counter];
                elements[counter] = elements[count];
                elements[count] = hold;
            }
        }
        return newArray;
    }
}
