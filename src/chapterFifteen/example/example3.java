package chapterFifteen.example;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class example3 {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\DELL\\IdeaProjects\\java_work_out\\src\\Bike.java";
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            byte[] bytes = dataInputStream.readAllBytes();
            System.out.println(new String(bytes));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
