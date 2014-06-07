package org.stu.sampleexam02;

import java.util.Scanner;

public class _02OddEvenSum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numN = input.nextInt();
		int[] nums = new int[numN * 2];
		
		for (int i = 0; i < numN * 2; i++) {
			nums[i] = input.nextInt();
		}
		
		input.close();
		
		long oddSum = 0;
		long evenSum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				oddSum += nums[i];
			} else {
				evenSum += nums[i];
			}
		}
		
		if (oddSum == evenSum) {
			System.out.println("Yes, sum=" + oddSum);
		} else {
			System.out.println("No, diff=" + Math.abs(oddSum - evenSum));
		}
	}

}
