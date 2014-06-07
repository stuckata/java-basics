package org.stu.sampleexam02;

import java.util.Scanner;

public class _01Volleyball {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String leapOrNot = input.nextLine();
		double numOfHollydays = input.nextDouble();
		double numOfWeekendsInHome = input.nextDouble();
		double weekends = 48 - numOfWeekendsInHome;
		double weekendsPlayed = weekends * 3 / 4;
		double numOfHollydaysPlayed = numOfHollydays * 2 / 3;
		double result = 0;

		input.close();

		double totalPlay =
				numOfHollydaysPlayed + weekendsPlayed + numOfWeekendsInHome;

		if (leapOrNot.equals("leap")) {
			result = 15 * totalPlay / 100 + totalPlay;
			System.out.println((int)result);
		} else {
			result = totalPlay;
			System.out.println((int)result);
		}

	}

}
