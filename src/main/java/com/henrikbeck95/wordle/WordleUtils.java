package com.henrikbeck95.wordle;

import java.util.ArrayList;

import com.henrikbeck95.sort.SortVector;

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
		array = SortVector.sortNormal(array);

		return array;
	}
}