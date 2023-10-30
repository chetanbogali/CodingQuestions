package set1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("A", "Apple");
		hashMap.put("B", "Banan");
		hashMap.put("C", "Orange");
		
//		System.out.println(hashMap);
		mapPrint(hashMap);
		
		System.out.println("Enter key");
		String key = scan.nextLine();
		System.out.println("Enter value");
		String value = scan.nextLine();
		
		hashMap.putIfAbsent(key, value);
		mapPrint(hashMap);
		
	}
	public static void mapPrint(HashMap<String, String> hashMap) {
		for(Map.Entry<String, String> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
