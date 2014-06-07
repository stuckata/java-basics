package org.stu.homework03;
import java.util.Scanner;

public class _02GenerateThreeLetterWords {

	public static void main(String[] args) {

		String letters = enterInputString();
		char[] arrayCh = letters.toCharArray();

		printResult(arrayCh);

	}

	private static void printResult(char[] arrayCh) {
		for (int i = 0; i < arrayCh.length; i++) {
			for (int j = 0; j < arrayCh.length; j++) {
				for (int j2 = 0; j2 < arrayCh.length; j2++) {
					System.out
							.print("" + arrayCh[i] + arrayCh[j] + arrayCh[j2]);
					System.out.print(" ");
				}
			}
		}
	}

	private static String enterInputString() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter string: ");
		String letters = input.nextLine();
		input.close();
		return letters;
	}

}
