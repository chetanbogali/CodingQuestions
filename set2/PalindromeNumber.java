package set2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		int orginal = num;
		
		int res = checkPalindrome(num);
		if(res == orginal) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("NOT Palindrome");
		}
	}
	public static int checkPalindrome(int n) {
		
		int rev = 0;
		while(n!=0) {
			int rem = n%10;
			rev = rev * 10 + rem;
			n=n/10;
		}
		return rev;
	}
}
