package data_structure.e_hashmap.a_basics;

import java.util.HashMap;
import java.util.Map;

public class B_HashMapCollecFramework {
    public static void main(String[] args) {
        // Creating the hashmap instance
        HashMap<Integer, String> hM = new HashMap<>();

        // Adding the entries (key and value)
        hM.put(1, "Satvik Sharma");
        hM.put(2, "Mayank Sharma");
        hM.put(3, "Anonymous Sharma");
        hM.put(4, "Satan Sharma");
        hM.put(5, "S4TAN Sharma");
//        System.out.println(hM);

        // Getting value by the key
//        System.out.println(hM.get(2));

        // changing or updating the value
        hM.put(3, "Anonymous");
//        System.out.println(hM);

        // removing pair from the hashmap
        // if present -> return val, else -> return null
        hM.remove(1);
//        System.out.println(hM);

        // adding entry if new key doesn't exist
        hM.putIfAbsent(1, "CHECK");
//        System.out.println(hM);

        // getting all the keys
//        System.out.println(hM.keySet());

        // getting all the values
//        System.out.println(hM.values());

        // getting all the entries from the hashmap
//        System.out.println(hM.entrySet());

        // Traversing the entries of HashMap

        for (Integer key : hM.keySet()) {
//            System.out.println("keys: " + key);
        }

        for (Map.Entry<Integer, String> e :hM.entrySet()) {
            System.out.printf("key: %d || value: %s", e.getKey(), e.getValue());
            System.out.println();
        }

        // or

        for (var e :hM.entrySet()) {
            System.out.printf("key: %d || value: %s", e.getKey(), e.getValue());
            System.out.println();
        }
    }
}
