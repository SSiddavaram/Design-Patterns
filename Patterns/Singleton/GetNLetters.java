package com.patterns.singleton;

import java.util.LinkedList;

public class GetNLetters implements Runnable{
	@Override
	public void run() {
		ScrabbleThreads scrabbleThreads = ScrabbleThreads.getInstance();
		System.out.println("Scrabble Instance: "+System.identityHashCode(scrabbleThreads) +"  scrabble hashcode: "+scrabbleThreads.hashCode());
		System.out.println("Scrabble letter list : "+scrabbleThreads.getScrabbleLetterList());
		LinkedList<String> player1 = scrabbleThreads.getNLetters(5);
		System.out.println("Player1 letters : "+player1);
		System.out.println("List of letters After player1 : "+scrabbleThreads.getScrabbleLetterList());
	}
}
