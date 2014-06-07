package org.stu.homwork04;

import java.util.Arrays;
import java.util.Scanner;

public class _01SortArrayOfNumbers {

	public static void main(String[] args) {

		int[] nums = inputNumbers();
		int[] sortedNums = sortNumbers(nums);
		printResult(sortedNums);

	}

	private static void printResult(int[] sortedNums) {
		for (int i : sortedNums) {
			System.out.print(i + " ");
		}

	}

	private static int[] sortNumbers(int[] nums) {

		Arrays.sort(nums);

		return nums;
	}

	private static int[] inputNumbers() {

		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int numN = input.nextInt();
		int[] numbers = new int[numN];
		System.out.println("Enter n numbers: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		input.close();
		return numbers;
	}

}
