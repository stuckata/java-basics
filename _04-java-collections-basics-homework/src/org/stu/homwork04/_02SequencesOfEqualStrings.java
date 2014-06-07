package org.stu.homwork04;

import java.util.Scanner;

public class _02SequencesOfEqualStrings {

	public static void main(String[] args) {

		String[] strings = enterStrings();
		printSequences(strings);
	}

	private static void printSequences(String[] strings) {

		System.out.print(strings[0]);

		for (int i = 1; i < strings.length; i++) {
			if (strings[i].equals(strings[i - 1])) {
				System.out.print(" " + strings[i]);
			} else {
				System.out.println();
				System.out.print(strings[i]);
			}
		}

	}

	private static String[] enterStrings() {

		System.out.println("Enter strings: ");
		Scanner input = new Scanner(System.in);
		String in = input.nextLine();
		String[] inputStr = in.split(" ");

		input.close();

		return inputStr;
	}
}
