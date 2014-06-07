package org.stu.homwork04;

import java.util.Scanner;

public class _07CountSubstringOccurrences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String words = input.nextLine().toLowerCase();
		String subStr = input.nextLine().toLowerCase();
		input.close();

		int counter = 0;
		for (int i = 0; i <= words.length() - subStr.length(); i++) {
			if (words.substring(i, subStr.length() + i).contains(subStr)) {
				counter++;
			}
		}
		System.out.println(counter);

	}
}