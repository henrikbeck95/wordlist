package com.henrikbeck95.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileRead {
	public static String getRelativePathRoot() {
		// return new File("src/main/java/com/henrikbeck95").getAbsolutePath();

		File file = new File("src/main/java/com/henrikbeck95");

		return file.getAbsolutePath();
	}

	public static String getRelativePathDicitionary(String filename) {
		File file = new File(getRelativePathRoot() + "/assets/dictionary/" + filename);

		return file.getAbsolutePath();
	}

	public static ArrayList<String> storeEachLineIntoArray(String pathFile) {
		Scanner scanner = null;
		ArrayList<String> arrayList = new ArrayList<String>();

		try {
			scanner = new Scanner(new File(pathFile), "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		while (scanner.hasNext()) {
			arrayList.add(scanner.next());
		}

		scanner.close();

		return arrayList;
	}

	public static ArrayList<String> normalizeCharactersUtf8(ArrayList<String> arrayList) {
		String aux = "";

		for (int i = 0; i < arrayList.size(); i++) {
			aux = Normalizer.normalize(arrayList.get(i), Normalizer.Form.NFD)
					.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
			arrayList.set(i, aux);
		}

		return arrayList;
	}

	public static ArrayList<String> normalizeWordLength(ArrayList<String> arrayList, int minimum, int maximum) {
		for (int i = arrayList.size() - 1; i >= 0; i--) {
			if (arrayList.get(i).length() < minimum || arrayList.get(i).length() > maximum) {
				arrayList.remove(i);
			}
		}

		return arrayList;
	}

	public static ArrayList<String> normalizeCase(ArrayList<String> arrayList, String formatCase) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (formatCase.equals("upper")) {
				arrayList.set(i, arrayList.get(i).toUpperCase());
			} else {
				arrayList.set(i, arrayList.get(i).toLowerCase());
			}
		}

		return arrayList;
	}
	
	public static ArrayList<String> normalizeRemoveDuplicate(ArrayList<String> arrayList) {
		return (ArrayList<String>) arrayList.stream().distinct().collect(Collectors.toList());
	}
}