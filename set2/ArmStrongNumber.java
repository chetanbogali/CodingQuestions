package set2;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nubmer");
		int num = scan.nextInt();
		int orginal = num;
		int count = 0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		
		int res = armStrongCheck(orginal, count);
		if(res == orginal) {
			System.out.println("ARMSTRONG NUMBER");
		} else {
			System.out.println("NOT ARMSTRONG NUMBER");
		}
	}
	
	public static int armStrongCheck(int n, int count) {
		int sum = 0;
		
		while(n!=0) {
			int rem = n%10;
			int res = (int)Math.pow(rem, count);
			sum = sum + res;
			n=n/10;
		}
		return sum;
	}
}
