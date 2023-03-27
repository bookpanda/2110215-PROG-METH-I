package entity.ingredient;

import entity.base.Cookable;
import entity.base.Ingredient;
import logic.StringUtil;

public class Egg extends Ingredient implements Cookable {
	private int cookedPercentage;

	public Egg() {
		super("Egg");
		this.setCookedPercentage(0);
		this.setEdible(false);
	}

	public void cook() {
		this.setCookedPercentage(cookedPercentage + 12);
		if (cookedPercentage <= 50) {
			this.setName("Raw Egg");
			this.setEdible(false);
		} else if (cookedPercentage <= 80) {
			this.setName("Sunny Side Egg");
			this.setEdible(true);
		} else if (cookedPercentage <= 100) {
			this.setName("Fried Egg");
			this.setEdible(true);
		} else {
			this.setName("Burnt Egg");
			this.setEdible(false);
		}
	}

	public boolean isBurnt() {
		return cookedPercentage > 100;
	}

	public String toString() {
		return StringUtil.formatNamePercentage(this.getName(), cookedPercentage);
	}
	
	public int getCookedPercentage() {
		return cookedPercentage;
	}

	public void setCookedPercentage(int cookedPercentage) {
		this.cookedPercentage = cookedPercentage;
	}
}
