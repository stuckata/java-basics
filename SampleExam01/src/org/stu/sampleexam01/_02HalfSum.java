package org.stu.sampleexam01;

import java.util.Scanner;

public class _02HalfSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numN = input.nextInt();
		int[] arrNums = new int[numN * 2];

		for (int i = 0; i < numN * 2; i++) {
			arrNums[i] = input.nextInt();
		}

		input.close();

		long sumFH = 0;
		long sumSH = 0;

		for (int i = 0; i < numN; i++) {
			sumFH += arrNums[i];
			sumSH += arrNums[numN + i];
		}

		if (sumFH == sumSH) {
			System.out.println("Yes, sum=" + sumFH);
		} else {
			System.out.println("No, diff=" + (Math.abs(sumSH - sumFH)));
		}

	}
}
