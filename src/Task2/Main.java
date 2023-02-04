package Task2;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Integer> list = Stream.of(2, 2, 3, 4)
                .map(n -> n * n)
                .reduce((x, y) -> x + y);
        System.out.println(list);
    }
}