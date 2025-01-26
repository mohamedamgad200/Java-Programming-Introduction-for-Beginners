package collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> books = new HashSet<>();
        books.add("Demo Book");
        books.add("Harry and his friends");
        books.add("Eric takes on photography");
        books.add("Chád loves Java");
        books.add("Always be learning");
        for (String book:books)
        {
            System.out.println(book);
        }
        books.remove("Always be learning");
        System.out.println("contain"+books.contains("Demo Book"));
        System.out.println("Size"+books.size());
        books.clear();
        System.out.println("Empty"+books.isEmpty());
    }
}
