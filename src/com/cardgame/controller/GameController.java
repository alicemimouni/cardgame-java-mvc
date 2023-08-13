package com.cardgame.controller;

import java.util.ArrayList;
import java.util.List;

import com.cardgame.model.Deck;
import com.cardgame.model.Player;

class View {
	public void something() {
		
	};
	
	public void setController(GameController gc) {
		
	};
}

public class GameController {
	
	enum GameState {
		AddingPlayers, CardsDealt, WinnerRevealed;
	}
	
	Deck deck;
	List<Player> players;
	Player winner;
	View view;
	
	GameState gamestate;
	
	public GameController(Deck deck, View view) {
		super();
		this.deck = deck;
		this.view = view;
		this.players = new ArrayList<Player>();
		this.gamestate = GameState.AddingPlayers;
		view.setController(this);
	}
	
	public void run() {
		while (gameState == GameState.AddingPlayers) {
			view.something();
		}
		
		switch (gameState) {
		case CardsDealt:
			view.something();
			break;
		case WinnerRevealed:
			view.something();
			break;
		}
	}
}
