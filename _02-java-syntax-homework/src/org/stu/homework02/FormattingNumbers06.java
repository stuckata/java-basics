package org.stu.homework02;

import java.util.Scanner;

public class FormattingNumbers06 {

	public static void main(String[] args) {

		int intNum = (int) enterNumber();
		double doubleNumB = enterNumber();
		double doubleNumC = enterNumber();
		printNumbers(intNum, doubleNumB, doubleNumC);

	}

	private static void printNumbers(int intNum, double doubleNumB,
			double doubleNumC) {

		String strIntHex = Integer.toHexString(intNum);
		String strIntBinary =
				String.format("%10s", Integer.toBinaryString(intNum)).replace(
						' ', '0');

		System.out.printf("|%1$-10s|%2$s|%3$10.2f|%4$-10.3f|",
				strIntHex.toUpperCase(), strIntBinary, doubleNumB, doubleNumC);
	}

	@SuppressWarnings("resource")
	private static double enterNumber() {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		double num = input.nextDouble();

		return num;

	}
}
