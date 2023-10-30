package set1;

import java.util.ArrayList;
import java.util.Scanner;

public class ColorArrayList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> colorList = new ArrayList<>();
		
		colorList.add("Red");
		colorList.add("Green");
		colorList.add("Blue");
		colorList.add("Pink");
		
		for(String color : colorList) {
			System.out.println(color);
		}
		
		String userColor = scan.nextLine();
		colorList.add(userColor);
		for(String color : colorList) {
			System.out.println(color);
		}
	}
}
