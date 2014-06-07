package org.stu.homework01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GenerateAPDFWithDeckOfCards {

	public static void main(String[] args) {

		ArrayList<String> cardsList = createList();
		try {
			createPDF(cardsList);
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<String> createList() {

		String heart = "♥";
		String diamond = "♦";
		String spade = "♠";
		String club = "♣";
		String tempColor = "";
		ArrayList<String> cardsList = new ArrayList<String>();

		for (int card = 2; card <= 14; card++) {

			for (int color = 0; color <= 3; color++) {

				switch (color) {
				case 0:
					tempColor = heart;
					break;
				case 1:
					tempColor = diamond;
					break;
				case 2:
					tempColor = spade;
					break;
				case 3:
					tempColor = club;
					break;
				}

				if (card <= 10) {
					cardsList.add(card + tempColor);
				} else {
					switch (card) {
					case 11:
						cardsList.add("J" + tempColor);
						break;
					case 12:
						cardsList.add("Q" + tempColor);
						break;
					case 13:
						cardsList.add("K" + tempColor);
						break;
					case 14:
						cardsList.add("A" + tempColor);
						break;
					}
				}
			}
		}
		return cardsList;
	}

	public static void createPDF(ArrayList<String> cardsList)
			throws DocumentException, IOException {

		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("CardDeck.pdf"));

		document.open();

		PdfPTable table = new PdfPTable(4);
		table.setWidthPercentage(100);
		table.getDefaultCell().setFixedHeight(180);

		BaseFont baseFont =
				BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, true);
		Font black = new Font(baseFont, 70f, 0, BaseColor.BLACK);
		Font red = new Font(baseFont, 70f, 0, BaseColor.RED);

		for (int cardsLines = 0; cardsLines < 13; cardsLines++) {
			for (int cardNum = 0; cardNum < 4; cardNum++) {

				String drawLine = cardsList.get(4 * cardsLines + cardNum);

				if (cardNum == 0 || cardNum == 1) {
					table.addCell(new Paragraph(drawLine, red));
				} else {
					table.addCell(new Paragraph(drawLine, black));
				}

			}
		}

		document.add(table);
		document.close();
	}
}
