package logic;

import java.util.ArrayList;

public class Market {

	// fields
	private ArrayList<Item> allItems;

	// constructors
	public Market() {
		// FILL CODE
		this.allItems = new ArrayList<Item>();
	}

	public Market(ArrayList<Item> items) {
		// FILL CODE
		this.allItems = new ArrayList<Item>();
		this.addAllItems(items);
	}

	// methods
	public String toString() {
		String out = "\n";
		for (int i = 0; i < allItems.size(); i++) {
			out += i + 1;
			out += ". ";
			out += allItems.get(i).toString();
			out += "\n";
		}
		return out;
	}

	public void addAllItems(ArrayList<Item> items) {
		// FILL CODE
		if (items == null)
			return;

		for (Item item : items) {
			boolean flag = true;
			for (Item marItem : this.getAllItems()) {
				if (marItem.equals(item)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				this.getAllItems().add(item);
				System.out.println("\"" + item.getItemName() + " $" + item.getPrice() + "\" Added to the market.");
			}
		}
	}

	// getter setters
	// FILL CODE
	public ArrayList<Item> getAllItems() {
		return this.allItems;
	}

}
