import chapterEight.MyArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyArrayList {

    private MyArrayList myArrayList;
    @BeforeEach
    public void testObject() {
        myArrayList = new MyArrayList();
    }


    @Test
    public void testIsEmpty(){
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void testAddOneElement(){

        assertTrue(myArrayList.isEmpty());
        int element = 345;
        boolean add = myArrayList.add(element);

        assertTrue(add);
    }
    @Test
    public void removeElement(){

        assertTrue(myArrayList.isEmpty());
        int element = 345;

        assertTrue(myArrayList.add(element));
        myArrayList.remove(element);

        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void testAddMoreThanOneElement(){

        assertTrue(myArrayList.isEmpty());
        int element = 345;
        boolean add = myArrayList.add(element);
        assertTrue(add);
        int element2 = 12;
        boolean add1 = myArrayList.add(element2);
        int element3 = 13;
        boolean add2 = myArrayList.add(element3);
        int size = myArrayList.size();
        assertEquals(3, size);
    }
    @Test
    public void testContains(){

        assertTrue(myArrayList.isEmpty());
        int element = 345;
        boolean add = myArrayList.add(element);
        System.out.println(add);
        boolean contains = myArrayList.contains(element);
        System.out.println(contains);
        assertTrue(contains);
    }
    @Test
    public void testGetElement(){
        assertTrue(myArrayList.isEmpty());
        int element = 345;
        boolean add = myArrayList.add(345);
        int element1 = 23;
        boolean add1 = myArrayList.add(23);
        int index = 1;
        int getElement = myArrayList.getElement(index);
        assertEquals(23,getElement);
    }
    @Test
    public void testAddElementAtSpecificIndex(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(12);
        int element = 35;
        int index = 2;
        myArrayList.add(index, element);
        int getElement = myArrayList.getElement(3);
        assertEquals(12,getElement);

    }
    @Test
    public void testSetElement(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);
        int index = 0;
        int element = 4;
        int setElement = myArrayList.set(index, element);
        assertEquals(5, setElement);
    }
    @Test
    public void testAddElement(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        boolean remove = myArrayList.remove(7);
        System.out.println(remove);
        int getElement = myArrayList.getElement(0);
        assertEquals(getElement, 5);
    }

}
