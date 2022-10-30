package com.henrikbeck95.wordlist.sort;

import com.henrikbeck95.wordlist.sort.algorithms.QuickSort;

public class SortVector {
	public static int[] sortNormal(int array[]) {
		return QuickSort.main(array);
	}

	public static int[] sortReverse(int array[]) {
		int aux[] = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			aux[i] = array[(array.length - i) - 1];
		}

		return aux;
	}
}