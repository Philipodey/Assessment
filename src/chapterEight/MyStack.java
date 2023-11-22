package chapterEight;

public class MyStack<T> {
    private int defaultCapacity = 3;
    private int size;
    private Object[] elementStorage = new Object[defaultCapacity];

    public MyStack(){
        elementStorage = new Object[defaultCapacity];
    }
    public MyStack(int capacity){
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be greater than zero");
        elementStorage = new Object[capacity];
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(Object s) {
        if (isFull()) throw new StackOverflowError("Stack is already full");
        elementStorage[size++] = s;
    }

    public boolean isFull() {
       return defaultCapacity == size;
    }

    public void pop() {
        if (size <= 0) throw new StackUnderFlow("Stack is empty");
       --size;
    }

    public Object peek() {
        if(size <= 0) throw new StackUnderFlow("Stack is Empty!");
       return elementStorage[size-1];
    }
}
