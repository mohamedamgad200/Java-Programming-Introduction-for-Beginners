package collection.linkedlist;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> todoItemsLinkedList = new LinkedList<>(List.of(10, 20, 30, 40));
        todoItemsLinkedList.add(50);
        todoItemsLinkedList.add(60);
        todoItemsLinkedList.add(70);
        todoItemsLinkedList.set(2, 300);
        todoItemsLinkedList.offer(10);
        todoItemsLinkedList.offerFirst(20);
        todoItemsLinkedList.offerLast(11);
        todoItemsLinkedList.addLast(12);
        todoItemsLinkedList.addFirst(13);
        System.out.println("Linkedlist contain 10" + todoItemsLinkedList.contains(10));
        System.out.println("LinkedList contain this list 10,20" + todoItemsLinkedList.containsAll(List.of(10.20)));
        todoItemsLinkedList.remove(1);
        todoItemsLinkedList.removeAll(List.of(40,50));
        todoItemsLinkedList.pop();
        todoItemsLinkedList.poll();
        todoItemsLinkedList.pollFirst();
        todoItemsLinkedList.pollLast();
        todoItemsLinkedList.retainAll(List.of(50,60));
        todoItemsLinkedList.removeFirst();
        todoItemsLinkedList.removeLast();
        todoItemsLinkedList.lastIndexOf(10);
        todoItemsLinkedList.indexOf(30);
        todoItemsLinkedList.peekFirst();
        todoItemsLinkedList.peekLast();
        todoItemsLinkedList.clear();
        todoItemsLinkedList.isEmpty();
        todoItemsLinkedList.peekLast();
        todoItemsLinkedList.peekFirst();
        todoItemsLinkedList.sort(Comparator.naturalOrder());
        todoItemsLinkedList.sort(Comparator.reverseOrder());
        System.out.println("LinkedList size: " + todoItemsLinkedList.size());
        System.out.println(todoItemsLinkedList.get(2));
    }

}
