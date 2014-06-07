package org.stu.sampleexam02;

import java.util.Scanner;

public class _04HayvanNumbers {

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

		for (int i1 = 5; i1 <= 9; i1++) {
			for (int i2 = 5; i2 <= 9; i2++) {
				for (int i3 = 5; i3 <= 9; i3++) {
					for (int i4 = 5; i4 <= 9; i4++) {
						for (int i5 = 5; i5 <= 9; i5++) {
							for (int i6 = 5; i6 <= 9; i6++) {
								for (int i7 = 5; i7 <= 9; i7++) {
									for (int i8 = 5; i8 <= 9; i8++) {
										for (int i9 = 5; i9 <= 9; i9++) {
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
											if (((((ghi - def == def - abc)
													&& diff == def - abc))
													&& (a + b + c + d + e + f
													+ g + h + i) == sum)
													&& (abc <= def && def <= ghi)) {
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
