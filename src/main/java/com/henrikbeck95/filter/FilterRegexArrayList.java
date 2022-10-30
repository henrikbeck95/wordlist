package com.henrikbeck95.filter;

import java.util.ArrayList;

// MUST BE IMPROVED THE PERFORMANCE
public class FilterRegexArrayList {
	public static ArrayList<String> searchCharAtIndex(ArrayList<String> arrayList, char firstCharacter, int index) {
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (FilterValidation.hasCharAtIndex(arrayList.get(i), firstCharacter, index) == false) {
				arrayList.remove(i);
			}
		}

		return arrayList;
	}

	// MUST BE TESTED
	public static ArrayList<String> searchContainsString(ArrayList<String> arrayList, String wordContent) {
		/*
		ArrayList<String> arrayResult = new ArrayList<String>();

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).matches(".*am.*")) {
				arrayResult.add(arrayList.get(i));
			}
		}

		return arrayResult
		*/
		
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (arrayList.get(i).matches(".*am.*") == false) {
				arrayList.remove(i);
			}
		}

		return arrayList;
	}

	// MUST BE IMPROVED THE PERFORMANCE
	public static ArrayList<String> searchBeginWithString(ArrayList<String> arrayList, String wordBegin) {
		ArrayList<String> arrayResult = new ArrayList<String>();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).matches("^am.*")) {
				arrayResult.add(arrayList.get(i));
			}
		}

		return arrayResult;
	}

	// MUST BE IMPROVED THE PERFORMANCE
	public static ArrayList<String> searchFinishWithString(ArrayList<String> arrayList, String wordFinish) {
		ArrayList<String> arrayResult = new ArrayList<String>();

		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).matches(".*am$")) {
				arrayResult.add(arrayList.get(i));
			}
		}

		return arrayResult;
	}

	// MUST BE CHECKED
	public static ArrayList<String> searchAccordingToCharacters(ArrayList<String> arrayList, char wordAux[]) {
		if (wordAux.length > 0) {
			String valueExpressionRegex = "";
			
			for (int i = arrayList.size() - 1; i >= 0; i--) {
				valueExpressionRegex = FilterRegexString.generateExpressionRegex(wordAux);
				
				// Add to the list only the string which matches with the regular expression
				if (arrayList.get(i).matches(valueExpressionRegex) == false) { // The correctly one
//				if (arrayList.get(i).matches(valueExpressionRegex) == true) { //Checking the words whose would be removed
//					System.out.println(arrayList.get(i) + ":\t\t" + valueExpressionRegex);
					arrayList.remove(i);
				}
			}
		}
		
		return arrayList;
	}

	public static ArrayList<String> searchContainsCharacters(ArrayList<String> arrayList, char wordAux[]) {
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (FilterValidation.hasAllCharsInString(arrayList.get(i), wordAux) == false) {
				arrayList.remove(i);
			}
		}
		
		return arrayList;
	}

	public static ArrayList<String> searchDoesNotContainsCharacters(ArrayList<String> arrayList, char wordAux[]) {
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (FilterValidation.hasNotAllCharsInString(arrayList.get(i), wordAux) == false) {
				arrayList.remove(i);
			}
		}

		return arrayList;
	}
}