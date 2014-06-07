package org.stu.homework02;

public class CountOfEqualBitPairs08 {

	public static void main(String[] args) {
		
		int num = 62241;
		int counter = findSequences(num);
		printResult(counter, num);

	}

	private static void printResult(int counter, int num) {
		
		System.out.println("The number is: " + num);
		System.out.println("The sequences of two equal bits: " + counter);
		
	}

	private static int findSequences(int num) {
		
		int counter = 0; 
		int reference = Integer.MIN_VALUE;
		int temp = Integer.MIN_VALUE;
		
		while (num > 0) {
			if ((num & 1) == 1) {
				temp = 1;		
			} else {
				temp = 0;
			}
			if (temp == reference) {
				counter++;
			}
			reference = temp;
			num = num >> 1;
		}
		
		return counter;
	}

}
