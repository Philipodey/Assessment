package chapterFifteen.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Example5 {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\test\\chapterFifteen\\example\\note.txt";
        String errors = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\test\\chapterFifteen\\example\\example.txt";
        try (PrintStream printStream = new PrintStream(new FileOutputStream(location))) {
            System.setOut(printStream);
            printStream.println("Hello everybody, join us for game night");

        }
        catch (IOException exception){
            PrintStream errorStream = new PrintStream(new FileOutputStream(errors));
            System.setErr(errorStream);

            System.err.println(exception.getMessage());
        }
    }
}
