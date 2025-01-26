package collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //  ArrayList<String> todoItems=new ArrayList<String>();//old way
        ArrayList<String> todoItems = new ArrayList<String>();
        //List<String>todoItems=new ArrayList<>();
        //var todoItems=new ArrayList<String>();
        todoItems.add("Take out the trash");
        todoItems.add("Clean the dishes");
        todoItems.add("Prep dinner");
        todoItems.add(0,"Take dog to a walk");//shift all to the right index0==>become 1 and so on
        todoItems.set(0,"Take the dog to the groomer");//override index 0 item
        System.out.println(todoItems.get(0));//return index 0 item
        System.out.println("******************");
        for(String item:todoItems)
        {
            System.out.println(item);
        }
    }
}
