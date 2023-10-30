package set2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		
		System.out.println("The sum of digits is: "+sumOfDigits(n));
	}
	
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n!=0) {
			int rem = n%10;
			sum = sum + rem;
			n=n/10;
		}
		return sum;
	}
}
