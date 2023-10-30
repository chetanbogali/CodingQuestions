package set1;

import java.util.Scanner;

public class ReveresPyramid {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numRows = scan.nextInt();
		
		for(int i=numRows; i>=1; i--) {
			
			//print spaces
			for(int j=1; j<=numRows-i; j++) {
				System.out.print(" ");
			}
			
			//print stars
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
