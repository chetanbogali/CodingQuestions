package set1;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Before swap x: "+x+" y: "+y);
		swap(x, y);
	}
	public static void swap(int x,int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swap x: "+x+" y: "+y);
	}
}
