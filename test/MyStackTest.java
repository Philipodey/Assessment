import chapterEight.MyStack;
import chapterEight.StackUnderFlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    @Test
    public void myStackIsEmptyTest(){
        MyStack<Integer> myStack = new MyStack<>();
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void sizeOfTheStackTest(){
        MyStack<String> myStack = new MyStack<>();
        assertEquals(0, myStack.size());
    }
    @Test
    public void myStringCanPushTest(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("G-String");
        assertEquals(1,myStack.size());
        assertFalse(myStack.isEmpty());

    }
    @Test
    public void stackCanNotExceedTheDefaultCapacityTest(){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("G-String");
        myStack.push("E-String");
        myStack.push("Sabo");
//        myStack.push("Most");
        assertThrows(StackOverflowError.class, ()->myStack.push("Sabo Most"));
    }
    @Test

    public void stackDefaultCapacityTest(){
            MyStack<String> myStack = new MyStack<>();
            myStack.push("G-String");
            myStack.push("E-String");
            myStack.push("Sabo");
    //        myStack.push("Most");
            assertTrue(myStack.isFull());
    }
    @Test
    public void stackCanPushAndPopTest(){
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(4);
        myStack.push(45);
        myStack.pop();
        myStack.push(78);
        assertEquals(2, myStack.size());
    }
    @Test
    public void stackCanNotPopAnEmptyStorage(){
        MyStack<Double> myStack = new MyStack<>();
        assertThrows(StackUnderFlow.class, myStack::pop);
    }
    @Test
    public void stackCanPeek(){
        MyStack<String> myStack = new MyStack<>();
        assertTrue(myStack.isEmpty());
        myStack.push("Sabo most");
        Object peek = myStack.peek();
        assertEquals("Sabo most",peek);
    }
}
