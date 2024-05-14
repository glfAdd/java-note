package base;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 */
public class LStream {
    public static void main(String[] args) {
        Stream<String> a1 = Stream.of("a", "bb", "ccc", "dddd");
        Optional<String> a2 = a1.reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println(a2.get());


        Stream<String> b1 = Stream.of("a", "bb", "ccc", "dddd");
        List<String> b2 = b1.collect(Collectors.toList());
        Set<String> b3 = b1.collect(Collectors.toSet());


    }
}