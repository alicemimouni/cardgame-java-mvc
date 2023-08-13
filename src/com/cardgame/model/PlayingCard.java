package com.cardgame.model;

public class PlayingCard {

	private Rank rank;
	private Suit suit;
	private boolean faceUp; // to know if card is returned
	//Constructor
	public PlayingCard(Rank rank, Suit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}
	
	//getters
	public Rank getRank() {
		return rank;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public boolean isFaceUp() {
		return faceUp;
	}
	
	//Inverse attribute value faceUp
	public boolean flip() {
		faceUp = !faceUp;
		return faceUp;
	}
	
}
