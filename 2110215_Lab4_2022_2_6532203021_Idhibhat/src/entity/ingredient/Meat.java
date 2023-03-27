package entity.ingredient;

import entity.base.Choppable;
import entity.base.Cookable;
import entity.base.Ingredient;
import logic.StringUtil;

public class Meat extends Ingredient implements Cookable, Choppable {
	private boolean chopState;
	private int cookedPercentage;

	public Meat() {
		super("Meat");
		this.setCookedPercentage(0);
		this.setChopState(false);
		this.setEdible(false);
	}

	public void chop() {
		if (chopState == true) {
			return;
		}
		this.setChopState(true);
		this.setName("Minced Meat");
	}

	public boolean isChopped() {
		return chopState;
	}

	public void cook() {
		if (chopState) {
			this.setCookedPercentage(cookedPercentage + 15);
			if (cookedPercentage <= 80) {
				this.setName("Raw Burger");
				this.setEdible(false);
			} else if (cookedPercentage <= 100) {
				this.setName("Cooked Burger");
				this.setEdible(true);
			} else {
				this.setName("Burnt Burger");
				this.setEdible(false);
			}
		} else {
			this.setCookedPercentage(cookedPercentage + 10);
			if (cookedPercentage <= 50) {
				this.setName("Raw Meat");
				this.setEdible(false);
			} else if (cookedPercentage <= 80) {
				this.setName("Medium Rare Steak");
				this.setEdible(true);
			} else if (cookedPercentage <= 100) {
				this.setName("Well Done Steak");
				this.setEdible(true);
			} else {
				this.setName("Burnt Steak");
				this.setEdible(false);
			}
		}
	}

	public boolean isBurnt() {
		return cookedPercentage > 100;
	}

	public String toString() {
		return StringUtil.formatNamePercentage(this.getName(), cookedPercentage);
	}

	public void setChopState(boolean chopState) {
		this.chopState = chopState;
	}

	public int getCookedPercentage() {
		return cookedPercentage;
	}

	public void setCookedPercentage(int cookedPercentage) {
		this.cookedPercentage = cookedPercentage;
	}
}
