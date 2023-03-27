package entity.counter;

import java.util.ArrayList;

import entity.base.Container;
import entity.base.Ingredient;
import logic.Player;

public class Bin extends Counter {

	public Bin() {
		super("Bin");
	}

	public void interact(Player p) {
		if (p.isHandEmpty())
			return;
		if (p.getHoldingItem() instanceof Ingredient) {
			p.setHoldingItem(null);
			return;
		}
		if (p.getHoldingItem() instanceof Container) {
			Container newItem = ((Container) p.getHoldingItem());
			newItem.clearContent();
			p.setHoldingItem(newItem);
			return;
		}
	}

}
