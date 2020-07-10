package japi;

import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sorting {
    public static void main(String[] args) {
        Collections.sort(
                IntStream.of(2, 1, 6, 4, 9, 7)
                        .boxed()
                        .collect(Collectors.toList()),
                Comparator.comparing(Integer::intValue));
    }
}
