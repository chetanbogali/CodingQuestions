package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Object> myArrayList = new ArrayList<>();

		myArrayList.add(22);
		myArrayList.add(3.147);
		myArrayList.add("Strin example");
		myArrayList.add(true);
//		myArrayList.add(new CustomObject("Manoj"));
		
		System.out.println("Enter value");
		String myName = scan.nextLine();
		
		CustomObject res = new CustomObject(myName);
		myArrayList.add(res);
		
		for (Object item : myArrayList) {
			System.out.println(item);
		}
	}
}

class CustomObject {
	private String name;

	public CustomObject(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}