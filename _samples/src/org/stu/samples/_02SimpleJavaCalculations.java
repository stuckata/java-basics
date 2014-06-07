package org.stu.samples;

import java.util.Scanner;

public class _02SimpleJavaCalculations {

	public static void main(String[] args) {
		System.out
				.println("This program calculate the area and perimeter of given rectangle.");

		Scanner input = new Scanner(System.in);
		System.out.print("Enter \"a\" = ");
		int numA = input.nextInt();
		System.out.print("Enter \"b\" = ");
		int numB = input.nextInt();

		input.close();

		int area = 0;
		int perimeter = 0;

		area = numA * numB;
		perimeter = 2 * numA + 2 * numB;

		System.out.printf("Perimeter = %d Area = %d", perimeter, area);

	}

}
