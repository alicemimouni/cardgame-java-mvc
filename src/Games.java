


import com.cardgame.controller.GameController;
import com.cardgame.model.DeckFactory;
import com.cardgame.model.DeckFactory.DeckType;
import com.cardgame.view.GameSwingView;
import com.games.HighCardGameEvaluator;

public class Games {
	
	public static void main(String args[]) {
		GameSwingView gsv = new GameSwingView();
		gsv.createAndShowGUI();
		
		GameController gc = new GameController(DeckFactory.makeDeck(DeckType.Normal), gsv, new HighCardGameEvaluator());
		
		gc.run();
	}
}
