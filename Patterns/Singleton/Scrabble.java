package com.patterns.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Scrabble {
	private static Scrabble scrabbleInstance = null;
	private String[] scrabbleLetters = {"a","a","a","a","a","a","a","a","a","b","b","c",
			"c","d","d","d","d","e","e","e","e","e","e","e","e","e","e","e","e","f","f",
			"g","g","g","h","h","i","i","i","i","i","i","i","i","i","j","k","l","l","l",
			"l","m","m","n","n","n","n","n","n","o","o","o","o","o","o","o","o","p","p",
			"q","r","r","r","r","r","r","s","s","s","s","t","t","t","t","t","t","u","u",
			"u","u","v","v","w","w","x","y","y","z"};
	private LinkedList<String> scrabbleLetterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
	
	private Scrabble(){
		
	}
	public static Scrabble getInstance(){
		if(scrabbleInstance == null){
			scrabbleInstance = new Scrabble();
		}
		Collections.shuffle(scrabbleInstance.scrabbleLetterList);
		return scrabbleInstance;
	}
	
	public LinkedList<String> getScrabbleLetterList(){
		return scrabbleLetterList;
	}
	
	public LinkedList<String> getNLetters(int noOfLetters){
		LinkedList<String> nLetters = new LinkedList<String>();
		for(int i=0;i<=noOfLetters;i++){
			nLetters.add(scrabbleInstance.getScrabbleLetterList().remove(0));
		}
		return nLetters;
	}
}
