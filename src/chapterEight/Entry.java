package chapterEight;

import java.time.LocalDateTime;
import java.util.Date;

public class Entry {
    private int id;
    private String title;
    private String body;

    private final Date dateTime = new Date();
    public Entry(){

    }
    public Entry(int id, String title, String body) {
        this.body = body;
        this.id = id;
        this.title = title;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body += body;
    }
    public String toString(){
        return String.format("""
                                                            %s
                            %s
               
                %s
               
                
                """,dateTime,title.toUpperCase(), body);
    }
}
