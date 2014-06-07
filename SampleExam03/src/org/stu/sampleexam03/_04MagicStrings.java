package org.stu.sampleexam03;

import java.util.Scanner;

public class _04MagicStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int diff = input.nextInt();

		char[] letters = { 'k', 'n', 'p', 's' }; // weight('s') = 3; weight('n')
													// = 4; weight('k') = 1;
													// weight('p') = 5

		int counter = 0;

		for (int i1 = 0; i1 < letters.length; i1++) {
			for (int i2 = 0; i2 < letters.length; i2++) {
				for (int i3 = 0; i3 < letters.length; i3++) {
					for (int i4 = 0; i4 < letters.length; i4++) {
						String firstHalf =
								"" + letters[i1] + letters[i2] + letters[i3]
										+ letters[i4];

						int weightFirstHalf = calculateWeight(firstHalf);

						for (int i5 = 0; i5 < letters.length; i5++) {
							for (int i6 = 0; i6 < letters.length; i6++) {
								for (int i7 = 0; i7 < letters.length; i7++) {
									for (int i8 = 0; i8 < letters.length; i8++) {

										String secondHalf =
												"" + letters[i5] + letters[i6]
														+ letters[i7]
														+ letters[i8];

										int weightSecondHalf =
												calculateWeight(secondHalf);

										if (Math.abs(weightFirstHalf
												- weightSecondHalf) == diff) {

											System.out.println(firstHalf
													+ secondHalf);

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

		if (counter == 0) {
			System.out.println("No");
		}

		input.close();

	}

	private static int calculateWeight(String half) {
		int weight = 0;
		for (int i = 0; i < half.length(); i++) {
			switch (half.charAt(i)) {
			case 'k':
				weight += 1;
				break;
			case 's':
				weight += 3;
				break;
			case 'n':
				weight += 4;
				break;
			case 'p':
				weight += 5;
				break;
			}
		}
		return weight;
	}
}
