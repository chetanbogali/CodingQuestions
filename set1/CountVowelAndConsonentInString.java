package set1;

import java.util.Scanner;

public class CountVowelAndConsonentInString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		int[] counts = countVowelsConsonants(input);

		System.out.println("Vowels: "+counts[0]+", Consonants: "+counts[1]);
	}

	public static int[] countVowelsConsonants(String input) {
		int vowelCount = 0;
		int consonantCount = 0;

		// Convert the input string to lowercase to simplify the vowel check
		String lowerCaseInput = input.toLowerCase();

		for (int i = 0; i < input.length(); i++) {
			char ch = lowerCaseInput.charAt(i);

			// Check if the character is a vowel
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else if (ch >= 'a' && ch <= 'z') {
				// Check if the character is a consonant
				consonantCount++;
			}
			// Ignore non-alphabetic characters
		}
		return new int[] { vowelCount, consonantCount };
	}
}

