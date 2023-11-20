package chapterEight;

public class MySet extends MyArrayList{
    private int[] mySet = new int[20];
    private int element;
    private int size;

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        return false;
    }


    public boolean add(int element) {
        this.element = element;
        for (size = 0; size < mySet.length; size++) {
            if (!(mySet[size] == element)){
                mySet[size] = element;
                return true;
            }
            else {
                return false;
            }

        }
        return false;
    }

    public boolean contains(int element) {
        for (size = 0; size < mySet.length; size++) {
            if (!(mySet[size] == element)){
                return false;
            }
        }
        return true;
    }

    public boolean addAll(int[] elements) {
        int[] anotherSet = new int[mySet.length];
        for (size = 0; size < mySet.length; size++) {
                    anotherSet[size] = mySet[size];

        }
        for (size = 0; size < mySet.length; size++) {
            if(!(mySet[size] == elements[size])){
                anotherSet[size] = elements[size];
                return true;
            }
        }
        return false;
    }
    public int size(){
        return size;
    }

}
