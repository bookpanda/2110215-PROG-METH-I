package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;
import logic.game.PlayDirection;

//You CAN modify the first line
public class ReverseCard extends EffectCard {
	// TODO Implement here
	public ReverseCard(CardColor color) {
		super(color, CardSymbol.REVERSE);
	}

	public String performEffect() {
		PlayDirection oppositeDirection = GameLogic.getInstance().getPlayDirection().getOpposite();
		GameLogic.getInstance().setPlayDirection(oppositeDirection);
		return "Set direction to " + GameLogic.getInstance().getPlayDirection().toString();
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
