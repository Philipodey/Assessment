package chapterFifteen.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\test\\chapterFifteen\\example\\note.txt";
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileName)){
            String data = "Up Nepa!!!! The lord is good ";
            byte[] bytes = data.getBytes();
            fileOutputStream.write(bytes);

        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
