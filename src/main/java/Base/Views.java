package Base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Views {
    public static void main(String[] args) {
        // Create a LinkedHashMap to maintain insertion order
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        addKeyValuePair(linkedHashMap, 1, "Value 1");
        addKeyValuePair(linkedHashMap, 7, "Value 7");
        addKeyValuePair(linkedHashMap, 2, "Value 2");
        addKeyValuePair(linkedHashMap, 6, "Value 6");
        addKeyValuePair(linkedHashMap, 3, "Value 3");

        // Retrieve values from the LinkedHashMap and print them in the insertion order
        retrieveValuesInSequence(linkedHashMap);
    }

    // Method to add a key-value pair to a LinkedHashMap and retrieve values in the same order
    public static void retrieveValuesInSequence(LinkedHashMap<Integer, String> linkedHashMap) {
        System.out.println("Retrieved values in the order of insertion:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Method to add a key-value pair to a LinkedHashMap
    public static void addKeyValuePair(LinkedHashMap<Integer, String> linkedHashMap, int key, String value) {
        linkedHashMap.put(key, value);
    }
}
