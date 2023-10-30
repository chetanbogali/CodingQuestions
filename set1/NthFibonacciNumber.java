package set1;

import java.util.Scanner;

public class NthFibonacciNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		
		int a=0;
		int b=1;
		
		if(n < 0) {
			System.out.println("N cannot be zero");
			return;
		}
		if(n==0) {
			System.out.println(a);
		} 
		else if(n==1) {
			System.out.println(b);
		}
		else {
			int c=0;
			for(int i=2;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
		}
	}
}
