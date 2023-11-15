package chapterEight;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private final List<User> users = new ArrayList<>();

    public void addUser (User person){
        users.add(person);
    }

    public void greet(){
       users.forEach(User::greet);
    }
}
