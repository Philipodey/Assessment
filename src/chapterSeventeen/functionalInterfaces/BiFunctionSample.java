package chapterSeventeen.functionalInterfaces;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, String , Integer> biFunction = (firstWord, secondWord) -> (firstWord.concat(secondWord)).length();
        System.out.println(biFunction.apply("kenny", "wood"));
    }
}
