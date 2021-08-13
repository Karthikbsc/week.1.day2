package week1.day2;

import java.util.Arrays;

public class Anagram {
	
public static void main(String[] args) {

	String word1 = "fried";
	String word2 = "fired";
	
	if(word1.length()==word2.length()) {
		
		char[] arrword1 = word1.toCharArray();
		char[] arrword2 = word2.toCharArray();
		Arrays.sort(arrword1);
		Arrays.sort(arrword2);
		
		for (int i = 0; i < arrword2.length; i++) {
			if(arrword1 != arrword2) {
				System.out.println("The given string are not an anagram");
				break;
			}
			System.out.println("The give string is an anagram");
			}
			
			
		}
		
	}
	
	
	
	
}


