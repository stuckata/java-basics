package org.stu.sampleexam04;

import java.util.Scanner;

public class _03CrossingSequences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int firstFibNum = input.nextInt();
		int secondFibNum = input.nextInt();
		int thirdFibNum = input.nextInt();

		int num = input.nextInt();
		int step = input.nextInt();

		input.close();

		int max = 1000000;
		int nextFibNum = 0;
		int[] fibNums = new int[1000000];
		int[] nums = new int[1000000];

		for (int i = 0; i < max; i++) {

			nextFibNum = firstFibNum + secondFibNum + thirdFibNum;
			thirdFibNum = nextFibNum;
			secondFibNum = thirdFibNum;
			firstFibNum = secondFibNum;
			fibNums[i] = nextFibNum;

			nums[i] = num;
			num += step;
		}

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < fibNums.length; j++) {
				if (nums[i] == fibNums[j]) {
					System.out.println(nums[i]);
					return;
				}
			}
		}
		System.out.println("No");

	}

}
