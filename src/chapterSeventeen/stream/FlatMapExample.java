package chapterSeventeen.stream;

import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(
                List.of(10,20,30),
                List.of(100,200,300),
                List.of(1000, 2000, 3000)
        );
        lists.stream().flatMap((list)->list.stream())
                .forEach(System.out::println);
    }
}
