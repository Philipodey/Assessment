import chapterEight.*;

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
            lockDiary();
//            unlockDiary(this.passWord);
            sizeOfEntries++;
            int id = id();
            Entry entry = new Entry(id, title, body);
            entries.add(entry);
    }

    private void validateUserName(String userName) {
        if (!userName.equals(this.userName)) throw new InvalidUserNameException("Invalid username input the right username!");
    }

    private void validatePassword(String password) {
        if (!password.equals(this.passWord)) throw new InvalidPasswordException("Invalid password try Again!");
    }

    private String createPassword(String passWord) {
        this.passWord = passWord;
        return passWord;
    }

    private String createUserName(String userName) {
        this.userName = userName;
        return userName;
    }
    public int id(){
        return entries.size()+1;
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
}
