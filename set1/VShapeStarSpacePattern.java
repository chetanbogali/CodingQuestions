package set1;

import java.util.Scanner;

public class VShapeStarSpacePattern {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numRows = scan.nextInt();
		
		for(int i=1; i<=numRows; i++) {
			
			//print stars
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//print spaces
			for(int k=1; k<= 2*(numRows-i); k++) {
				System.out.print(" ");
			}
			
			//print stars again
			for(int l=1; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
