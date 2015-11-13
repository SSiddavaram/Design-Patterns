package com.patterns.singleton;

import java.util.LinkedList;

public class ScrabbleMain {
	public static void main(String[] args){
		Scrabble scrabble = Scrabble.getInstance();
		System.out.println("Scrabble Instance: "+System.identityHashCode(scrabble) +"  scrabble hashcode: "+scrabble.hashCode());
		System.out.println("List of letters : "+scrabble.getScrabbleLetterList());
		LinkedList<String> player1 = scrabble.getNLetters(5);
		System.out.println("Player1 letters : "+player1);
		System.out.println("List of letters After player1 : "+scrabble.getScrabbleLetterList());
		
		Scrabble scrabble2 = Scrabble.getInstance();
		System.out.println("List of letters : "+scrabble2.getScrabbleLetterList());
		System.out.println("Scrabble Instance: "+System.identityHashCode(scrabble2) +"  scrabble hashcode: "+scrabble2.hashCode());
		LinkedList<String> player2 = scrabble2.getNLetters(7);
		System.out.println("Player2 letters : "+player2);
		System.out.println("List of letters After player2 : "+scrabble2.getScrabbleLetterList());
	}
}
