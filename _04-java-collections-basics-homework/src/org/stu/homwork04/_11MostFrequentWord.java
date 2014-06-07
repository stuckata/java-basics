package org.stu.homwork04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class _11MostFrequentWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().toLowerCase().split("[^a-zA-Z]+");

		input.close();

		HashMap<String, Integer> countWord = new HashMap<String, Integer>();
		for (String str : words) {
			Integer count = countWord.get(str);
			if (count == null) {
				count = 0;
			}
			countWord.put(str, count + 1);
		}

		// System.out.println(countWord);

		List<String> frequentWords = new ArrayList<>();
		Integer currentFrequency = 0;
		Integer currentCounter = new Integer(0);

		for (String key : countWord.keySet()) {

			currentFrequency = countWord.get(key);

			if (currentFrequency > currentCounter) {
				currentCounter = currentFrequency;
				frequentWords.clear();
			}

			if (currentFrequency == currentCounter) {
				frequentWords.add(key);
			}
		}

		Collections.sort(frequentWords);

		for (String str : frequentWords) {
			System.out.println(str + " -> " + currentCounter.toString()
					+ " times");
		}

	}

}
