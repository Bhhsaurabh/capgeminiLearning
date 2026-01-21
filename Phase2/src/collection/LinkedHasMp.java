package collection;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;

public class LinkedHasMp {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();

        hm.put(1, "ABC");
        hm.put(8, "b");
        hm.put(9, "c");
        hm.put(10, "d");
        hm.putIfAbsent(10, "e"); // will NOT replace "d"

        System.out.println(hm);
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        // for-each loop
        for (Map.Entry<Integer, String> o : hm.entrySet()) {
            System.out.println(o);
        }

        System.out.println("After using iterator");

        Iterator<Map.Entry<Integer, String>> i = hm.entrySet().iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}