package com.henrikbeck95.wordlist.file;

import java.io.File;

public class FileRead {
	// MUST BE FIXED
	public String getResourcePathAux(String dictionaryUrl) {
		File file = new File(getClass().getResource(dictionaryUrl).getPath());

		return file.getAbsolutePath();
	}
	
	// MUST BE FIXED
	public static String getResourcePath(String dictionaryUrl) {
		FileRead fileRead = new FileRead();

		return fileRead.getResourcePathAux(dictionaryUrl);
	}
	
	
	
	
	
	public static String getRelativePathRoot() {
		// return new File("src/main/java/com/henrikbeck95").getAbsolutePath();

		File file = new File("src/main/java/com/henrikbeck95/wordlist");

		return file.getAbsolutePath();
	}

	public static String getRelativePathDicitionary(String filename) {
		File file = new File(getRelativePathRoot() + "/assets/dictionary/" + filename);

		return file.getAbsolutePath();
	}
}