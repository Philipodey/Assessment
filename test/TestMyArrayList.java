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
    public void testIsEmpty() {
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testAddOneElement() {

        assertTrue(myArrayList.isEmpty());
        int element = 345;
        myArrayList.add(element);
        int result = myArrayList.getElement(0);
        assertEquals(345, result);
    }

    @Test
    public void removeElement() {

        assertTrue(myArrayList.isEmpty());
        int element = 345;

        assertEquals(354,myArrayList.getElement(0));
        myArrayList.remove(element);

        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testAddMoreThanOneElement() {

        assertTrue(myArrayList.isEmpty());
        int element = 345;
        myArrayList.add(element);
        assertFalse(myArrayList.isEmpty());
        int element2 = 12;
        myArrayList.add(element2);
        int element3 = 13;
        myArrayList.add(element3);
        int size = myArrayList.size();
        assertEquals(3, size);
    }

    @Test
    public void testContains() {

        assertTrue(myArrayList.isEmpty());
        int element = 345;
        myArrayList.add(element);
        boolean contains = myArrayList.contains(element);
        System.out.println(contains);
        assertTrue(contains);
    }

    @Test
    public void testGetElement() {
        assertTrue(myArrayList.isEmpty());
        int element = 345;
        myArrayList.add(345);
        int element1 = 23;
        myArrayList.add(23);
        int index = 1;
        int getElement = myArrayList.getElement(index);
        assertEquals(23, getElement);
    }

    @Test
    public void testAddElementAtSpecificIndex() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(12);
        int element = 35;
        int index = 2;
        myArrayList.add(index, element);
        int getElement = myArrayList.getElement(2);
        assertEquals(35, getElement);

    }

    @Test
    public void testSetElement() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);

        int index = 0;
        int element = 4;
        int setElement = myArrayList.set(index, element);
        System.out.println(myArrayList.set(0, 4));
//        assertEquals(5, setElement);
    }

    @Test
    public void testAddElement() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.remove(7);
        int getElement = myArrayList.getElement(0);
        assertEquals(getElement, 5);
    }
    @Test
    public void addSpecificIndexes(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(67);
        myArrayList.add(23);
        myArrayList.add(56);
        myArrayList.add(23);
        myArrayList.add(2,16);
        myArrayList.add(0,5);
        int getElement = myArrayList.getElement(0);
        int getElement1 = myArrayList.getElement(1);
        int getElement2 = myArrayList.getElement(2);
        System.out.println((myArrayList));
        assertEquals(getElement2, 16);
        assertEquals(getElement1, 23);
        assertEquals(getElement, 5);
    }
    @Test
    public void testLastIndexOf(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(5);
        myArrayList.add(8);
        myArrayList.add(6);
        myArrayList.add(8);
        myArrayList.add(23);
        myArrayList.add(5);
        int element = 8;
        int lastIndex =  myArrayList.lastIndexOf(element);
        assertEquals(3, lastIndex);
    }

}
