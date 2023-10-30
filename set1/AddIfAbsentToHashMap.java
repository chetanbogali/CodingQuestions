package set1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddIfAbsentToHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a HashMap with String keys and values
        HashMap<String, String> stringHashMap = new HashMap<>();

        // Adding initial elements to the HashMap
        stringHashMap.put("A", "Apple");
        stringHashMap.put("B", "Banana");
        stringHashMap.put("C", "Cherry");

        // Print the original HashMap
        System.out.println("Original Key-Value pairs in the HashMap:");
        printHashMap(stringHashMap);

        // Prompt user for a key-value pair
        System.out.print("Enter a key: ");
        String userKey = scanner.nextLine();
        System.out.print("Enter a value: ");
        String userValue = scanner.nextLine();

        // Add the key-value pair if the key is not already present
        stringHashMap.putIfAbsent(userKey, userValue);

        // Print the updated HashMap
        System.out.println("Updated Key-Value pairs in the HashMap:");
        printHashMap(stringHashMap);
    }

    private static void printHashMap(HashMap<String, String> hashMap) {
    	
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
