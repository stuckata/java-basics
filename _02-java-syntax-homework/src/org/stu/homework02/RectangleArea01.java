package org.stu.homework02;

import java.util.Scanner;

public class RectangleArea01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out
				.println("Enter the two sides of a rectangle to calculate the area:");
		System.out.print("a = ");

		int sideA = input.nextInt();

		System.out.print("b = ");

		int sideB = input.nextInt();
		long area = sideA * sideB;

		System.out.printf("area = %d", area);
		input.close();

	}

}
