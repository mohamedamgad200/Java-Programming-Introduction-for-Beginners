package streams.basicstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Melissa", "Melissa", "Milo", "Adil");
        List<String> result = names.stream()      // Creating Stream
                .filter(s -> s.length() <= 6)    // Filtering by length
                .map(String::toUpperCase)       // Converting to uppercase
                .sorted()                      // Sort my letter
                .collect(Collectors.toList());// Collecting into list
        result.forEach(System.out::println);
    }
}
