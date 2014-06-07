package org.stu.sampleexam01;

import java.util.Scanner;

public class _01JoroFootballPlayer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String leapOrNot = input.nextLine();
		int holidayNums = input.nextInt();
		int weekHT = input.nextInt();
		int totalWeekends = 52 - weekHT;
		int totalWeekendsPlayed = totalWeekends * 2 / 3;
		int holidaysPlayed = holidayNums * 1 / 2;
		int result = 0;

		input.close();

		if (leapOrNot.equals("t")) {
			result = totalWeekendsPlayed + holidaysPlayed + weekHT + 3;
		} else {
			result = totalWeekendsPlayed + holidaysPlayed + weekHT;
		}

		System.out.println(result);

	}

}
