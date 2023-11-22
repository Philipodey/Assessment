package chapterEight;

public class MyArrayList {
    private int element;
    private int size;
    private int index;
    private boolean isEmpty = true;
    int[] myArrayList = new int[20];

//    private int[] newMyArrayListB = new int[10];

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public void add(int element) {
        this.element = element;
        myArrayList[size++] = element;

    }

    public void remove(int element) {
        int[] remove = new int[size];


    }

    public int size() {
        return size;
    }

    public boolean contains(int element) {
        this.element = element;
        boolean elementFound = true;
        for (int count = 0; count < myArrayList.length; count++) {
            myArrayList[count] = element;

        }
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] == element) {
                return elementFound;
            }
        }

        return false;
    }

    public int getElement(int index) {
        return myArrayList[index];
    }
    public void add(int index, int element){

       int[] newMyArrayListB = new int[myArrayList.length+1];
       int counter = 0;
        for (int count = 0; count < myArrayList.length; count++) {
            if (count < index){
                newMyArrayListB[counter] = myArrayList[count];
            }
            else if (count == index){
                newMyArrayListB[counter] = element;
            }
            else {
                newMyArrayListB[counter] = myArrayList[count];
            }
            counter++;
        }
        myArrayList = newMyArrayListB;
    }

    public int set(int index, int element) {
        int previousElement = myArrayList[index];

        for (int count = 0; count < myArrayList.length; count++) {
            if (index == count){
                myArrayList[count] = element;
            }
        }
        return previousElement;
    }
    public int[] extendMyList(int...elements){
        int[] newMyArrayList = new int[myArrayList.length * 2];
        for (int i = 0; i < newMyArrayList.length; i++) {
            newMyArrayList[i] = myArrayList[i];
        }
        return newMyArrayList;
    }
    public int lastIndexOf(int element) {
        int lastIndexElement = 0;
        for (int count = myArrayList.length-1; count > 0; count--) {
            if (myArrayList[count] == element){
               return count;

            }
        }
        return -1;
    }
}
