package stu.org.javaexam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CouplesFrequency {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
		String[] numsStr = input.nextLine().split(" ");

		input.close();

		int[] nums = new int[numsStr.length];
		double percentPerCouple = (1.0 / (nums.length - 1)) * 100;

		for (int i = 0; i < numsStr.length; i++) {
			nums[i] = Integer.parseInt(numsStr[i]);
		}

		Map<String, Integer> result = new HashMap<String, Integer>();

		for (int i = 0; i < nums.length - 1; i++) {
			Integer count = result.get(nums[i] + " " + nums[i + 1]);
			if (count == null) {
				count = 0;
			}
			result.put(nums[i] + " " + nums[i + 1], count + 1);
		}

		List<String> reference = new ArrayList<String>();

		double percent = 0.0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (!reference.contains(nums[i] + " " + nums[i + 1])) {
				percent = result.get(nums[i] + " " + nums[i + 1])
						* percentPerCouple;
				System.out.printf(nums[i] + " " + nums[i + 1] + " -> " + "%.2f"
						+ "%%", percent);
				System.out.println();
				reference.add(nums[i] + " " + nums[i + 1]);

			}
		}
	}

}
