package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

//You CAN modify the first line
public class SkipCard extends EffectCard {
	// TODO Implement here
	public SkipCard(CardColor color) {
		super(color, CardSymbol.SKIP);
	}

	public String performEffect() {
		GameLogic.getInstance().goToNextPlayer();
		while (GameLogic.getInstance().getCurrentPlayerHand().size() == 0) {
			GameLogic.getInstance().goToNextPlayer();
		}
		return "Skipped player " + GameLogic.getInstance().getCurrentPlayer();
	}

	public boolean canPlay() {
		CardColor topColor = GameLogic.getInstance().getTopCard().getColor();
		CardSymbol topSymbol = GameLogic.getInstance().getTopCard().getSymbol();
		if (topColor.equals(this.getColor()) || topSymbol.equals(this.getSymbol())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.getColor().toString() + " " + this.getSymbol().toString();
	}
}
