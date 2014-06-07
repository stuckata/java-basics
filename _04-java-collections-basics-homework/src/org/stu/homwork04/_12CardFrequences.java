package org.stu.homwork04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _12CardFrequences {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] cards =
				input.nextLine().replaceAll("\\s+", "").split("[^A-Z0-9]");

		input.close();

		double percentPerCard = (1.0 / cards.length) * 100;

		Map<String, Integer> result = new HashMap<String, Integer>();

		for (String str : cards) {
			Integer count = result.get(str);
			if (count == null) {
				count = 0;
			}
			result.put(str, count + 1);
		}

		List<String> reference = new ArrayList<String>();
		double percent = 0.0;
		for (String str : cards) {
			if (!reference.contains(str)) {
				percent = result.get(str)
						* percentPerCard;
				System.out.printf(str + " -> " + "%.2f"
						+ "%%", percent);
				System.out.println();
				reference.add(str);

			}

		}

		// System.out.println(result);

	}

}
