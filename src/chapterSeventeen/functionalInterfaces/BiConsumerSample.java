package chapterSeventeen.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerSample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (age, name)-> {
            System.out.println(name+" is "+age+" years old");
        };
        biConsumer.accept("100", "odey");
    }
}
