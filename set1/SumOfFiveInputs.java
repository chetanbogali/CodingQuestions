package set1;

import java.util.Scanner;

public class SumOfFiveInputs {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] inputs = new int[5]; // Create an array to store 5 inputs

		// Take 5 inputs
		for (int i = 0; i < 5; i++) {
			inputs[i] = scan.nextInt();
		}
		// Calculate the sum
		int sum = calculateSum(inputs);
		System.out.println("Sum of inputs: " + sum);
	}

	public static int calculateSum(int[] arr) {
		int sum = 0;
		// Sum the elements in the array
		for (int value : arr) {
			sum = sum + value;
		}
		return sum;
	}
}
