package org.stu.homwork04;

import java.util.Scanner;

public class _04LongestIncreasingSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] numStr = input.nextLine().split(" ");
		input.close();
		int[] nums = new int[numStr.length];

		for (int i = 0; i < numStr.length; i++) {
			nums[i] = Integer.parseInt(numStr[i]);
		}

		findAllIncreasingSequences(nums);
	}

	private static void findAllIncreasingSequences(int[] nums) {

		int counter = 1;
		int tempCountter = 1;
		String best = "";

		System.out.print(nums[0]);

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				System.out.print(" " + nums[i]);
				tempCountter++;
				if (tempCountter > counter) {
					if (tempCountter == 2) {
						best = "" + nums[i - 1];
					}
					best += " " + nums[i];
					counter = tempCountter;
				}
			} else {
				System.out.println();
				System.out.print(nums[i]);
				tempCountter = 1;
			}
		}
		System.out.println();
		if (best.length() == 0) {
			best = "" + nums[0];
		}
		System.out.println("Longest: " + best);

	}

}
