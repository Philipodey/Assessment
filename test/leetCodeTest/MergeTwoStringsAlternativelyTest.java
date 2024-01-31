package leetCodeTest;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static leetCode.MergeTwoStringsAlternatively.mergeTwoWordsAlternatively;
import static org.junit.jupiter.api.Assertions.*;

public class MergeTwoStringsAlternativelyTest {
    @Test
    public void mergeTwoStringsThatAreNotEqualAlternativelyTest(){
        String firstWord = "abc";
        String secondWord = "thkd";
        String mergedWord = "atbhckd";
        System.out.println(mergeTwoWordsAlternatively(firstWord, secondWord));
        assertEquals(mergedWord, mergeTwoWordsAlternatively(firstWord, secondWord));
    }
    @Test
    public void mergeTwoStringsThatAreEqualAlternativelyTest(){
        String firstWord = "abc";
        String secondWord = "pqr";
        String mergedWord = "apbqcr";
        System.out.println(mergeTwoWordsAlternatively(firstWord, secondWord));
        assertEquals(mergedWord, mergeTwoWordsAlternatively(firstWord, secondWord));
    }
    @Test
    public void mergeTwoStringsThatAreNotEqualAlternativelyTestTwo(){
        String firstWord = "ab";
        String secondWord = "pqrs";
        String mergedWord = "apbqrs";
        System.out.println(mergeTwoWordsAlternatively(firstWord, secondWord));
        assertEquals(mergedWord, mergeTwoWordsAlternatively(firstWord, secondWord));
    }
     @Test
    public void mergeTwoStringsThatAreNotEqualAlternativelyTestThree(){
        String firstWord = "abcd";
        String secondWord = "pq";
        String mergedWord = "apbqcd";
        System.out.println(mergeTwoWordsAlternatively(firstWord, secondWord));
        assertEquals(mergedWord, mergeTwoWordsAlternatively(firstWord, secondWord));
    }

}
