package org.stu.sampleexam01;

import java.util.Scanner;

public class _04NineDigitMagicNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int sum = input.nextInt();
		int diff = input.nextInt();

		input.close();

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;
		int i = 0;

		int abc = 0;
		int def = 0;
		int ghi = 0;

		int counter = 0;

		for (int i1 = 1; i1 <= 7; i1++) {
			for (int i2 = 1; i2 <= 7; i2++) {
				for (int i3 = 1; i3 <= 7; i3++) {
					for (int i4 = 1; i4 <= 7; i4++) {
						for (int i5 = 1; i5 <= 7; i5++) {
							for (int i6 = 1; i6 <= 7; i6++) {
								for (int i7 = 1; i7 <= 7; i7++) {
									for (int i8 = 1; i8 <= 7; i8++) {
										for (int i9 = 1; i9 <= 7; i9++) {
											a = i1;
											b = i2;
											c = i3;
											d = i4;
											e = i5;
											f = i6;
											g = i7;
											h = i8;
											i = i9;
											abc = (a * 100 + b * 10 + c);
											def = (d * 100 + e * 10 + f);
											ghi = (g * 100 + h * 10 + i);
											if ((((ghi - def == def - abc)
													&& diff == def - abc))
													&& (a + b + c + d + e + f
															+ g + h + i) == sum) {
												System.out.println("" + a + ""
														+ b + "" + c + "" + d
														+ "" + e + "" + f + ""
														+ g + "" + h + "" + i);

												counter++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (counter == 0) {
			System.out.println("No");
		}

	}
}
