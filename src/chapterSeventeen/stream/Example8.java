package chapterSeventeen.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        Set<Integer> integers = Set.of(100,2,30,4,5,1);
        List<Integer> nums = integers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(nums);
    }
}
