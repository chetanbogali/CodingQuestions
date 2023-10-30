package set1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		String res = reverseString(str);
		System.out.println(res);
	}
	public static String reverseString(String str) {
		char arr[] = str.toCharArray();
		char arr2[] = new char[arr.length];
		
		int j = arr2.length-1;
		for(int i=0; i<arr.length; i++) {
			arr2[j] = arr[i];
			j--;
		}
		
		String str2 = new String(arr2);
		return str2;
	}
}
