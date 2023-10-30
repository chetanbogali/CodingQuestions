package set1;

import java.util.Scanner;

public class RemoveExtraSpaceInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string with extra spaces");
		String s1 = scan.nextLine();
		
		removeExtraSpaces(s1);
	}
	public static void removeExtraSpaces(String s1) {
		String s2 = "";
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch != ' ') {
				s2 = s2 + ch;
			}
			else {
				char nextCh = s1.charAt(i+1);
				if(nextCh == ' ') {
					continue;
				}
				else {
					s2 = s2 + ch;
				}
			}
		}
		System.out.println(s2);
	}
}
