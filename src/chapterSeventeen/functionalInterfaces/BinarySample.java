package chapterSeventeen.functionalInterfaces;

import java.util.function.BinaryOperator;

public class BinarySample {
    public static void main(String[] args) {
        BinaryOperator<Boolean> binaryOperator = Boolean::equals;
        System.out.println(binaryOperator.apply(true, true));
    }
}
