package com.henrikbeck95.wordlist.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.henrikbeck95.wordlist.sort.SortVector;

class SortVectorTest {
	@Test
	void sortNormal() {
		int[] actual = { 9, 5, 1, 0, 6, 2, 3, 4, 7, 8 };
		int[] expected = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		assertArrayEquals(SortVector.sortNormal(actual), expected);
	}

	@Test
	void sortReverse() {
		int[] actual = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] expected = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

		assertArrayEquals(SortVector.sortReverse(actual), expected);
	}
}