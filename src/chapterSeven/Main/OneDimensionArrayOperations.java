package chapterSeven.Main;

public class OneDimensionArrayOperations {
    public static void main(String[] args) {

    }
    public static int[] turnElementBetweenIndex10And20ToZero(int[] array){
        for (int count = 0; count < array.length; count++) {
            if (count >= 10 && count <= 20){
                array[count] = 0;
            }
        }
        return array;
    }
    public static int[] multiplyEachOfTheElementBy2(int[] array){
        int[] newArray = new int[array.length];
        int counter = 0;
        for (int count = 0; count < array.length; count++){
            newArray[counter] =array [count]*2;
            counter++;
        }
        return newArray;
    }
    public static void displayIntegerArray(int[] bestScores){
        for (int count: bestScores){
            System.out.printf("%s\n",count);
        }
    }
}
