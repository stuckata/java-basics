package org.stu.homework03;
import java.util.ArrayList;

public class _01SymmetricNumbersInRange {

	public static void main(String[] args) {

		int startNum = 555;
		int endNum = 777;

		ArrayList<Integer> listOfNums =
				new ArrayList<Integer>(
						findAllSymmetricNumbers(startNum, endNum));
		printResult(listOfNums);

	}

	private static void printResult(ArrayList<Integer> listOfNums) {
		for (Integer integer : listOfNums) {
			System.out.print(integer + " ");
		}

	}

	private static ArrayList<Integer> findAllSymmetricNumbers(
			int startNum, int endNum) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = startNum; i <= endNum; i++) {
			if (i < 10) {
				list.add(i);
			} else {
				boolean isSymmetric = checkIfNumIsSymmetric(i);
				if (isSymmetric) {
					list.add(i);
				}
			}
		}

		return list;
	}

	private static boolean checkIfNumIsSymmetric(int num) {

		ArrayList<Integer> digits = new ArrayList<Integer>(findDigits(num));
		int length = digits.size();
		boolean isSymmetric = false;

		for (int i = 0; i < length / 2; i++) {
			if (digits.get(i) == digits.get(length - i - 1)) {
				isSymmetric = true;
			} else {
				isSymmetric = false;
				break;
			}
		}

		return isSymmetric;
	}

	private static ArrayList<Integer> findDigits(int num) {

		ArrayList<Integer> digits = new ArrayList<Integer>();
		int temp = 0;

		while (num >= 1) {
			temp = (num % 10);
			digits.add(temp);
			num /= 10;
		}

		return digits;
	}

}
