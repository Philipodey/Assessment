package chapterFifteen.example;

import java.io.FileInputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream
                     = new FileInputStream("C:\\Users\\DELL\\IdeaProjects\\Assessment\\test\\chapterFifteen\\example\\note.txt")) {
            byte[] fileBytes = fileInputStream.readAllBytes();
            System.out.println(new String(fileBytes));
        } catch(IOException exception) {
            exception.printStackTrace();
        }

    }
}
