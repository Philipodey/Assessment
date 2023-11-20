package chapterEight;

public class MyArrayList {
    private int element;
    private int size;
    private int index;
    private boolean isEmpty = true;
    int[] myArrayList = new int[20];
    private int[] newMyArrayListB = new int[10];

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean add(int element) {
        this.element = element;
        myArrayList[size++] = element;
        return size >= 0;
    }

    public boolean remove(int element) {
        int[] remove = new int[1];
        this.element = element;
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] == element){
                remove[i] = myArrayList[i];
                return true;

            }
        }
        return false;
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

        newMyArrayListB = new int[index];
        int[] newMyArrayListA = new int[myArrayList.length - index];
           for (int count = 0; count < index; count++) {
                   newMyArrayListB[count] = myArrayList[count];
           }
           for (int count = 0; count < myArrayList.length - index; count++) {
                newMyArrayListA[count] = myArrayList[count + index];
           }
            newMyArrayListB[newMyArrayListB.length - 1] = index;
            



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
}
