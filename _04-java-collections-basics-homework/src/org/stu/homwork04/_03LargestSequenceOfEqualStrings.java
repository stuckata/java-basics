package org.stu.homwork04;

import java.util.Scanner;

public class _03LargestSequenceOfEqualStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] str = input.nextLine().split(" ");
		int counter = 1;
		int best = 1;
		String result = "";

		input.close();

		if (str.length == 1) {
			System.out.print(str[0]);
			return;
		}

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[j].equals(str[i])) {
					counter++;
				}
				if (counter > best) {
					result = str[j];
					best = counter;
				}
			}
			counter = 1;
		}
		if (best == 1) {
			System.out.print(str[0]);
			return;
		}
		for (int i = 0; i < best - 1; i++) {
			System.out.print(result + " ");
		}
		System.out.println(result);
	}

}
