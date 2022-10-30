package com.henrikbeck95.filter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FilterRegexStringTest {
	@Test
	void test() {
		// String valueCharacterAny = "[^\\\\d]";
		String valueCharacterAny = ".";

		ArrayList<char[]> arrayListActual = new ArrayList<char[]>();
		ArrayList<String> arrayListExpected= new ArrayList<String>();
		
		arrayListActual.add( new char[] { 'e', 'u', 'm', 'n' } );
		arrayListExpected.add("^eumn*");

		arrayListActual.add( new char[] { ' ', ' ', ' ', ' ', ' ' } );
		arrayListExpected.add("^" + valueCharacterAny + valueCharacterAny + valueCharacterAny + valueCharacterAny + valueCharacterAny + "*");

		arrayListActual.add( new char[] { '?', ' ', 'm', '?', '?' } );
		arrayListExpected.add("^" + valueCharacterAny + valueCharacterAny + "m" + valueCharacterAny + valueCharacterAny + "*");
		
		arrayListActual.add( new char[] { '?', '?', '?', '?', '?' } );
		arrayListExpected.add("^" + valueCharacterAny + valueCharacterAny + valueCharacterAny + valueCharacterAny + valueCharacterAny + "*");
		
		arrayListActual.add( new char[] { 'e', 'u', ' ', 'm', 'n' } );
		arrayListExpected.add("^eu" + valueCharacterAny + "mn*");

		arrayListActual.add( new char[] { 'e', 'u', '?', 'm', 'n' } );
		arrayListExpected.add("^eu" + valueCharacterAny + "mn*");
		
		for (int i = 0; i < arrayListExpected.size(); i++) {
			System.out.print(FilterRegexString.generateExpressionRegex(arrayListActual.get(i)));
			assertEquals(FilterRegexString.generateExpressionRegex(arrayListActual.get(i)), arrayListExpected.get(i));
			System.out.println("\t\tSUCCESSED!!!");
		}
	}
}