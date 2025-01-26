package collection.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> test=new HashSet<>(List.of(1,2,3,3,4,5,5,5));
        for(int item :test)
        {
            System.out.println(item);
        }
    }
}
