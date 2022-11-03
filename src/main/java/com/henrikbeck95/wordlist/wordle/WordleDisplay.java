package com.henrikbeck95.wordlist.wordle;

import java.util.ArrayList;

import com.henrikbeck95.library.universal.string.Amount;
import com.henrikbeck95.library.universal.string.Fill;

// ArrayList<Wordle> arrayListWordles

public class WordleDisplay {
	// MUST IMPROVE THE PERFORMANCE
	public static void display(ArrayList<Wordle> wordles) {
		String[] wordleArrayListAux = new String[wordles.size()];
		int wordleSizeRanking[] = WordleUtils.rankWordleAccordingToTheirSize(wordles);

		for (int i = 0; i < wordleSizeRanking[wordles.size() - 1]; i++) {
			for (int j = 0; j < wordleArrayListAux.length; j++) {
				wordleArrayListAux[j] = WordleUtils.attributeEmptyValueIfThereIsNoWordleIndex(i, wordles.get(j));
			}

			// Display
			displayLine(i, wordleArrayListAux);
		}
	}

	// MUST IMPROVE THE PERFORMANCE
	private static void displayLine(int index, String... words) {
		int wordFormatLength = 30;

		displayLineHeader(index, wordFormatLength, words.length);

		String[] aux = new String[words.length + 1];

		for (int i = 0; i < words.length; i++) {
			aux[i] = words[i];
		}

		aux[words.length] = "" + (index + 1);

		System.out.printf(displayLineFormat(index, wordFormatLength, words.length), aux);
	}

	private static void displayLineHeader(int index, int wordFormatLength, int amountOfWordle) {
		// Display header only on top
		if (index == 0) {
			String[] aux = new String[amountOfWordle];
			String title = "Wordle";

			for (int i = 0; i < amountOfWordle; i++) {
				aux[i] = title + " " + (i + 1);
			}

			System.out.printf(displayLineHeaderFormat(index, wordFormatLength, amountOfWordle), aux);
		}
	}

	// @formatter:off
	/*
	 * String[] strArr = {"p1", "p2", "p3"};
	 * System.out.printf("%1$s %2$10s %3$10s", strArr ); // p1         p2         p3
	 * 
	 * String[] strArr = {"p1", "p2", "p3", "p4", "p5", "p6", "p7"};		
	 * System.out.printf("%7$7s | %1$30s | %2$30s | %3$30s | %4$30s | %5$30s | %6$27s     |%n", strArr );
	 */
	// @formatter:on

	private static String displayLineHeaderFormat(int index, int size, int amountOfWordle) {
		String aux = "";

		int sizeAdjustedIncrease = Amount.countCharacters(index + 1) + 1;

		for (int i = amountOfWordle; i >= 0; i--) {
			if (i > 1) {
				aux += " | %-" + size + "s";
			} else if (i == 1) {
				aux += " | %-" + size + "s";
			} else if (i == 0) {
				// aux = "| %-1d" + aux;
				// aux = "| %07d" + aux;
				// aux = "| #" + aux;
				aux = "| # ID   " + aux;
			} else {
				break;
			}
		}

		return aux + Fill.character(sizeAdjustedIncrease, " ") + "|%n";
	}

	private static String displayLineFormat(int index, int size, int amountOfWordle) {
		String aux = "";

		int arrayPositionToBeApplyed = 1;
		int sizeAdjustedDecrease = (size - Amount.countCharacters(index + 1));
		int sizeAdjustedIncrease = Amount.countCharacters(index + 1) + 2;

		for (int i = amountOfWordle; i >= 0; i--) {
			if (i > 1) {
				// aux += " | %-" + size + "s";
				aux += " | %" + arrayPositionToBeApplyed + "$" + size + "s";
			} else if (i == 1) {
				// aux += " | %" + sizeAdjustedDecrease + "s";
				aux += " | %" + arrayPositionToBeApplyed + "$" + sizeAdjustedDecrease + "s";
			} else if (i == 0) {
				// aux = "| %-1d" + aux;
				// aux = "| %07d" + aux;
				// aux = "| %" + "1$" + "07d" + aux;
				// aux = "| %" + (amountOfWordle + 1) + "$" + "07d" + aux;
				aux = "| %" + (amountOfWordle + 1) + "$" + "7s" + aux;
			} else {
				break;
			}

			arrayPositionToBeApplyed++;
		}

		// sizeAdjustedIncrease
		return aux + Fill.character(sizeAdjustedIncrease, " ") + "|%n";
	}
}