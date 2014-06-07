package org.stu.sampleexam03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class _01WorkHours {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int reqWorkHoursProj = input.nextInt(); // 60 HOURS
		int daysAvailableProj = input.nextInt(); // 6 DAYS
		int productivity = input.nextInt();// 75% PRODUCTIVITY

		BigDecimal days = new BigDecimal(daysAvailableProj);
		BigDecimal prodP = new BigDecimal(productivity);

		input.close();

		BigDecimal totalWorkHours =
				((days.divide(new BigDecimal(1.1), 1, RoundingMode.DOWN)
						.multiply(new BigDecimal(12)))
						.multiply(prodP)).divide(new BigDecimal(100), 1,
						RoundingMode.DOWN);

		int result = totalWorkHours.intValue() - reqWorkHoursProj;
		if (result >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		System.out.println(result);
	}
}
