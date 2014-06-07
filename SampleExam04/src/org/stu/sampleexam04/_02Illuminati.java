package org.stu.sampleexam04;

import java.util.Scanner;

public class _02Illuminati {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine().toLowerCase();

		input.close();

		// A = 65, E = 69, I = 73, O = 79, U = 85
		int counter = 0;
		int sum = 0;

		for (int i = 0; i < line.length(); i++) {

			switch (line.charAt(i)) {
			case 'a':
				sum += 65;
				counter++;
				break;
			case 'e':
				sum += 69;
				counter++;
				break;
			case 'i':
				sum += 73;
				counter++;
				break;
			case 'o':
				sum += 79;
				counter++;
				break;
			case 'u':
				sum += 85;
				counter++;
				break;
			}

		}
		System.out.println(counter);
		System.out.println(sum);
	}

}
