package org.stu.homework03;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class _07DaysBetweenTwoDates {

	private static DateTimeFormatter DTF = DateTimeFormatter
			.ofPattern("dd-MM-yyyy");

	public static void main(String[] args) {

		System.out
				.println("This program calculate and return number of days between two entered dates");

		ArrayList<LocalDate> dates = enterDates();

		ZonedDateTime first = dates.get(0).atStartOfDay(ZoneId.systemDefault());
		ZonedDateTime second =
				dates.get(1).atStartOfDay(ZoneId.systemDefault());

		Duration duration = Duration.between(first, second);
		System.out.println(duration.toDays());

	}

	private static ArrayList<LocalDate> enterDates() {

		ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
		Scanner input = new Scanner(System.in);

		System.out
				.println("Please, enter first and second date in format dd-MM-yyyy: ");
		String firstDate = input.nextLine();
		String secondDate = input.nextLine();

		LocalDate startDate =
				LocalDate.parse(firstDate,
						DTF);
		LocalDate endDate =
				LocalDate.parse(secondDate,
						DTF);

		dates.add(startDate);
		dates.add(endDate);

		input.close();
		return dates;
	}

}
