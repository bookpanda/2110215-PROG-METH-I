package entity.counter;

import logic.InvalidIngredientException;
import logic.LogicUtil;
import logic.Player;

public class Crate extends Counter {
	private String myIngredient;

	public Crate(String s) {
		super(s + " Crate");
		this.setMyIngredient(s);
	}

	public void interact(Player p) {
		if (!p.isHandEmpty() || !this.isPlacedContentEmpty()) {
			super.interact(p);
			return;
		}
		try {
			p.setHoldingItem(LogicUtil.createIngredientFromName(myIngredient));
		} catch (InvalidIngredientException e) {
			p.setHoldingItem(null);
		}
	}

	public String getMyIngredient() {
		return myIngredient;
	}

	public void setMyIngredient(String myIngredient) {
		this.myIngredient = myIngredient;
	}

}
