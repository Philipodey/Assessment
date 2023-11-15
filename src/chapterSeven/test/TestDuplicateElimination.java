package chapterSeven.test;

import chapterSeven.Main.DuplicateElimination;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDuplicateElimination {
    @Test
    public void testInitializeAnArrayToMinusOne(){
        int[] integer = {0,0,0,0,0,0,0,0,0,0};
        int[] result = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int[] expected = DuplicateElimination.createArrayAndInitializeItToMinusOne(integer);
        assertArrayEquals(result, expected);
    }
    @Test
    public void countNumberOfNonMinusOneNumbers(){
        int[] integer = {12, 23, 23, -1, -1, 45, 76, 12, 87, -1};
        int result = 7;
        int expected = DuplicateElimination.countNumberOfMinusOne(integer);
        assertEquals(result, expected);
    }
    @Test
    public void turnDuplicateToMinusOne(){
        int[] integer = {23,45, 45, 12, 98, 43, 90, 78, 67, 43};
        int[] result = {23, 45, -1, 12, 98, 43, 90, 78, 67, -1};
        int[] expected = DuplicateElimination.turnDuplicateToMinusOne(integer);
        assertArrayEquals(result, expected);
    }
    @Test
    public void removeNonMinusOneNumbers(){
        int[] integer = {12, 23, 23, -1, -1, 45, 76, 12, 87, -1};
        int[] result = {12, 23,23, 45, 76, 12, 87};
        int counter = DuplicateElimination.countNumberOfMinusOne(integer);
        int[] expected = DuplicateElimination.removeNonMinusOneNumbers(integer,counter);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(result, expected);
    }
}
