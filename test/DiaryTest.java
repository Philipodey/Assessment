import chapterEight.Entry;
import chapterEight.InvalidPasswordException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;
    @BeforeEach
    public void testFirst(){
        diary = new Diary("philip1234","Happinex123");
        diary.createEntryFor("The lord is good","All the time the lord is good");

    }
    @Test
    public void createEntryTest(){

//        System.out.println(diary.findEntryById(1));
        Entry entry = new Entry(diary.id(),"The lord is good", "All the time the lord is good");
        assertEquals("All the time the lord is good",entry.getBody());
    }
    @Test
    public void diaryIsLockedTest(){
        diary.lockDiary();
        assertTrue(diary.isLocked());
    }
    @Test
    public void unlockDiaryTest(){
        String password = "Happinex123";
        diary.unlockDiary(password);
        assertFalse(diary.isLocked());
    }
    @Test
    public void unlockWithTheWrongPassword(){
        String password = "Happinex";
        assertThrows(InvalidPasswordException.class,()-> diary.unlockDiary(password));
    }
    @Test
    public void unlockWithTheWrongPasswordThenInputTheRightPasswordToUnlocked(){
        String password = "Happinex";
        assertThrows(InvalidPasswordException.class,()-> diary.unlockDiary(password));
        String password1 = "Happinex123";
        assertFalse(diary.isLocked());
    }
    @Test
    public void createEntryTestAgain(){
        assertEquals(1, diary.getSizeOfEntries());
        diary.createEntryFor("Another Day","It was a sunny day but i was very happy");
        assertEquals(2, diary.getSizeOfEntries());
    }

}
