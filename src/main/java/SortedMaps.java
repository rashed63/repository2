import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        testMap(treeMap);
        //testMap(linkedHashMap);
        //testMap(hashMap);
    }
    public static void testMap(Map<Integer, String> map){
        map.put(9, "Nine");
        map.put(3, "Three");
        map.put(6, "Six");
        map.put(4, "Four");
        //String text = map.get(6);
        //System.out.println(text);
        for (Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + ": "+ value);
        }
    }
}
