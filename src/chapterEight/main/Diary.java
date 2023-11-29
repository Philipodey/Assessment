package chapterEight.main;

import chapterEight.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Diary {
    private String userName;
    private String passWord;
    private boolean isLocked;
    private ArrayList<Entry> entries = new ArrayList<>();

    private int sizeOfEntries;
    public Diary(String userName, String passWord){
        this.userName = userName;

        this.passWord = passWord;
    }


    public void createEntryFor(String title, String body) {
            if(!isLocked) {
                sizeOfEntries++;
                int id = id();
                Entry entry = new Entry(id, title.toUpperCase(), body);
                entries.add(entry);
                System.out.println(id);
            }
    }

    private void validateUserName(String userName) {
        if (!userName.equals(this.userName)) throw new InvalidUserNameException("Invalid username input the right username!");
    }

    private void validatePassword(String password) {
        if (!password.equals(this.passWord)) throw new InvalidPasswordException("Invalid password try Again!");
    }
    public int id() {
        int num = Integer.parseInt(12 + "" + entries.size() + 1);
        return num;
    }

    public int getSizeOfEntries() {
        return sizeOfEntries;
    }

    public Entry findEntryById(int id) {
        for(Entry entry: entries){
            if (entry.getId() == id){
                return entry;
            }
        }
        throw new EntryNotFoundException("Entry Not Found");
    }
    public boolean isLocked(){
        return isLocked;
    }
    public void lockDiary(){
        isLocked = true;
    }


    public void unlockDiary(String password) {
        validatePassword(password);
        if (password.equals(this.passWord)){
            isLocked = false;
        }
    }

    public void updateEntry(int id, String title, String body) {
       if (!isLocked) {
           Entry update = findEntryById(id);
           update.setBody(body);
           update.setTitle(title);
       }
    }
    public void deleteEntry(int id) {
        if(!isLocked) {
                entries.remove(id);
        }
    }


}
