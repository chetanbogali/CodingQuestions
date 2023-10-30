package set1;

import java.util.Scanner;

public class SpaceCountInString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.nextLine();
		int res = count(str);
		System.out.println(res);
	}
	
	public static int count(String str) {
		int spaceCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		return spaceCount;
	}
}
