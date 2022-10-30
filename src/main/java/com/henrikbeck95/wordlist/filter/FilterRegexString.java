package com.henrikbeck95.wordlist.filter;

public class FilterRegexString {
	/*
	 * Example: "^" + any + any + "a" + any + "o" + "*"
	 * Meaning: "^[^\\\\d][^\\\\d]a[^\\\\d]o*"
	 */
	public static String generateExpressionRegex(char[] characterFromWord) {
		// String valueCharacterAny = "[^\\\\d]"; // 4693 elements
		String valueCharacterAny = "."; // 5428 elements
		String valueExpressionRegex = "^";

		// Compare each word character
		for (int j = 0; j < characterFromWord.length; j++) {
			if (FilterValidation.isCharacterValid(characterFromWord[j]) == false) {
				valueExpressionRegex += valueCharacterAny;
			} else {
				valueExpressionRegex += characterFromWord[j];
			}
		}

		return valueExpressionRegex += "*";
	}
}