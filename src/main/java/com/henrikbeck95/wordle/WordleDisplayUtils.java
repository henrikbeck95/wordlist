package com.henrikbeck95.wordle;

import com.henrikbeck95.sort.SortVector;

public class WordleDisplayUtils {
	protected static String attributeEmptyValueIfThereIsNoWordleIndex(int index, Wordle wordle) {
		if (index < wordle.getArrayList().size()) {
			return wordle.getArrayList().get(index);
		} else {
			return "";
		}
	}

	protected static int[] rankWordleAccordingToTheirSize(Wordle... wordles) {
		int[] array = new int[wordles.length];

		// Fill the vector with Wordle size
		for (int i = 0; i < wordles.length; i++) {
			array[i] = wordles[i].getArrayList().size();
		}

		// Sort the vector
		array = SortVector.sortNormal(array);

		return array;
	}
}