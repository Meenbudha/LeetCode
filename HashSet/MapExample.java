import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // Add key-value pairs
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 92);

        // Update value for existing key
        scores.put("Alice", 95); // Overwrites 90

        // Display map
        System.out.println("Scores: " + scores);

        // Access value by key
        System.out.println("Alice's score: " + scores.get("Alice"));

        // Remove entry
        scores.remove("Bob");
        System.out.println("After removing Bob: " + scores);

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}