package collection.map;

import java.util.HashMap;
import java.util.Map;

public class ProblemSolving {
    public static void main(String[] args) {
        //H:1 e:1 l:3 o:2 w:1 r:1 d:1 1:1 2:1 3:1 @:1 j:1 a:2 v:1 !:!
        String testString = "Hello World! 123 @Java";
        Map<Character,Integer> map=new HashMap<>();
        for(char c:testString.toCharArray())
        {
            if(c!=' ')
            {
                if(map.containsKey(c))
                {
                    int newValue=map.get(c)+1;
                    map.put(c,newValue);
                }
                else {
                    map.put(c,1);
                }
            }
        }
        int maxOccurance=0;
        char maxCharOccurance=' ';
        for(Map.Entry<Character,Integer>entery:map.entrySet()){
            int occurance=entery.getValue();
            char c=entery.getKey();
          if(entery.getValue()>maxOccurance)
          {
              maxOccurance=occurance;
              maxCharOccurance=c;
          }
        }
        System.out.println("Max Char accurance is: "+maxCharOccurance+" in "+maxOccurance+" times");
    }

}
