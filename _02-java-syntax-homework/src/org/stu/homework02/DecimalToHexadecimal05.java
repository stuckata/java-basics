package org.stu.homework02;

import java.util.Scanner;

public class DecimalToHexadecimal05 {

	public static void main(String[] args) {

		System.out
				.println("This program let you enter a positive integer number and return hexadecimal value.");

		int num = enterNum();
		String hexNum = convertToHex(num);
		printResult(hexNum, num);
	}

	static int enterNum() {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		input.close();
		return num;
	}

	static String convertToHex(int num) {

		String hexNum = Integer.toHexString(num);

		return hexNum;
	}

	static void printResult(String hexNum, int num) {

		System.out.println("decimal " + num + " = " + hexNum.toUpperCase());

	}

}
