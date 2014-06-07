package org.stu.homework03;
import java.util.Scanner;

public class _05AngleUnitConverter {

	public static void main(String[] args) {

		System.out
				.println("This program converts degrees to radians and vice versa.");

		int numOfConv = intputNumberOfConversions();
		String[] inputStr = inputDataToBeConverted(numOfConv);
		String[] result = generateResult(inputStr);
		printResult(result);

	}

	private static void printResult(String[] result) {
		for (String str : result) {
			System.out.println(str);
		}

	}

	private static String[] generateResult(String[] inputStr) {

		String[] result = new String[inputStr.length];

		for (int i = 0; i < inputStr.length; i++) {
			result[i] = convertInputData(inputStr[i]);
		}
		return result;

	}

	private static String convertInputData(String str) {

		String convertedResult = "";

		if (str.charAt(str.length() - 1) == 'g') {
			convertedResult = convertDegreesToRadians(str);

		} else {
			convertedResult = convertRadiansToDegrees(str);
		}

		return convertedResult;
	}

	private static String convertDegreesToRadians(String str) {
		String[] splitStr = str.split(" ");
		double degrees = Double.parseDouble(splitStr[0]);
		double radians = degrees * Math.PI / 180;
		String result = String.format("%.6f", radians);

		result = result + " rad";
		return result;
	}

	private static String convertRadiansToDegrees(String str) {
		String[] splitStr = str.split(" ");
		double radians = Double.parseDouble(splitStr[0]);
		double degrees = radians * 180 / Math.PI;
		String result = String.format("%.6f", degrees);

		result = result + " deg";
		return result;
	}

	@SuppressWarnings("resource")
	private static String[] inputDataToBeConverted(int numOfConv) {
		Scanner input = new Scanner(System.in);
		String[] inputStr = new String[numOfConv];

		for (int i = 0; i < numOfConv; i++) {
			inputStr[i] = input.nextLine();
		}
		return inputStr;
	}

	@SuppressWarnings("resource")
	private static int intputNumberOfConversions() {
		System.out.print("Enter number of conversions: ");
		Scanner input = new Scanner(System.in);
		int numOfConv = input.nextInt();
		return numOfConv;
	}

}
