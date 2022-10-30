package com.henrikbeck95.wordlist.sort.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.henrikbeck95.wordlist.sort.algorithms.QuickSort;

class QuickSortTest {
	@Test
	void quickSortMain() {
		int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
		int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		assertArrayEquals(QuickSort.main(actual), expected);
	}
}