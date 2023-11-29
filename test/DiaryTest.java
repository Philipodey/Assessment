import chapterEight.Entry;
import chapterEight.InvalidPasswordException;
import chapterEight.main.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        System.out.println(diary.findEntryById(1201));
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
    @Test
    public void updateEntryTest(){
        diary.unlockDiary("Happinex123");
        String title = "The lord is making a way for me";
        String body = """
                Everything attached to me win
                It's my winning season
                Everything attached to me win
                I win
                I will because God has already won
                It's my winning season
                """;
        diary.updateEntry(1201, title, body);
        Entry entry = diary.findEntryById(1201);
        assertEquals("The lord is making a way for me", entry.getTitle());
    }
    @Test
    public void getIdTest(){
        String title = "The lord is making a way for me";
        String body = """
                Everything attached to me win
                It's my winning season
                Everything attached to me win
                I win
                I will because God has already won
                It's my winning season
                """;
        Entry entry = diary.findEntryById(1201);
        assertEquals(1201,entry.getId());


    }
    @Test
    public void deleteEntryTest(){
        diary.unlockDiary("Happinex123");
        String title = "The lord is making a way for me";
        String body = """
                Everything attached to me win
                It's my winning season
                Everything attached to me win
                I win
                I will because God has already won
                It's my winning season
                """;
        diary.deleteEntry(1201);
        assertEquals(1201, diary.findEntryById(1201));


    }


}
