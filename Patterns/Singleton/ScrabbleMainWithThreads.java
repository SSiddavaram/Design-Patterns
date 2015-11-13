package com.patterns.singleton;

public class ScrabbleMainWithThreads {
	public static void main(String[] args){
		Runnable player1Letters = new GetNLetters();
		Runnable player2Letters = new GetNLetters();
		
		Thread player1 = new Thread(player1Letters);
		Thread player2 = new Thread(player2Letters);
		
		player1.start();
		player2.start();
	}
}
