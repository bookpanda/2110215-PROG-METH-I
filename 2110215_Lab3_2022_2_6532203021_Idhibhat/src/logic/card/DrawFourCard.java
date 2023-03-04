package logic.card;

import logic.game.CardColor;
import logic.game.CardSymbol;
import logic.game.GameLogic;

import java.util.ArrayList;

//You CAN modify the first line
public class DrawFourCard extends EffectCard {
	// TODO Implement here
	public DrawFourCard() {
		super(null, CardSymbol.DRAW_FOUR);
	}

	public String performEffect() {
		String message = "";
		try {
			BaseCard firstCard = GameLogic.getInstance().getCurrentPlayerHand().get(0);
			CardColor firstColor = firstCard.getColor();
			if (firstColor == null) {
				this.setColor(CardColor.RED);
			} else {
				this.setColor(firstColor);
			}
		} catch (Exception e) {
			// TODO: handle exception
			this.setColor(CardColor.RED);
		}
		message += "Set color to " + this.getColor() + "\n";

		int drawAmount = GameLogic.getInstance().getDrawAmount();
		GameLogic.getInstance().setDrawAmount(drawAmount + 4);
		GameLogic.getInstance().goToNextPlayer();
		while (GameLogic.getInstance().getCurrentPlayerHand().size() == 0) {
			GameLogic.getInstance().goToNextPlayer();
		}
		ArrayList<BaseCard> deck = GameLogic.getInstance().getCurrentPlayerHand();
		int id = 0;
		boolean flag = false;
		for (int i = 0; i < deck.size(); i++) {
			CardSymbol symbol = deck.get(i).getSymbol();
			CardColor color = deck.get(i).getColor();
			if ((symbol.equals(CardSymbol.DRAW_TWO) && color.equals(this.getColor()))
					|| symbol.equals(CardSymbol.DRAW_FOUR)) {
				id = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			BaseCard drawCard = deck.get(id);
			if (drawCard.getSymbol().equals(CardSymbol.DRAW_TWO)) {
				drawCard = ((DrawTwoCard) drawCard);
			}

			else if (drawCard.getSymbol().equals(CardSymbol.DRAW_FOUR)) {
				drawCard = ((DrawFourCard) drawCard);
			}
			message += "Player " + GameLogic.getInstance().getCurrentPlayer() + " played " + drawCard.toString() + ". "
					+ (GameLogic.getInstance().getCurrentPlayerHand().size() - 1) + " cards remaining.\n"
					+ drawCard.play();
			return message;
		} else {
			message += "Player " + GameLogic.getInstance().getCurrentPlayer() + " drew "
					+ GameLogic.getInstance().getDrawAmount() + " cards. ";
			GameLogic.getInstance().draw(GameLogic.getInstance().getDrawAmount());
			GameLogic.getInstance().setDrawAmount(0);
			message += GameLogic.getInstance().getCurrentPlayerHand().size() + " cards remaining.";
			return message;
		}
	}

	public boolean canPlay() {
		return true;
	}

	@Override
	public String toString() {
		if (this.getColor() == null) {
			return "DRAW FOUR";
		}
		return "DRAW FOUR (" + this.getColor().toString() + " color selected)";

	}

}
