package entity.container;

import java.util.ArrayList;

import entity.base.Container;
import entity.base.Cookable;
import entity.base.Ingredient;

public class Pan extends Container {
	public Pan() {
		super("Pan", 1);
	}

	public boolean verifyContent(Ingredient i) {
		return i instanceof Cookable;
	}

	public void cook() {
		ArrayList<Ingredient> arr = this.getContent();
		for(Ingredient item: arr) {
			((Cookable) item).cook();
		}
	}
}
