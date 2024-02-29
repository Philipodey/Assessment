package chapterFifteen.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Example4 {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\Assessment\\test\\chapterFifteen\\bank\\transactionsDetails.txt";
        InputStream stream = new FileInputStream(location);
        Scanner scanner = new Scanner(stream);
        System.out.println(scanner.nextLine());
//        scanner.findAll(Pattern.compile(".").forEach())
    }
}
