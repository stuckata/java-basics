package org.stu.homwork04;

import java.util.Scanner;

public class _05CountAllWords {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("[^a-zA-Z]+");

		input.close();
		System.out.println(words.length);

	}

}
