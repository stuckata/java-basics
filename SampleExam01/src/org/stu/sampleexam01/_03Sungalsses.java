package org.stu.sampleexam01;

import java.util.Scanner;

public class _03Sungalsses {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numN = input.nextInt();

		input.close();

		char frame = '*';
		int frameLength = 2 * numN;
		char lenses = '/';
		int lensesHight = numN - 2;
		int lensesLength = frameLength - 2;
		char bridge = '|';
		int bridgeLength = numN;

		printFrame(frame, frameLength);
		printGap(bridgeLength);
		printFrame(frame, frameLength);
		System.out.println();

		for (int i = 1; i <= lensesHight; i++) {
			System.out.print(frame);
			printLenses(lenses, lensesLength);
			System.out.print(frame);
			if (i == (numN / 2)) {
				printBridge(bridge, bridgeLength);
			} else {
				printGap(bridgeLength);
			}
			System.out.print(frame);
			printLenses(lenses, lensesLength);
			System.out.print(frame);
			System.out.println();
		}

		printFrame(frame, frameLength);
		printGap(bridgeLength);
		printFrame(frame, frameLength);
	}

	private static void printBridge(char bridge, int bridgeLength) {
		for (int j = 1; j <= bridgeLength; j++) {
			System.out.print(bridge);
		}
	}

	private static void printLenses(char lenses, int lensesLength) {
		printBridge(lenses, lensesLength);
	}

	private static void printGap(int bridgeLength) {
		for (int i = 1; i <= bridgeLength; i++) {
			System.out.print(' ');
		}
	}

	private static void printFrame(char frame, int frameNum) {
		printLenses(frame, frameNum);
	}

}
