package stu.org.javaexam;

import java.util.Scanner;

public class PythagoreanNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numN = input.nextInt();
		int[] nums = new int[numN];

		for (int i = 0; i < numN; i++) {
			nums[i] = input.nextInt();
		}

		input.close();

		int a = 0;
		int b = 0;
		int c = 0;
		
		int counter = 0;

		for (int i1 = 0; i1 < nums.length; i1++) {
			for (int i2 = 0; i2 < nums.length; i2++) {
				for (int i3 = 0; i3 < nums.length; i3++) {
					a = nums[i1];
					b = nums[i2];
					c = nums[i3];
					if (a <= b && (a * a + b * b == c * c)) {
						System.out.println(a + "*" + a + " + " + b + "*" + b
								+ " = " + c + "*" + c);
						
						counter++;
					}
				}
			}
		}
		
		if (counter == 0) {
			System.out.println("No");
		}

	}

}
