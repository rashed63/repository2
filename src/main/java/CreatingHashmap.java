import java.util.HashMap;
import java.util.Map;

public class CreatingHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "Two");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(10, "Ten");

        String text = map.get(5);
        System.out.println("The value is :: "+ text);
        //for(Map.Entry<Integer, String> entry : map.entrySet()){
            //int key = entry.getKey();
            //String value = entry.getValue();
            //System.out.println(key + ": "+ value);

        //i feel this for each loop is much easier to understand
        for (Integer key: map.keySet()){
            String value = map.get(key);
            System.out.println(key + ":: "+ value);
        }
    }
}
