package entity.container;

import entity.base.Container;
import entity.base.Ingredient;
import logic.StringUtil;

public class Dish extends Container {
	private int dirty;

	public Dish() {
		super("Dish", 4);
		this.setDirty(0);
	}

	public Dish(int dirty) {
		super("Dish", 4);
		this.setDirty(dirty);
	}

	public boolean isDirty() {
		return dirty > 0;
	}

	public boolean verifyContent(Ingredient i) {
		return isDirty() == false && i.isEdible();
	}

	public int getDirty() {
		return dirty;
	}

	public void setDirty(int dirty) {
		if (dirty <= 0) {
			this.dirty = 0;
			this.setName("Dish");
			return;
		}
		this.dirty = dirty;
		this.setName("Dirty Dish");
	}

	public void clean(int amount) {
		this.setDirty(dirty - amount);
	}

	public String toString() {
		if (this.isDirty())
			return StringUtil.formatNamePercentage(this.getName(), dirty);
		return super.toString();
	}

}
