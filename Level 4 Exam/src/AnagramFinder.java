import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class AnagramFinder {
	String inputedWord;

	public static void main(String[] args) {
		AnagramFinder a = new AnagramFinder();
	}

	public AnagramFinder() {
		inputedWord = JOptionPane.showInputDialog("Hello! Please input an anagram. Thank You!");
		run(inputedWord);
	}

	public String run(String word) {
		Scanner textFileReader = null;
		try {
			textFileReader = new Scanner(new File("AnagramList.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (textFileReader.hasNext()) {
			int count = 0;
			char letters1[] = word.toCharArray();

			String word1 = "";
			word1 = textFileReader.nextLine();

			char letters2[] = word1.toCharArray();

			int list1 = letters1.length;
			int list2 = letters2.length;

			if (list1 == list2) {

				for (int i = 0; i < letters1.length; i++) {
					for (int j = 0; j < letters1.length; j++) {
						if (letters1[i] == letters2[j]) {
							count++;
							break;
						}
					}
				}
			}
			if (count == letters1.length) {
				if (!word1.equals(inputedWord)) {
					System.out.println(word1);
				}
				if (count == 0) {
					System.out.println("No Anagrams Detected");
				}
			}
		}

		return "No Anagrams Detected";

	}
}