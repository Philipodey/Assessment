import chapterEight.diary.Diaries;
import chapterEight.diary.Diary;
import chapterEight.main.DiaryNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiariesTest {
    private Diaries diaries;
    @BeforeEach
    public void firstTest(){
        diaries = new Diaries();
        diaries.add("username", "password");
    }
    @Test
    public void addDiaryToDiariesTest(){


        assertEquals(1, diaries.getSizeOfDiaries());
    }
    @Test
    public void diariesCanFindDiaryByUserName(){
        diaries.add("username1", "password1");
        assertEquals(2, diaries.getSizeOfDiaries());

        Diary diary = diaries.findByUsername("username");
         Diary diary1 = diaries.findByUsername("username1");
        assertEquals("username", diary.getUserName());
        assertEquals("username1", diary1.getUserName());
    }
    @Test
    public void diariesThrowsAnExceptionWhenUsernameNotFound(){
        diaries.add("username1", "password1");
        assertEquals(2, diaries.getSizeOfDiaries());

        assertThrows(DiaryNotFoundException.class, ()-> diaries.findByUsername("joseph"));
    }
    @Test
    public void diaryCanBeDeletedTest(){
        diaries.add("username1", "password1");
        assertEquals(2, diaries.getSizeOfDiaries());

        diaries.delete("username","password");
        assertEquals(1, diaries.getSizeOfDiaries());

    }
    @Test
    public void diariesThrowAnExceptionWhenTheDiaryIsNotFound(){
        diaries.add("username1", "password1");
        assertEquals(2, diaries.getSizeOfDiaries());
        assertThrows(DiaryNotFoundException.class, ()-> diaries.delete("username3","password7"));
    }
}
