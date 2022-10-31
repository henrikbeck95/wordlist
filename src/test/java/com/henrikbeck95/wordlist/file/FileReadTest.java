package com.henrikbeck95.wordlist.file;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.henrikbeck95.wordlist.file.FileRead;
import com.henrikbeck95.wordlist.os.OsInfo;

class FileReadTest {
	@Test
	void test() {
		if (OsInfo.isWindows() == true) {
			String pathProject = "C:\\Users\\PC\\Documents\\workspace\\wordlist\\";
			
			assertEquals(FileRead.getRelativePathRoot(), pathProject + "src\\main\\java\\com\\henrikbeck95\\wordlist");
			assertEquals(FileRead.getRelativePathDicitionary("portuguese.txt"), pathProject + "src\\main\\java\\com\\henrikbeck95\\wordlist\\assets\\dictionary\\portuguese.txt");
		} else {
			String pathProject = "/home/henrikbeck95/Documents/workspace/dictionary-filter\\";
			
			assertEquals(FileRead.getRelativePathRoot(), pathProject + "src/main/java/com/henrikbeck95");
			assertEquals(FileRead.getRelativePathDicitionary("portuguese.txt"), pathProject + "src/main/java/com/henrikbeck95/assets/dictionary/portuguese.txt");			
		}
	}
}