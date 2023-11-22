import chapterEight.MySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMySet {
    private MySet mySet;
    @BeforeEach
    public void testFirst(){
      mySet = new MySet();
    }
    @Test
    public void testAddOneElement(){
        assertTrue(mySet.isEmpty());
        mySet.add(12);
        mySet.add(12);
        assertEquals(1, mySet.size());
    }
    @Test
    public void testMultipleElement(){
        assertTrue(mySet.isEmpty());
        mySet.add(12);
        mySet.add(13);
        mySet.add(14);
        assertFalse(mySet.isEmpty());
        assertEquals(3, mySet.size());
    }
    @Test
    public void testContains(){
        assertTrue(mySet.isEmpty());
        mySet.add(12);
        assertFalse(mySet.isEmpty());
        boolean contains = mySet.contains(14);
        assertFalse(contains);
    }
    @Test
    public void testAddAll(){
        assertTrue(mySet.isEmpty());
        int[] elements = {5,6,7,8,9};
        mySet.addAll(elements);
        assertFalse(mySet.isEmpty());
        boolean contains1 = mySet.contains(5);
        boolean contains2 = mySet.contains(6);
        boolean contains3 = mySet.contains(7);
        boolean contains4 = mySet.contains(8);
        boolean contains5 = mySet.contains(9);
        assertTrue(contains1);
         assertTrue(contains2);
         assertTrue(contains3);
         assertTrue(contains4);
         assertTrue(contains5);
    }
    @Test
    public void testSize(){
        assertTrue(mySet.isEmpty());
        mySet.add(4);
        mySet.add(5);
        mySet.add(6);
        int size = mySet.size();
        assertEquals(3,3);
    }
    @Test
    public void testRemoveElement(){
        assertTrue(mySet.isEmpty());
        mySet.add(34);
        mySet.add(56);
        mySet.add(76);
//        mySet.remove(76);



    }

}
