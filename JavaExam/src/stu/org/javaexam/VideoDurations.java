package stu.org.javaexam;

import java.util.ArrayList;
import java.util.Scanner;

public class VideoDurations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<String> inputTimes = new ArrayList<String>();
		String end = "End";

		String temp = "";

		while (!temp.equals(end)) {
			temp = input.nextLine();
			if (!temp.equals(end)) {
				inputTimes.add(temp);
			}

		}

		input.close();

		int[] hours = new int[inputTimes.size()];
		int[] minutes = new int[inputTimes.size()];

		for (int i = 0; i < inputTimes.size(); i++) {
			String[] inputHM = new String[2];
			inputHM = inputTimes.get(i).split(":");
			hours[i] = Integer.parseInt(inputHM[0]);
			minutes[i] = Integer.parseInt(inputHM[1]);
		}

		int sumMinutes = 0;
		int additionalHours = 0;

		for (int i = 0; i < minutes.length; i++) {
			sumMinutes += minutes[i];
			if (sumMinutes >= 60) {
				sumMinutes -= 60;
				additionalHours++;
			}
		}
		int sumHours = 0;
		for (int i = 0; i < hours.length; i++) {
			sumHours += hours[i];
		}

		sumHours = sumHours + additionalHours;

		if (sumMinutes < 10) {
			System.out.println(sumHours + ":0" + sumMinutes);
		} else {
			System.out.println(sumHours + ":" + sumMinutes);
		}

	}

}
