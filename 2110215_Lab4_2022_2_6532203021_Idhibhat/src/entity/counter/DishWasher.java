package entity.counter;

import entity.base.Updatable;
import entity.container.Dish;
import logic.Player;

public class DishWasher extends Counter implements Updatable {

	public DishWasher() {
		super("Dish Washer");
	}

	public void interact(Player p) {
		if (!this.isPlacedContentEmpty()) {
			super.interact(p);
			return;
		}
		if (p.getHoldingItem() instanceof Dish) {
			Dish d = (Dish) p.getHoldingItem();
			if (d.isDirty()) {
				super.interact(p);
				return;
			}
		}
	}
	
	public void update() {
		if(this.getPlacedContent() instanceof Dish) {
			Dish d = (Dish) this.getPlacedContent();
			d.clean(15);
		}
	}

}
