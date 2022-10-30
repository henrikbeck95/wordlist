package com.henrikbeck95.wordlist;

import java.util.ArrayList;

import com.henrikbeck95.wordlist.wordle.Wordle;
import com.henrikbeck95.wordlist.wordle.WordleDisplay;

public class Wordlist {
	public static void main(String[] args) {
		// ArrayList<Wordle> wordles = buildWordleTempletes();
		ArrayList<Wordle> wordles = buildWordle();

		// displayAllWordleSizes(wordles);
		displayAllWordleValues(wordles);
	}
	
	// This is going to be main function soon
	public static ArrayList<Wordle> buildWordle() {
		ArrayList<Wordle> wordles = new ArrayList<Wordle>();
		
//		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // XXXXXX elements
		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // XXXXXX elements
		
		return wordles;
	}
	
	private static ArrayList<Wordle> buildWordleTempletes() {
		ArrayList<Wordle> wordles = new ArrayList<Wordle>();

		// Languages
//		wordles.add(new Wordle(false, 5, 5, "french.txt", "", "", "?????".toCharArray())); // XXXXXX elements
//		wordles.add(new Wordle(false, 5, 5, "english.txt", "", "", "?????".toCharArray())); // 5196 elements
//		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // 5428 elements
//		wordles.add(new Wordle(false, 5, 5, "spanish.txt", "", "", "?????".toCharArray())); // XXXXXX elements
		
		// Implementation usage
//		wordles.add(new Wordle(true, 1, 25, "portuguese.txt", "", "", "?????".toCharArray())); // 261081 elements
//		wordles.add(new Wordle(false, 1, 25, "portuguese.txt", "", "", "?????".toCharArray())); // 244769 elements
//		wordles.add(new Wordle(true, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // 5976 elements
//		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // 5428 elements
//		wordles.add(new Wordle(false, 19, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 249 elements
//		wordles.add(new Wordle(false, 19, 25, "portuguese.txt", "", "", "?????".toCharArray())); // 248 elements
//		wordles.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "", "?????".toCharArray())); // 68 elements
//		wordles.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "", "?o???".toCharArray())); // 40 elements
//		wordles.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "c", "?????".toCharArray())); // 30 elements
//		wordles.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "c", "?o???".toCharArray())); // 17 elements
//		wordles.add(new Wordle(false, 21, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 31 elements
//		wordles.add(new Wordle(false, 22, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 11 elements
		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "a", "", "?m?d?".toCharArray())); // 4 elements
		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "poerd", "", "?????".toCharArray())); // 3 elements
		wordles.add(new Wordle(false, 5, 5, "portuguese.txt", "oip", "aureclvgm", "????s".toCharArray())); // 2 elements
//		wordles.add(new Wordle(false, 24, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 1 element
		
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
}