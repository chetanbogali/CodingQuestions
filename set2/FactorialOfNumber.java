package set2;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}
