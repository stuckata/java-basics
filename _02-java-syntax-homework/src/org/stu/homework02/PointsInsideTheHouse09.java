package org.stu.homework02;

import java.util.Scanner;

public class PointsInsideTheHouse09 {

	public static void main(String[] args) {
		System.out
				.println("This program check if a point is inside a given with its coordinates house or not.");

		Scanner input = new Scanner(System.in);

		System.out
				.println("Enter the coordinates of the point on a single line separated by a space: ");
		System.out.print("Input (x y): ");

		String inputXY = input.nextLine();

		input.close();

		double[] pointXY = extractCoordinates(inputXY);
		checkIfPointInsideHouse(pointXY);

	}

	private static void checkIfPointInsideHouse(double[] pointXY) {

		if (isInsideHouse(pointXY) || isInsideRoof(pointXY)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}

	}

	private static boolean isInsideRoof(double[] pointXY) {

		double pX = pointXY[0];
		double pY = pointXY[1];
		double aX = 12.5;
		double aY = 8.5;
		double bX = 22.5;
		double bY = aY;
		double cX = 17.5;
		double cY = 3.5;
		double pAB =
				((bX - aX) * (pY - aY) - (bY - aY) * (pX - aX));
		double pBC =
				((cX - bX) * (pY - bY) - (cY - bY) * (pX - bX));
		double pCA =
				((aX - cX) * (pY - cY) - (aY - cY) * (pX - cX));
		boolean isInside = false;
		
		if ((pAB == 0 || pBC == 0) || pCA == 0) {
			isInside = true;
		} else if ((pAB > 0 && pBC > 0) && pCA > 0) {
			isInside = true;
		} else if ((pAB < 0 && pBC < 0) && pCA < 0) {
			isInside = true;
		}

		return isInside;
	}

	private static boolean isInsideHouse(double[] pointXY) {

		double pX = pointXY[0];
		double pY = pointXY[1];
		boolean isInside =
				(((pX >= 12.5 && pX <= 17.5) || (pX >= 20 && pX <= 22.5)) && (pY >= 8.5 && pY <= 13.5));

		return isInside;
	}

	private static double[] extractCoordinates(String inputXY) {

		double[] pointXY = new double[2];
		String[] coordXY = inputXY.split(" ");
		pointXY[0] = Double.parseDouble(coordXY[0]);
		pointXY[1] = Double.parseDouble(coordXY[1]);

		return pointXY;
	}

}
