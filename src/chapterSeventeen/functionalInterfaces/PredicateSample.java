package chapterSeventeen.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word) -> word.length()> 2;
        System.out.println(predicate.test("three"));
    }
}
