import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        // Create a List (ArrayList implementation)
        List<String> names = new ArrayList<>();

        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Lists allow duplicates

        // Display the list
        System.out.println("Names: " + names);

        // Access element by index
        System.out.println("First name: " + names.get(0));

        // Update element
        names.set(1, "David"); // Replace "Bob" with "David"
        System.out.println("After update: " + names);

        // Remove element by value
        names.remove("Alice"); // Removes first occurrence of "Alice"
        System.out.println("After removing Alice: " + names);

        // Remove element by index
        names.remove(1); // Removes element at index 1
        System.out.println("After removing index 1: " + names);

        // Check size
        System.out.println("List size: " + names.size());

        // Check if element exists
        System.out.println("Contains Charlie? " + names.contains("Charlie"));

        // Iterate using for-each loop
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Iterate using index
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Index " + i + ": " + names.get(i));
        }
    }
}