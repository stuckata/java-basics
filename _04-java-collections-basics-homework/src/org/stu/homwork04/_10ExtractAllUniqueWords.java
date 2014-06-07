package org.stu.homwork04;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().toLowerCase().split("[^a-zA-Z]+");
		Set<String> result = new TreeSet<String>();

		for (String str : words) {
			result.add(str);
		}

		for (String str : result) {
			System.out.print(str + " ");
		}

		input.close();

	}

}
