package org.stu.homework03;
import java.util.ArrayList;
import java.util.Collections;

public class _03FullHouse {

	public static void main(String[] args) {

		ArrayList<String> deck = generateCardDeck();
		ArrayList<String> resultFirstHalf =
				findFullHouseCombinationsFirstHalf(deck);
		ArrayList<String> resultSecondHalf =
				findFullHouseCombinationsSecondHalf(deck);
		ArrayList<String> result =
				combineResult(resultFirstHalf, resultSecondHalf);
		printResult(result);

	}

	private static void printResult(ArrayList<String> result) {

		for (String str : result) {
			System.out.println(str);
		}

		System.out.println(result.size() + " full houses");

	}

	private static ArrayList<String> combineResult(
			ArrayList<String> resultFirstHalf,
			ArrayList<String> resultSecondHalf) {

		resultFirstHalf.addAll(resultSecondHalf);
		Collections.sort(resultFirstHalf);

		return resultFirstHalf;
	}

	private static ArrayList<String> findFullHouseCombinationsSecondHalf(
			ArrayList<String> deck) {

		ArrayList<String> result = new ArrayList<String>();

		for (int fifthCard = deck.size() - 1; fifthCard >= 0; fifthCard--) {
			for (int fourthCard = fifthCard - 1; fourthCard >= 0; fourthCard--) {
				for (int thirdCard = fourthCard - 1; thirdCard >= 0; thirdCard--) {
					for (int secondCard = thirdCard - 1; secondCard >= 0; secondCard--) {
						for (int firstCard = secondCard - 1; firstCard >= 0; firstCard--) {

							if ((deck.get(fifthCard).charAt(0) == deck.get(
									fourthCard).charAt(0))
									&& (deck.get(fourthCard).charAt(0) == deck
											.get(thirdCard).charAt(0))
									&& (deck.get(secondCard).charAt(0)) == deck
											.get(firstCard).charAt(0)) {

								result.add("( " + deck.get(fifthCard) + " "
										+ deck.get(fourthCard) + " "
										+ deck.get(thirdCard) + " "
										+ deck.get(secondCard) + " "
										+ deck.get(firstCard) + " ) ");

							}

						}
					}
				}
			}
		}

		return result;
	}

	private static ArrayList<String> findFullHouseCombinationsFirstHalf(
			ArrayList<String> deck) {

		ArrayList<String> result = new ArrayList<String>();

		for (int firstCard = 0; firstCard < deck.size() - 4; firstCard++) {
			for (int secondCard = firstCard + 1; secondCard < deck.size() - 3; secondCard++) {
				for (int thirdCard = secondCard + 1; thirdCard < deck.size() - 2; thirdCard++) {
					for (int fourthCard = thirdCard + 1; fourthCard < deck
							.size() - 1; fourthCard++) {
						for (int fifthCard = fourthCard + 1; fifthCard < deck
								.size(); fifthCard++) {

							if ((deck.get(firstCard).charAt(0) == deck.get(
									secondCard).charAt(0))
									&& (deck.get(secondCard).charAt(0) == deck
											.get(thirdCard).charAt(0))
									&& (deck.get(fourthCard).charAt(0)) == deck
											.get(fifthCard).charAt(0)) {

								result.add("( " + deck.get(firstCard) + " "
										+ deck.get(secondCard) + " "
										+ deck.get(thirdCard) + " "
										+ deck.get(fourthCard) + " "
										+ deck.get(fifthCard) + " ) ");

							}

						}
					}
				}
			}
		}
		return result;
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
