package set1;

import java.util.Scanner;

public class TwosPower {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int exponent = scan.nextInt();
		
		int result = 1;
		
		for(int i=0; i<exponent; i++) {
			result = result * 2;
		}
		System.out.println("2's Power of "+exponent+" is "+result);
	}
}
