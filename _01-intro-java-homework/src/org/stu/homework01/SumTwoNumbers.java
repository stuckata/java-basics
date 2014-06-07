package org.stu.homework01;

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		System.out
				.println("This program calculate the sum of two integer numbers.");
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the two numbers:");
		System.out.print("a = ");

		int numA = input.nextInt();

		System.out.print("b = ");

		int numB = input.nextInt();
		int sum = numA + numB;

		System.out.println("sum = " + sum);
		input.close();
	}

}
