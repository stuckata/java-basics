package org.stu.homework03;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _06RandomHandsOf5Cards {

	public static void main(String[] args) {

		System.out
				.println("This program generate N count random hands of five cards each.");

		ArrayList<String> deck = generateCardDeck();
		int numN = inputNumberOfHands();
		ArrayList<String> result = generateRandomHands(deck, numN);
		printResult(result);
	}

	private static void printResult(ArrayList<String> result) {

		for (String str : result) {
			System.out.println(str);
		}

	}

	private static ArrayList<String> generateRandomHands(
			ArrayList<String> deck, int numN) {

		ArrayList<String> hands = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(deck);

		for (int i1 = 0; i1 < numN; i1++) {

			String tempStr = "( ";

			for (int i2 = 0; i2 < 5; i2++) {
				int randNum = generateRandomNum(temp.size());
				tempStr += temp.get(randNum) + " ";
				temp.remove(randNum);
			}
			tempStr += ")";
			hands.add(tempStr);

		}
		return hands;
	}

	private static int generateRandomNum(int cardsCount) {

		Random random = new Random();
		int num = random.nextInt(cardsCount - 0) + 0;

		return num;
	}

	@SuppressWarnings("resource")
	private static int inputNumberOfHands() {

		System.out
				.print("Please enter the number of hands to be generated: ");
		Scanner input = new Scanner(System.in);
		int numN = input.nextInt();

		return numN;
	}

	private static ArrayList<String> generateCardDeck() {

		String[] suitsArr = { "♣", "♦", "♥", "♠" };
		String[] facesArr =
		{ "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
				"A" };
		ArrayList<String> deck = new ArrayList<String>();

		for (int face = 0; face < facesArr.length; face++) {
			for (int suit = 0; suit < suitsArr.length; suit++) {

				String temp = facesArr[face] + suitsArr[suit];
				deck.add(temp);
			}
		}

		return deck;
	}

}
