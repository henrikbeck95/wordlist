package com.henrikbeck95.wordlist.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.henrikbeck95.wordlist.file.FileRead;
import com.henrikbeck95.wordlist.filter.FilterRegexArrayList;

/*
 * Should be implemented a JUnit5 tests for this class
 */

class FilterRegexArrayListTest {
	@Test
	void test() {
		// Generate the dictionary list
		String url = FileRead.getRelativePathDicitionary("portuguese.txt");
//		ArrayList<String> arrayListOriginal = Read.storeEachLineIntoArray(url);
//		ArrayList<String> arrayListNormalizedUtf8 = Read.normalizeCharactersUtf8(arrayListOriginal, 5, 5);
//		ArrayList<String> arrayListNormalizedCase = Read.normalizeCase(arrayListNormalizedUtf8, "lower"); // "upper"
		
		//searchCharAtIndex(arrayListNormalizedCase, 'a', 0); // 679 match values.
		//searchContainsString(arrayListNormalizedCase, "am"); // 347 match values.
		//searchBeginWithString(arrayListNormalizedCase, "am"); // 35 match values.
		//searchFinishWithString(arrayListNormalizedCase, "am"); // 232 match values.
		//searchAccordingToCharacters(arrayListNormalizedCase, new char[] { ' ', '?', 'a', ' ', 'o' }); // 91 match values.
		//searchContainsCharacters(arrayListNormalizedCase, new char[] { 'g', '?', 'a', 'v', 'o' }); // 6 match values.
		//searchDoesNotContainsCharacters(arrayListNormalizedCase, new char[] { 'i', '?', 'a', 'e', 'o' }); // 4 match values.
	}

	void searchCharAtIndex(ArrayList<String> arrayList, char firstCharacter, int index) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchCharAtIndex(arrayList, firstCharacter, index);
		//ElementsList.all(arrayResult);
	}
	
	void searchContainsString(ArrayList<String> arrayList, String wordContent) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchContainsString(arrayList, wordContent);
		//ElementsList.all(arrayResult);
	}

	void searchBeginWithString(ArrayList<String> arrayList, String wordBegin) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchBeginWithString(arrayList, wordBegin);
		//ElementsList.all(arrayResult);
	}

	void searchFinishWithString(ArrayList<String> arrayList, String wordFinish) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchFinishWithString(arrayList, wordFinish);
		//ElementsList.all(arrayResult);
	}

	void searchAccordingToCharacters(ArrayList<String> arrayList, char wordAux[]) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchAccordingToCharacters(arrayList, wordAux);
		//ElementsList.all(arrayResult);
	}

	void searchContainsCharacters(ArrayList<String> arrayList, char wordAux[]) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchContainsCharacters(arrayList, wordAux);
		//ElementsList.all(arrayResult);
	}

	void searchDoesNotContainsCharacters(ArrayList<String> arrayList, char wordAux[]) {
		ArrayList<String> arrayResult = FilterRegexArrayList.searchDoesNotContainsCharacters(arrayList, wordAux);
		//ElementsList.all(arrayResult);
	}
}