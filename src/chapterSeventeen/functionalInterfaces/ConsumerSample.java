package chapterSeventeen.functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (word)->{
            System.out.println(word+" what is wrong");
        };
        consumer.accept("Remi");
    }
}
