package chapterEight.diary;

import chapterEight.main.DiaryNotFoundException;

import java.util.ArrayList;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<>();
    public Diaries(){

    }
    public Diary add(String username, String password) {
        Diary diary = new Diary(username, password);
        diaries.add(diary);
        return diary;
    }

    public int getSizeOfDiaries() {
        return diaries.size();
    }

    public Diary findByUsername(String username) {
        for (Diary diary : diaries){
            if (diary.getUserName().equals(username)) return diary;
        }
            throw new DiaryNotFoundException("Diary Not Found !");
    }
//    public Diary findByUsername1(String username) {
//        for (int count = 0; count < diaries.size(); count++){
//            if (diaries.get(count).getUserName().equals(username)) return diaries.get(count);
//        }
//            throw new DiaryNotFoundException("Diary Not Found !");
//    }


    public void delete(String username, String password) {
        Diary delete = null;
        for (int count = 0; count < diaries.size(); count++){
            if (username.equals(diaries.get(count).getUserName()) && diaries.get(count).getPassword().equals(password)){
               delete = diaries.get(count);
               break;
            }
        }
        if (delete != null) diaries.remove(delete);
        else throw new DiaryNotFoundException("Diary Not Found !");
    }
}
