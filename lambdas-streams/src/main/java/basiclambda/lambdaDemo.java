package basiclambda;

import java.util.ArrayList;
import java.util.List;

public class lambdaDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Eric");
        names.add("Melissa");
        names.add("Elijah");
        names.add("Milo");
        //First way traditional for loop
        /*
        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }
         */
        //Second way for each
        /*
        for(String name:names)
        {
            System.out.println(name);
        }
        */
        //third way lambda
        names.forEach(n-> System.out.println(n));
    }
}
