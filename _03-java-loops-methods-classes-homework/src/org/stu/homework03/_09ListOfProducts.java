package org.stu.homework03;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _09ListOfProducts {

	public static void main(String[] args) {

		System.out
				.println("This program reads a text file with products and their prices and return them sorted by price on the console.");

		List<String> data = readTextFile();
		List<Product> products = new ArrayList<Product>();
		for (int i = 0; i < data.size(); i++) {
			products.add(new Product(data.get(i)));
		}

		Collections.sort(products);
		try {
			createOutputFile(products);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	private static void createOutputFile(List<Product> products)
			throws FileNotFoundException, UnsupportedEncodingException {

		try (PrintWriter writer = new PrintWriter("Output.txt", "UTF-8")) {
			for (Product product : products) {
				writer.println(product.toString());
			}

		}
	}

	private static List<String> readTextFile() {

		String fileName = "Input.txt";
		List<String> data = new ArrayList<String>();

		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader buffRead = new BufferedReader(inputFile);
			String tempLineBuff = "";

			while ((tempLineBuff = buffRead.readLine()) != null) {
				data.add(tempLineBuff);
			}
			buffRead.close();

		} catch (Exception e) {
			System.out.println("Error");
		}

		return data;
	}
}
