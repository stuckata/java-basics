package org.stu.sampleexam03;

import java.util.Scanner;

public class _02SumOfElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] arrStr = input.nextLine().split(" ");

		input.close();

		long[] nums = convertStringToIntegersArray(arrStr);
		long sum = 0;
		long max = Long.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		if (sum == 2 * max) {
			System.out.println("Yes sum=" + max);
		} else {
			long diff = Math.abs(sum - 2 * max);
			System.out.println("No, diff=" + diff);
		}

	}

	private static long[] convertStringToIntegersArray(String[] arrStr) {

		long[] nums = new long[arrStr.length];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(arrStr[i]);
		}
		return nums;
	}

}
