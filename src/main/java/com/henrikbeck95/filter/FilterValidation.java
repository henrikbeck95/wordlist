package com.henrikbeck95.filter;

import java.util.ArrayList;

public class FilterValidation {
	public static boolean[] fillArrayWithHasSingleCharInString(String word, char character[]) {
		ArrayList<Boolean> arrayList = new ArrayList<Boolean>();

		// Fill the ArrayList with only valid characters
		for (int i = 0; i < character.length; i++) {
			if (isCharacterValid(character[i]) == true) {
				if (hasSingleCharInString(word, character[i]) == true) {
					arrayList.add(true);
				} else {
					arrayList.add(false);
				}
			}
		}

		// Converting ArrayList to array
		boolean[] assignment = new boolean[arrayList.size()];

		for (int i = 0; i < arrayList.size(); i++) {
			assignment[i] = arrayList.get(i);
		}

		return assignment;
	}

	public static boolean hasCharAtIndex(String word, char character, int index) {
		String wordLowerCase = word.toLowerCase();
		char characterLowerCase = Character.toLowerCase(character);

		if (wordLowerCase.charAt(index) == characterLowerCase) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasSingleCharInString(String word, char character) {
		String wordLowerCase = word.toLowerCase();
		char characterLowerCase = Character.toLowerCase(character);

		if (wordLowerCase.contains(Character.toString(characterLowerCase))) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasNotSingleCharInString(String word, char character) {
		if (hasSingleCharInString(word, character) == true) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean hasAllCharsInString(String word, char character[]) {
		if (character.length == 0) {
			return true;
		} else {
			boolean aux = false;
			boolean[] assignment = fillArrayWithHasSingleCharInString(word, character);
			
			for (int i = 0; i < assignment.length; i++) {
				if (assignment[i] == false) {
					aux = false;
					break;
				} else {
					aux = true;
					continue;
				}
			}

			return aux;
		}
	}

	public static boolean hasNotAllCharsInString(String word, char character[]) {
		if (character.length == 0) {
			return true;
		} else {
			boolean aux = false;
			boolean[] assignment = fillArrayWithHasSingleCharInString(word, character);
			
			for (int i = 0; i < assignment.length; i++) {
				if (assignment[i] == false) {
					aux = true;
					continue;
				} else {
					aux = false;
					break;
				}
			}
			
			return aux;
		}
	}

	public static boolean isCharacterValid(char character) {
		// @formatter:off
		switch (character) {
			// case '\0': return false;
			case ' ': return false;
			case '*': return false;
			case '!': return false;
			case '@': return false;
			case '#': return false;
			case '$': return false;
			case '%': return false;
			case '^': return false;
			case '&': return false;
			case '(': return false;
			case ')': return false;			
			case '[': return false;
			case ']': return false;
			case '{': return false;
			case '}': return false;
			case '<': return false;
			case '>': return false;
			case '~': return false;
			case '´': return false;
			case '`': return false;
			case '¨': return false;
			case '+': return false;
			case '-': return false;
			case '_': return false;
			case '/': return false;
			case '|': return false;
			case '\\': return false;
			case '.': return false;
			case ',': return false;
			case ';': return false;
			case '?': return false;
			case '¹': return false;
			case '²': return false;
			case '³': return false;
			case '£': return false;
			case '¢': return false;
			case '¬': return false;
			case '§': return false;
			case 'ª': return false;
			case 'º': return false;
			case '°': return false;
			case '\'': return false;
			case '"': return false;
			default: return true;
		}
		// @formatter:on
	}
}