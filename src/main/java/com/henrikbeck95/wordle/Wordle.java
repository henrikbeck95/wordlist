package com.henrikbeck95.wordle;

import java.util.ArrayList;

import com.henrikbeck95.file.FileRead;
import com.henrikbeck95.filter.FilterRegexArrayList;

public class Wordle {
	private boolean accentuation;
	private int wordLengthMinimum;
	private int wordLengthMaximum;
	private String dictionaryUrl;
	private String wordContent;
	private String wordNotContent;
	private ArrayList<String> arrayList;
	private boolean isGameEnd;
	private char wordFinal[];

	public Wordle(boolean accentuation, int wordLengthMinimum, int wordLengthMaximum, String wordDictionaryLanguage,
			String wordContent, String wordNotContent, char wordFinal[]) {
		this.accentuation = accentuation;
		this.wordLengthMinimum = wordLengthMinimum;
		this.wordLengthMaximum = wordLengthMaximum;
		this.wordContent = wordContent;
		this.dictionaryUrl = FileRead.getRelativePathDicitionary(wordDictionaryLanguage);
		this.wordNotContent = wordNotContent;
		this.wordFinal = wordFinal;

		this.play();
	}

	public void dictionaryListGenerate() {
		this.arrayList = FileRead.storeEachLineIntoArray(this.dictionaryUrl);
		this.arrayList = FileRead.normalizeWordLength(this.getArrayList(), this.wordLengthMinimum,
				this.wordLengthMaximum);

		if (this.isAccentuation() == false) {
			this.arrayList = FileRead.normalizeCharactersUtf8(this.getArrayList());
		}

		this.arrayList = FileRead.normalizeCase(this.getArrayList(), "lower"); // "upper"
		this.arrayList = FileRead.normalizeRemoveDuplicate(this.getArrayList());
	}

	public void dictionaryListFilter() {
		// @formatter:off
		
		if (this.getArrayList().isEmpty() == false && this.isGameEnd() == false) {
			this.arrayList = FilterRegexArrayList.searchContainsCharacters(this.getArrayList(), this.getWordContent().toCharArray());
		}
		
		if (this.getArrayList().isEmpty() == false && this.isGameEnd() == false) {
			this.arrayList = FilterRegexArrayList.searchDoesNotContainsCharacters(this.getArrayList(), this.getWordNotContent().toCharArray());
		}
		
		if (this.getArrayList().isEmpty() == false && this.isGameEnd() == false) {
			this.arrayList = FilterRegexArrayList.searchAccordingToCharacters(this.getArrayList(), this.getWordFinal());
		}
		
		// @formatter:on
	}

	public void play() {
		this.setGameEnd(false);

		this.dictionaryListGenerate();
		this.dictionaryListFilter();

		this.getArrayList().sort(null);
	}

	public void display() {
		if (this.isGameEnd == false) {
			for (int i = 0; i < this.getArrayList().size(); i++) {
				System.out.println((i + 1) + "º " + this.getArrayList().get(i));
			}
		}
	}

	public void stop() {
		this.setGameEnd(true);
	}

	// Getters and setters

	// Getters and setters

	// @formatter:off
	public boolean isAccentuation() { return accentuation; }
	public void setAccentuation(boolean accentuation) { this.accentuation = accentuation; }
	public int getWordLengthMinimum() { return wordLengthMinimum; }
	public void setWordLengthMinimum(int wordLengthMinimum) { this.wordLengthMinimum = wordLengthMinimum; }
	public int getWordLengthMaximum() { return wordLengthMaximum; }
	public void setWordLengthMaximum(int wordLengthMaximum) { this.wordLengthMaximum = wordLengthMaximum; }
	public String getDictionaryUrl() { return dictionaryUrl; }
	public void setDictionaryUrl(String dictionaryUrl) { this.dictionaryUrl = dictionaryUrl; }
	public String getWordContent() { return wordContent; }
	public void setWordContent(String wordContent) { this.wordContent = wordContent; }
	public String getWordNotContent() { return wordNotContent; }
	public void setWordNotContent(String wordNotContent) { this.wordNotContent = wordNotContent; }
	public ArrayList<String> getArrayList() { return arrayList; }
	public void setArrayList(ArrayList<String> arrayList) { this.arrayList = arrayList; }
	public boolean isGameEnd() { return isGameEnd; }
	public void setGameEnd(boolean isGameEnd) { this.isGameEnd = isGameEnd; }
	public char[] getWordFinal() { return wordFinal; }
	public void setWordFinal(char[] wordFinal) { this.wordFinal = wordFinal; }
	// @formatter:on
}