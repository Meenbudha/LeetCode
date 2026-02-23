import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, ignored

        // Display elements
        System.out.println("Fruits: " + fruits);

        // Check membership
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // Remove element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterate
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}