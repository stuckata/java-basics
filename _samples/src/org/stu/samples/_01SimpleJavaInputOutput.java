package org.stu.samples;

import java.util.Scanner;

public class _01SimpleJavaInputOutput {

	public static void main(String[] args) {
		
		System.out.println("Enter, Your text here: ");
		Scanner input = new Scanner(System.in);
		String yourInput = input.nextLine();
		System.out.println("Your Text: " + yourInput);
		System.out.println();
		input.close();

	}

}
