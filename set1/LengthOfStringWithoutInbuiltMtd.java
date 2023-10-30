package set1;

import java.util.Scanner;

public class LengthOfStringWithoutInbuiltMtd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String input = scan.nextLine();
		
		int res = findStringLength(input);
		System.out.println(res);
	}
	
	public static int findStringLength(String input) {
		int length = 0;
		
		for(char ch : input.toCharArray()) {
			length++;
		}
		return length;
		
//		for(int i=0; i<input.length(); i++) {
//			length++;
//		}
//		return length;
		
//		or
		
	}
}
