package jenkins;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Step 2: Add 4 items to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Mango");
        hashMap.put(3, "Pomogranate");
        hashMap.put(4, "Cherry");

        // Step 3: Print the entire HashMap
        System.out.println("HashMap: " + hashMap);

        // Step 4: Access and print the 3rd item (simulated by iteration)
        int index = 0;
        String thirdItem = null;

        // Use iterator to loop through the entries
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            index++;
            if (index == 3) {
                thirdItem = entry.getValue();
                break;
            }
        }

        // Print the 3rd item
        System.out.println("3rd item in the HashMap: " + thirdItem);
    }
}

