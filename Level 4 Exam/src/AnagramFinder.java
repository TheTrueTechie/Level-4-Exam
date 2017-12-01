import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AnagramFinder {

	public static void main(String[] args) throws IOException {
		/*
		ArrayList anagramSearcher = new ArrayList();
		Scanner textFileReader = new Scanner(new File("AnagramList.txt"));

		String inputedWord = " ";
		String listWord = " ";
		String finalWord = " ";

		char inputedLetter = ' ';
		char listLetter = ' ';

		JOptionPane.showMessageDialog(null,
				"Hello, please enter a word and we will search through our database with 235,866 words to see if there is an anagram!");
		inputedWord = JOptionPane.showInputDialog("Enter here!");

		for (int i = 0; i < 2358661; i++) {
			anagramSearcher.add(textFileReader.nextLine());
			anagramSearcher.get(0);

			listWord = anagramSearcher.toString();
			listLetter = listWord.charAt(i);

			if (inputedLetter == listLetter) {
				JOptionPane.showMessageDialog(null, listWord.length());
			}
		}
/*
		/*
		 * for (int i = 0; i < 235886; i++) {
		 * anagramSearcher.add(textFileReader.nextLine()); anagramSearcher.get(i);
		 * currentWord = anagramSearcher.toString(); currentLetter =
		 * currentWord.charAt(i);
		 * 
		 * for (int j = 235886; j < args.length; j++) { anagramSearcher.get(j+1);
		 * nextWord = anagramSearcher.toString(); nextLetter = nextWord.charAt(j); if
		 * (currentLetter==nextLetter) { System.out.println(currentLetter + nextLetter);
		 * } //System.out.println(anagramSearcher.size());
		 * //System.out.println(textFileReader.nextLine()); } }
		 */
	}
}
