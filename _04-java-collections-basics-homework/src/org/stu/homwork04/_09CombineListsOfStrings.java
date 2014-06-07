package org.stu.homwork04;

import java.util.ArrayList;
import java.util.Scanner;

public class _09CombineListsOfStrings {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Character> firstList = new ArrayList<Character>();
		ArrayList<Character> secondList = new ArrayList<Character>();

		for (Character character : input.nextLine().toCharArray()) {
			firstList.add(character);
		}

		for (Character character : input.nextLine().toCharArray()) {
			secondList.add(character);
		}

		input.close();

		secondList.removeAll(firstList);
		char space = firstList.get(1);

		for (Character ch : secondList) {
			firstList.add(space);
			firstList.add(ch);
		}

		firstList.stream().forEach(ch -> System.out.print(ch));

	}
}
