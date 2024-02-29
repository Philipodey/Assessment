package chapterSeventeen.stream;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        Integer result = List.of("Mango", "Orange", "banana")
                .stream()
                .mapToInt((num)->num.length())
                .sum();

        System.out.println(result);
    }
}
