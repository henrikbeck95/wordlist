package com.henrikbeck95.wordlist.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.henrikbeck95.wordlist.string.StringUtils;

class StringUtilsTest {
	/*
	@Test
	void lineFormattedGenerate() {
		
		assertEquals( StringUtils.lineFormattedGenerate(0, "Dictionary"), "0º         Dictionary");
		
		fail("Not yet implemented");
	}
	
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
	*/
	
	@Test
	void amountOfCharacters() {
		assertEquals( StringUtils.amountOfCharacters("Dictionary"), 10);
	}
	
	@Test
	void fillSpaces() {
		assertEquals( StringUtils.fillSpaces(5), "     ");
	}
	
	@Test
	void fillSpacesAccordingToWordLength() {
		assertEquals( StringUtils.fillSpacesAccordingToWordLength("Dictionary"), "          ");
	}
}