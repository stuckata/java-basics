package org.stu.sampleexam04;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class _01Cinema {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String type = input.nextLine();
		int rows = input.nextInt();
		int columns = input.nextInt();

		input.close();

		int people = rows * columns;
		BigDecimal price = new BigDecimal(0.00);

		if (type.equals("Premiere")) {
			price = new BigDecimal(12.00);
		} else if (type.equals("Normal")) {
			price = new BigDecimal(7.50);
		} else {
			price = new BigDecimal(5.00);
		}

		BigDecimal income = price.multiply(new BigDecimal(people));

		DecimalFormatSymbols point =
				new DecimalFormatSymbols(Locale.getDefault());
		point.setDecimalSeparator('.');

		System.out.printf(new DecimalFormat("0.00", point).format(income)
				+ " leva");

	}

}
