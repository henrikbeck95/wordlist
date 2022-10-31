package com.henrikbeck95.wordlist;

import java.util.ArrayList;

import com.henrikbeck95.wordlist.file.FileRead;
import com.henrikbeck95.wordlist.wordle.Wordle;
import com.henrikbeck95.wordlist.wordle.WordleDisplay;

public class Wordlist {
	// @formatter:off
	/*
	public static void main(String[] args) {
		// ArrayList<Wordle> wordles = buildWordleTemplete();
		ArrayList<Wordle> wordles = buildWordleExample();

		// System.out.println("portuguese");
		// displayAllWordleSizes(wordles);
		displayAllWordleValues(wordles);
	}
	 */
	// @formatter:on

	private static ArrayList<Wordle> buildWordleExample() {
		ArrayList<Wordle> wordles = new ArrayList<Wordle>();

		String dictionaryUrl = getResourcePath("portuguese");

		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "a", "", "?m?d?".toCharArray())); // 4 elements
		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "poerd", "", "?????".toCharArray())); // 3 elements
		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "oip", "aureclvgm", "????s".toCharArray())); // 2 elements

		return wordles;
	}

	private static ArrayList<Wordle> buildWordleTemplete() {
		ArrayList<Wordle> wordles = new ArrayList<Wordle>();

		// @formatter:off
		// Languages
		// String dictionaryUrl = getResourcePath("informTheLanguage");
		// wordles.add(new Wordle(false, 5, 5, "french", "", "", "?????".toCharArray())); // XXXXXX elements
		// wordles.add(new Wordle(false, 5, 5, "english", "", "", "?????".toCharArray())); // 5196 elements
		// wordles.add(new Wordle(false, 5, 5, "portuguese", "", "", "?????".toCharArray())); // 5428 elements
		// wordles.add(new Wordle(false, 5, 5, "spanish", "", "", "?????".toCharArray())); // XXXXXX elements
		// @formatter:on

		String dictionaryUrl = getResourcePath("portuguese");

		// @formatter:off
		// Implementation usage
		// wordles.add(new Wordle(true, 1, 25, dictionaryUrl, "", "", "?????".toCharArray())); // 261081 elements
		// wordles.add(new Wordle(false, 1, 25, dictionaryUrl, "", "", "?????".toCharArray())); // 244769 elements
		// wordles.add(new Wordle(true, 5, 5, dictionaryUrl, "", "", "?????".toCharArray())); // 5976 elements
		// wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "", "", "?????".toCharArray())); // 5428 elements
		// wordles.add(new Wordle(false, 19, 30, dictionaryUrl, "", "", "?????".toCharArray())); // 249 elements
		// wordles.add(new Wordle(false, 19, 25, dictionaryUrl, "", "", "?????".toCharArray())); // 248 elements
		// wordles.add(new Wordle(false, 19, 25, dictionaryUrl, "aeiou", "", "?????".toCharArray())); // 68 elements
		// wordles.add(new Wordle(false, 19, 25, dictionaryUrl, "aeiou", "", "?o???".toCharArray())); // 40 elements
		// wordles.add(new Wordle(false, 19, 25, dictionaryUrl, "aeiou", "c", "?????".toCharArray())); // 30 elements
		// wordles.add(new Wordle(false, 19, 25, dictionaryUrl, "aeiou", "c", "?o???".toCharArray())); // 17 elements
		// wordles.add(new Wordle(false, 21, 30, dictionaryUrl, "", "", "?????".toCharArray())); // 31 elements
		// wordles.add(new Wordle(false, 22, 30, dictionaryUrl, "", "", "?????".toCharArray())); // 11 elements
		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "a", "", "?m?d?".toCharArray())); // 4 elements
		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "poerd", "", "?????".toCharArray())); // 3 elements
		wordles.add(new Wordle(false, 5, 5, dictionaryUrl, "oip", "aureclvgm", "????s".toCharArray())); // 2 elements
		// wordles.add(new Wordle(false, 24, 30, dictionaryUrl, "", "", "?????".toCharArray())); // 1 element
		// @formatter:on

		// Display only a single instance
		wordles.get(0).display();

		wordles.get(0).play();
		wordles.get(0).display();
		wordles.get(0).stop();

		wordles.get(1).play();
		wordles.get(1).display();
		wordles.get(1).stop();

		wordles.get(2).play();
		wordles.get(2).display();
		wordles.get(2).stop();

		System.out.println(wordles.get(0).getArrayList().size());
		System.out.println(wordles.get(0).getArrayList().toString());

		return wordles;
	}

	public static void displayAllWordleSizes(ArrayList<Wordle> wordles) {
		for (int i = 0; i < wordles.size(); i++) {
			System.out.println(wordles.get(i).getArrayList().size());
		}
	}

	public static void displayAllWordleValues(ArrayList<Wordle> wordles) {
		WordleDisplay.display(wordles);
	}

	public static String getResourcePath(String dictionaryLanguage) {
		return FileRead.getResourcePath("/dictionary/" + dictionaryLanguage + ".txt");
	}
}