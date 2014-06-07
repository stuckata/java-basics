package org.stu.homework02;

import java.util.Scanner;

public class PointsInsideFigure03 {

	public static void main(String[] args) {

		System.out
				.println("This program check if a point is inside or outside a given figure.");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coordinates of the point:");
		System.out.print("x = ");
		float x = input.nextFloat();
		System.out.print("y = ");
		float y = input.nextFloat();
		
		checkIfInsideOrOutsideFigure(x, y);
		input.close();
	}
	
	static void checkIfInsideOrOutsideFigure(float x, float y) {
		
		if ((x >= 12.5 && x <= 22.5) && (y >= 6 && y <= 13.5)) {
			if ((x > 17.5 && x < 20) && (y > 8.5)) {
				System.out.println("Outside");
			} else {
				System.out.println("Inside");
			}
		} else {
			System.out.println("Outside");
		}
	}

}
