package org.stu.homework01;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfStrings {

	public static void main(String[] args) {
		System.out
				.println("This program allows you to enter strings and and sort them in alphabetical order.");
		System.out.print("Please, enter the strings count: ");
		Scanner input = new Scanner(System.in);

		int strNum = input.nextInt();
		String[] array = new String[strNum];

		System.out.println("Enter strings:");

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + " string: ");
			array[i] = input.next();
		}

		String[] sortedArr = sortString(array);
		printResult(sortedArr);

		input.close();
	}

	static String[] sortString(String[] array) {
		Arrays.sort(array);
		return array;
	}

	static void printResult(String[] sortedArr) {

		System.out.println("Sorted strings: ");
		for (String str : sortedArr) {
			System.out.println(str + " ");
		}
	}
}
