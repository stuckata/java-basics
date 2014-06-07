package org.stu.homwork04;

import java.util.HashMap;
import java.util.Scanner;

public class _06CountSpecifiedWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split("[^a-zA-Z]+");
		String word = input.nextLine();

		input.close();

		HashMap<String, Integer> countWord = new HashMap<String, Integer>();
		for (String str : words) {
			Integer count = countWord.get(str.toLowerCase());
			if (count == null) {
				count = 0;
			}
			countWord.put(str.toLowerCase(), count + 1);
		}
		// System.out.println(countWord);
		if (countWord.get(word.toLowerCase()) != null) {
			System.out.println(countWord.get(word.toLowerCase()));
		} else {
			System.out.println("0");
		}
			

	}

}
