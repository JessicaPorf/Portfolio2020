package com.qa.uniqueLetter;

import java.util.LinkedHashSet;
import java.util.Set;

public class uniqueLetters {

	
		public static void main(String[] args) {
	System.out.println("What are the unique letters from the string 'sentence'? " + uniqueLetters("sentence"));
	System.out.println("What are the unique letters from the string 'Hello all of you'? " + uniqueLetters("Hello all of you"));
		}
		public static String uniqueLetters(String sentence) {
			Set<Character> uniqueLetterList = new LinkedHashSet<Character>();
			String uniqueLetters = "";
			for(int i = 0; i<sentence.length();i++) {
				uniqueLetterList.add(sentence.charAt(i));
			}
			for(char c : uniqueLetterList) {
				uniqueLetters = uniqueLetters+c;
			}
			return uniqueLetters;
		}
	}