import java.util.ArrayList;

/**
 * Asn5.java
 * Purpose: Demonstrate the use of ArrayList with Strings and Integers,
 *          including basic operations and output formatting.
 */

public class Asn5 {

    public static void main(String[] args) {

        // -----------------------------
        // Create ArrayLists
        // -----------------------------
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // -----------------------------
        // Add 4 items to each list
        // -----------------------------
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // -----------------------------
        // Display original lists
        // -----------------------------
        System.out.println("=== ORIGINAL FRUITS LIST ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== ORIGINAL NUMBERS LIST ===");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // -----------------------------
        // ArrayList operations
        // -----------------------------
        fruits.remove("Banana"); // remove by value
        numbers.remove(1);       // remove by index

        fruits.add(1, "Pineapple"); // insert at index
        numbers.add(1, 99);

        // -----------------------------
        // Display updated lists
        // -----------------------------
        System.out.println("\n=== UPDATED FRUITS LIST ===");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\n=== UPDATED NUMBERS LIST ===");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}