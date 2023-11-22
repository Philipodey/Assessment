package chapterEight;

public class MySet {
    private MyArrayList myArrayList = new MyArrayList();
    private int element;
    private int size;

    public boolean isEmpty(){
       return myArrayList.isEmpty();
    }


    public void add(int element) {
        if (!myArrayList.contains(element)) this.myArrayList.add(element);
    }

    public boolean contains(int element) {
       return this.myArrayList.contains(element);
    }

    public void addAll(int[] elements) {

    }
    public int size(){
        return size;
    }

}
