package org.stu.homework03;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class _10OrderOfProducts {

	public static void main(String[] args) {

		List<String> inputTxt = readFile();
		List<Product> products = new ArrayList<Product>();
		for (String string : inputTxt) {
			products.add(new Product(string, false));
		}
		List<String> orderTxt = readOrder();
		List<Product> orders = new ArrayList<Product>();
		for (String product : orderTxt) {
			orders.add(new Product(product, true));
		}

		BigDecimal sum = new BigDecimal(0);

		for (Product order : orders) {
			for (Product product : products) {
				if (order.getName().equals(product.getName())) {
					sum = sum.add(product.multiply(order.getQuantity()));
				}
			}
		}

		sum = sum.setScale(2, BigDecimal.ROUND_CEILING);

		try {
			createOutputFile(sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	private static void createOutputFile(BigDecimal sum)
			throws FileNotFoundException, UnsupportedEncodingException {

		try (PrintWriter writer = new PrintWriter("Output.txt", "UTF-8")) {
			writer.println(sum.toString());

		}

	}

	private static List<String> readFile() {

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

	private static List<String> readOrder() {

		String fileName = "Order.txt";
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
