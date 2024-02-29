package chapterSeventeen.functionalInterfaces;
import java.util.function.BiPredicate;
public class BiPredicates {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("three", "three"));
    }
}
