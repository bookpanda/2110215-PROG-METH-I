package entity.ingredient;

import entity.base.Choppable;
import entity.base.Ingredient;

public class Lettuce extends Ingredient implements Choppable {
	private boolean chopState;
	
	public Lettuce() {
		super("Lettuce");
		this.setEdible(true);
		this.setChopState(false);
	}
	
	public void chop() {
		if(chopState == true) {
			return;
		}
		this.setChopState(true);
		this.setName("Chopped Lettuce");
	}

	public boolean isChopped() {
		return chopState;
	}

	public void setChopState(boolean chopState) {
		this.chopState = chopState;
	}
}
