package stu.org.javaexam;

import java.util.Scanner;

public class LargestThreeRectangles {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String inputStr = input.nextLine();
		String[] numsStr =
				inputStr.replaceAll("\\s+", "").replaceAll("\\[", "").replaceAll("\\]", "x").split("\\D+");

		input.close();

		int[] area = new int[numsStr.length / 2];

		for (int i = 0; i < numsStr.length / 2; i++) {
			int a = 0;
			int b = 0;
			a = Integer.parseInt(numsStr[i * 2]);
			b = Integer.parseInt(numsStr[i * 2 + 1]);
			area[i] = a * b;
		}
		
		int sum = 0;
		int temp = 0;
		
		for (int i1 = 0; i1 < area.length - 2; i1++) {
			for (int i2 = i1 + 1; i2 < area.length - 1; i2++) {
				for (int i3 = i2 + 1; i3 < area.length; i3++) {
					if (i1 + 1 == i2 && i2 + 1 == i3) {
					temp = area[i1] + area[i2] + area[i3];
					if(temp > sum) {
						sum = temp;
					}
					temp = 0;
					}
				}
			}
		}

		System.out.println(sum);
	}

}