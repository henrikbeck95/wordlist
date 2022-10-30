package com.henrikbeck95.string;

public class StringUtils {
	public static String lineFormattedGenerate(int index, String wordFirst) {
		int indexLength = amountOfCharacters(index);
		String indexSpaces = fillSpaces(10 - indexLength);

		int wordFirstLength = amountOfCharacters(wordFirst);
		String wordFirstSpaces = fillSpaces(30 - wordFirstLength);

		return index + "º" + indexSpaces + wordFirst + wordFirstSpaces;
	}

	public static String lineFormattedGenerate(int index, String wordFirst, String wordSecond) {
		int indexLength = amountOfCharacters(index);
		String indexSpaces = fillSpaces(10 - indexLength);

		int wordFirstLength = amountOfCharacters(wordFirst);
		String wordFirstSpaces = fillSpaces(30 - wordFirstLength);

		int wordSecondLength = amountOfCharacters(wordSecond);
		String wordSecondSpaces = fillSpaces(30 - wordSecondLength);

		return index + "º" + indexSpaces + wordFirst + wordFirstSpaces + wordSecond + wordSecondSpaces;
	}

	public static String lineFormattedGenerate(int index, String wordFirst, String wordSecond, String wordThird) {
		int indexLength = amountOfCharacters(index);
		String indexSpaces = fillSpaces(10 - indexLength);

		int wordFirstLength = amountOfCharacters(wordFirst);
		String wordFirstSpaces = fillSpaces(30 - wordFirstLength);

		int wordSecondLength = amountOfCharacters(wordSecond);
		String wordSecondSpaces = fillSpaces(30 - wordSecondLength);

		int wordThirdLength = amountOfCharacters(wordSecond);
		String wordthirdSpaces = fillSpaces(30 - wordThirdLength);

		return index + "º" + indexSpaces + wordFirst + wordFirstSpaces + wordSecond + wordSecondSpaces + wordThird
				+ wordthirdSpaces;
	}

	public static int amountOfCharacters(String word) {
		return String.valueOf(word).length();
	}

	public static int amountOfCharacters(int number) {
		return String.valueOf(number).length();
	}

	public static String fillSpaces(int size) {
		String aux = "";

		for (int i = 0; i < size; i++) {
			aux += " ";
		}

		return aux;
	}

	public static String fillSpacesAccordingToWordLength(String word) {
		int wordAmountOfCharacters = amountOfCharacters(word);

		return fillSpaces(wordAmountOfCharacters);
	}
}