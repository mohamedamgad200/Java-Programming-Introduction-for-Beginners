package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,String> stateAbbreviations=new HashMap<>();
        stateAbbreviations.put("California", "CA");
        stateAbbreviations.put("New York", "NY");
        stateAbbreviations.put("Ohio", "OH");
        stateAbbreviations.put("Texas", "TX");
        System.out.println(stateAbbreviations.containsValue("CA"));
        System.out.println(stateAbbreviations.containsKey("New York"));
        System.out.println(stateAbbreviations.get("New York"));
        System.out.println(stateAbbreviations.putIfAbsent("New York","NY"));
        System.out.println(stateAbbreviations.size());
        stateAbbreviations.remove("New York");
        stateAbbreviations.put("Maryland","MD");
        stateAbbreviations.put("Egypt","em");
        stateAbbreviations.replace("Egypt","EG");
        stateAbbreviations.clear();
        System.out.println(stateAbbreviations.isEmpty());
    }
}
