package chapterFifteen;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileSampleTest {
    @Test
    public void testCreateFile(){
        String fileName = "sample.txt";
        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\files";

        FileSample.createFile(location, fileName);

        Path path = Paths.get(location, fileName);
        assertTrue(Files.exists(path));

    }
    @Test
    public void testCreateDirectory(){
        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\files\\ogar";
        FileSample.createDirectory(location);

        Path path = Path.of(location);
        assertTrue(Files.exists(path));
    }
     @Test
    public void testCreateDirectory1(){
        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\files\\ogar";
        FileSample.createDirectory(location);

        Path path = Path.of(location);
        assertTrue(Files.exists(path));
    }

//    @Test
//    public void deleteDirectoryTest() {
//        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\philip";
//        FileSample.delete(location);
//        Path path = Paths.get(location);
//        assertFalse(Files.exists(path));
//    }
//    @Test
//    public void deleteFilesTest(){
//        String fileName = "files";
//        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment";
//
//        FileSample.deleteFile(location, fileName);
//        Path path = Paths.get(location, fileName);
//        assertFalse(Files.exists(path));
//    }

}
