package collection.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListMethodsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(167, 210, 500, 320, 870, 210, 10));
        System.out.println("Size of Array list is: "+numbers.size());//7
        System.out.println("Array list contain 210: "+numbers.contains(210));//true
        System.out.println("Array list is contain 210 and 500: "+numbers.containsAll(List.of(210,500)));//true
        System.out.println("index of first 210 is: "+numbers.indexOf(210));//1
        System.out.println("index of last 210 is: "+numbers.lastIndexOf(210));//5
        System.out.println("Remove the 10 from arraylist: "+numbers.remove(10));
        System.out.println("Remove list from the arraylist: "+numbers.removeAll(List.of(10,167)));
        System.out.println("Return all list from arrayList: "+ numbers.retainAll(List.of(10,167)));
        //sort the list ascending
        numbers.sort(Comparator.naturalOrder());
        //sort the list descending
        numbers.sort(Comparator.reverseOrder());
        numbers.clear();//clear all list
        System.out.println("Is ArrayList Empty: "+numbers.isEmpty());
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
