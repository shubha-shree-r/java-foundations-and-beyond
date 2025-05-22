package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreams {
    public static void main(String[] args) {

// map()
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = list.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println(list2);

// flatMap()
        List<Integer> lst1 = Arrays.asList(1, 2, 3);
        List<Integer> lst2 = Arrays.asList(4, 5, 6);
        List<Integer> lst3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> finalList = Arrays.asList(lst1, lst2, lst3);
        List<Integer> finalResult =finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(finalResult);

    }
}
