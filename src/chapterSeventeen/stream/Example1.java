package chapterSeventeen.stream;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
//        map operation is a transformation operation
        String result = List.of(10,20,30,40)
                .stream()
                .map(String::valueOf)
                .reduce((a,b)->a.concat(b)).orElseThrow();
        System.out.println(result);
    }
}
