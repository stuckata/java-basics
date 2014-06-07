package org.stu.homework02;

import java.util.Scanner;

public class TriangleArea02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the two coordinates of pointA X and Y:");
		System.out.print("Ax = ");
		double pointAx = input.nextDouble();
		System.out.print("Ay = ");
		double pointAy = input.nextDouble();

		System.out.println("Enter the two coordinates of pointB X and Y:");
		System.out.print("Bx = ");
		double pointBx = input.nextDouble();
		System.out.print("By = ");
		double pointBy = input.nextDouble();

		System.out.println("Enter the two coordinates of pointC X and Y:");
		System.out.print("Cx = ");
		double pointCx = input.nextDouble();
		System.out.print("Cy = ");
		double pointCy = input.nextDouble();

		double area =
				Math.abs((pointAx * (pointBy - pointCy) + pointBx
						* (pointCy - pointAy) + pointCx * (pointAy - pointBy)) / 2);

		System.out.printf("area = %d", (int) area);
		input.close();
	}

}
