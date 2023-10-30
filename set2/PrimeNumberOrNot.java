package set2;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		
		boolean res = isPrime(num);
		if(res) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
