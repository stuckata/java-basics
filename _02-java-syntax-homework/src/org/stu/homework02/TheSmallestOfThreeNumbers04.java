package org.stu.homework02;

public class TheSmallestOfThreeNumbers04 {

	public static void main(String[] args) {

		System.out
				.println("This program finds the smallest of three given numbers.");

		double numA = 5;
		double numB = 2;
		double numC = 2;

		System.out.println("The given numbers are: " + numA + " " + numB + " "
				+ numC);

		if (numA >= numB && numA >= numC) {
			System.out.println(numA);
		} else if (numB >= numA && numB >= numC) {
			System.out.println(numB);
		} else {
			System.out.println(numC);
		}

	}

}
