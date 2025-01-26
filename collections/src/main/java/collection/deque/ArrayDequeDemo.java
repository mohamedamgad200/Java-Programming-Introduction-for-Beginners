package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String>cards=new ArrayDeque<>();
        cards.add("King");
        cards.add("Queen");
        cards.addFirst("Ace");
        cards.addLast("Jack");
        cards.removeFirst();
        cards.removeLast();
        System.out.println(cards);
        System.out.println(cards.getFirst());
        System.out.println(cards.getLast());
        System.out.println(cards.peekFirst());
        System.out.println(cards.peekLast());
        System.out.println(cards.contains("king"));
    }
}
