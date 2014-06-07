package org.stu.homework03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class _08SumNumbersFromATextFile {

	public static void main(String[] args) {

		System.out
				.println("This program reads integers stored in a text file and return the value of their sum.");

		String fileName = "Input.txt";
		ArrayList<String> inputStr = readFile(fileName);
		int sum = sumNumbers(inputStr);
		if (inputStr.size() == 0) {
			return;
		} else {
			System.out.println("Sum = " + sum);
		}
		
	}

	private static int sumNumbers(ArrayList<String> inputStr) {
		
		int sum = 0;
		int temp = 0;
		
		for (int i = 0; i < inputStr.size(); i++) {
			String numOnly = inputStr.get(i).replaceAll("[^-0-9]", "");
			temp = Integer.parseInt(numOnly);
			sum += temp;
		}
		
		return sum;
	}

	private static ArrayList<String> readFile(String fileName) {

		ArrayList<String> inputStr = new ArrayList<String>();

		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader buffRead = new BufferedReader(inputFile);
			String tempLineBuff = "";

			while ((tempLineBuff = buffRead.readLine()) != null) {
				inputStr.add(tempLineBuff);
			}
			buffRead.close();

		} catch (Exception e) {
			System.out.println("Error");
		}
		return inputStr;
	}

}
