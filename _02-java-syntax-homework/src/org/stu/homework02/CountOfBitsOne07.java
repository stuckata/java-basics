package org.stu.homework02;

public class CountOfBitsOne07 {

	public static void main(String[] args) {
		
		int num = 17263;
		int count = countBitsOne(num);
		printResult(count, num);

	}

	private static void printResult(int count, int num) {
		
		String numInHex = Integer.toBinaryString(num);
		
		System.out.printf("The number is: %d\n", num);
		System.out.printf("The number in Hex: %s\n", numInHex);
		System.out.printf("The count of 1 in Hex is: %d\n", count);
		
	}

	private static int countBitsOne(int num) {
		
		int counter = 0;
		
		while (num > 0) {
			if ((num & 1) == 1) {
				counter++;
			}
			num = num >> 1;
		}
		return counter;
	}

}
