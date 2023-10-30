package set1;

import java.util.Scanner;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.nextLine();
		
		removeSpaces(str);
	}
	public static void removeSpaces(String str) {
		
		for(char ch : str.toCharArray()) {
			if(ch != ' ') {
				System.out.print(ch);
			}
		}
	}
}
