package com.henrikbeck95.wordle;

import java.util.ArrayList;

public class WordleController {
	public static Wordle[] buildWordleTempletes() {
		Wordle wordle1 = new Wordle(false, 5, 5, "english.txt", "", "", "?????".toCharArray());
		Wordle wordle2 = new Wordle(false, 5, 5, "french.txt", "", "", "?????".toCharArray());
		Wordle wordle3 = new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray());
		Wordle wordle4 = new Wordle(false, 5, 5, "spanish.txt", "", "", "?????".toCharArray());

		wordle1.play();
		wordle1.display();
		wordle1.stop();

		wordle2.play();
		wordle2.display();
		wordle2.stop();

		wordle3.play();
		wordle3.display();
		wordle3.stop();

		wordle4.play();
		wordle4.display();
		wordle4.stop();

		System.out.println(wordle1.getArrayList().size());
		System.out.println(wordle1.getArrayList().toString());

		return new Wordle[] { wordle1, wordle2, wordle3, wordle4 };
		
		/*
		ArrayList<Wordle> arrayListWordle = new ArrayList<Wordle>();
		
		arrayListWordle.add(new Wordle(true, 1, 25, "portuguese.txt", "", "", "?????".toCharArray())); // 261081 elements
		arrayListWordle.add(new Wordle(false, 1, 25, "portuguese.txt", "", "", "?????".toCharArray())); // 244769 elements
		arrayListWordle.add(new Wordle(true, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // 5976 elements
		arrayListWordle.add(new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // 5428 elements
		arrayListWordle.add(new Wordle(false, 19, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 249 elements
		arrayListWordle.add(new Wordle(false, 19, 25, "portuguese.txt", "", "", "?????".toCharArray())); // 248 elements
		arrayListWordle.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "", "?????".toCharArray())); // 68 elements
		arrayListWordle.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "", "?o???".toCharArray())); // 40 elements
		arrayListWordle.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "c", "?????".toCharArray())); // 30 elements
		arrayListWordle.add(new Wordle(false, 19, 25, "portuguese.txt", "aeiou", "c", "?o???".toCharArray())); // 17 elements
		arrayListWordle.add(new Wordle(false, 21, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 31 elements
		arrayListWordle.add(new Wordle(false, 22, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 11 elements
		arrayListWordle.add(new Wordle(false, 5, 5, "portuguese.txt", "a", "", "?m?d?".toCharArray())); // 4 elements
		arrayListWordle.add(new Wordle(false, 5, 5, "portuguese.txt", "poerd", "", "?????".toCharArray())); // 3 elements // PODER
		arrayListWordle.add(new Wordle(false, 5, 5, "portuguese.txt", "oip", "aureclvgm", "????s".toCharArray())); // 2 elements
		arrayListWordle.add(new Wordle(false, 24, 30, "portuguese.txt", "", "", "?????".toCharArray())); // 1 element
		*/
	}
	
	public static Wordle[] buildWordle() {
		ArrayList<Wordle> arrayListWordle = new ArrayList<Wordle>();
		
		arrayListWordle.add(new Wordle(false, 5, 5, "portuguese.txt", "", "", "?????".toCharArray())); // XXXXXX elements
		
		// Convert the ArrayList to vector
		
		Wordle[] wordles = new Wordle[arrayListWordle.size()];

		for (int i = 0; i < arrayListWordle.size(); i++) {
			wordles[i] = arrayListWordle.get(i);			
		}
		
		return wordles;
	}
}