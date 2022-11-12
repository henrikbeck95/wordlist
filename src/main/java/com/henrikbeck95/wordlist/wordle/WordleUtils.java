package com.henrikbeck95.wordlist.wordle;

import java.util.ArrayList;

import com.henrikbeck95.library.common.sort.SortVector;

public class WordleUtils {
	protected static String attributeEmptyValueIfThereIsNoWordleIndex(int index, Wordle wordle) {
		if (index < wordle.getArrayList().size()) {
			return wordle.getArrayList().get(index);
		} else {
			return "";
		}
	}

	protected static int[] rankWordleAccordingToTheirSize(ArrayList<Wordle> wordles) {
		int[] array = new int[wordles.size()];

		// Fill the vector with Wordle size
		for (int i = 0; i < wordles.size(); i++) {
			array[i] = wordles.get(i).getArrayList().size();
		}

		// Sort the vector
		array = SortVector.regular(array);

		return array;
	}
}