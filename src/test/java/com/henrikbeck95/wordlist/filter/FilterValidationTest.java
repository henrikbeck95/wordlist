package com.henrikbeck95.wordlist.filter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.henrikbeck95.wordlist.filter.FilterValidation;

class FilterValidationTest {
	@Test
	void fillArrayWithHasSingleCharInString() {
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'm', 'u' }), new boolean[] { true, true } );
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'M', 'U' }), new boolean[] { true, true } );

		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'e', 'n', '?' }), new boolean[] { true, true } );
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'e', 'N', '?' }), new boolean[] { true, true} );
		
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'e', 'u', 'm', 'n' }), new boolean[] { true, true, true, true } );
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'E', 'U', 'M', 'N' }), new boolean[] { true, true, true, true } );

		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'm', 'z' }), new boolean[] { true, false } );
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'm', 'Z' }), new boolean[] { true, false } );

		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'i', 'm' }), new boolean[] { false, true } );
		assertArrayEquals(FilterValidation.fillArrayWithHasSingleCharInString("Menu", new char[] { 'I', 'M' }), new boolean[] { false, true } );
	}
	
	@Test
	void hasCharAtIndex() {
		assertTrue(FilterValidation.hasCharAtIndex("Menu", 'M', 0));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'M', 1));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'M', 2));
		
		assertTrue(FilterValidation.hasCharAtIndex("Menu", 'm', 0));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'm', 1));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'm', 2));
		
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'E', 0));
		assertTrue(FilterValidation.hasCharAtIndex("Menu", 'E', 1));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'E', 2));

		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'e', 0));
		assertTrue(FilterValidation.hasCharAtIndex("Menu", 'e', 1));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'e', 2));
		
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'Z', 0));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'Z', 1));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'Z', 2));
		
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'z', 0));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'z', 1));
		assertFalse(FilterValidation.hasCharAtIndex("Menu", 'z', 2));
	}
	
	@Test
	void hasSingleCharInString() {
		assertTrue(FilterValidation.hasSingleCharInString("Menu", 'M'));
		assertTrue(FilterValidation.hasSingleCharInString("Menu", 'm'));
		
		assertTrue(FilterValidation.hasSingleCharInString("Menu", 'E'));
		assertTrue(FilterValidation.hasSingleCharInString("Menu", 'e'));
		
		assertFalse(FilterValidation.hasSingleCharInString("Menu", 'Z'));
		assertFalse(FilterValidation.hasSingleCharInString("Menu", 'z'));
	}
	
	@Test
	void hasNotSingleCharInString() {
		assertFalse(FilterValidation.hasNotSingleCharInString("Menu", 'M'));
		assertFalse(FilterValidation.hasNotSingleCharInString("Menu", 'm'));
		
		assertFalse(FilterValidation.hasNotSingleCharInString("Menu", 'E'));
		assertFalse(FilterValidation.hasNotSingleCharInString("Menu", 'e'));
		
		assertTrue(FilterValidation.hasNotSingleCharInString("Menu", 'Z'));
		assertTrue(FilterValidation.hasNotSingleCharInString("Menu", 'z'));
	}
	
	@Test
	void hasAllCharsInString() {
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { 'm', 'u' }));
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { 'M', 'U' }));
		
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { '?', 'e', 'n' }));
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { '?', 'e', 'N' }));
		
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { 'e', 'n', '?' }));
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { 'e', 'N', '?' }));
		
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { 'e', 'u', 'm', 'n' }));
		assertTrue(FilterValidation.hasAllCharsInString("Menu", new char[] { 'E', 'U', 'M', 'N' }));
		
		assertFalse(FilterValidation.hasAllCharsInString("Menu", new char[] { 'm', 'z' }));
		assertFalse(FilterValidation.hasAllCharsInString("Menu", new char[] { 'm', 'Z' }));

		assertFalse(FilterValidation.hasAllCharsInString("Menu", new char[] { 'i', 'm' }));
		assertFalse(FilterValidation.hasAllCharsInString("Menu", new char[] { 'I', 'M' }));

		assertFalse(FilterValidation.hasAllCharsInString("Menu", new char[] { 'i', 't' }));
		assertFalse(FilterValidation.hasAllCharsInString("Menu", new char[] { 'I', 'T' }));
	}
	
	@Test
	void hasNotAllCharsInString() {
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'm', 'u' }));
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'M', 'U' }));
		
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { '?', 'e', 'n' }));
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { '?', 'e', 'N' }));
		
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'e', 'n', '?' }));
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'e', 'N', '?' }));
		
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'e', 'u', 'm', 'n' }));
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'E', 'U', 'M', 'N' }));
		
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'm', 'z' }));
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'm', 'Z' }));

		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'i', 'm' }));
		assertFalse(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'I', 'M' }));

		assertTrue(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'i', 't' }));
		assertTrue(FilterValidation.hasNotAllCharsInString("Menu", new char[] { 'I', 'T' }));
	}

	@Test
	void isCharacterValid() {
		assertTrue(FilterValidation.isCharacterValid('a'));
		assertTrue(FilterValidation.isCharacterValid('á'));
		assertTrue(FilterValidation.isCharacterValid('0'));
		assertFalse(FilterValidation.isCharacterValid(' '));
		assertFalse(FilterValidation.isCharacterValid('?'));
		assertFalse(FilterValidation.isCharacterValid('/'));
	}
}