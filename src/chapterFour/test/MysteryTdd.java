package chapterFour.test;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MysteryTdd {
    @Test
    public void testTernaryOperation(){
        Mystery2Test hash = new Mystery2Test();
        int expected = Integer.parseInt(hash.divisible(20));
//        assertEquals(expected, null);

    }
}
