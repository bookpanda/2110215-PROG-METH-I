package logic;

import exception.NameBlankException;

public class Item {

	private String itemName;
	private int price;

	// constructor
	public Item(String itemName) throws NameBlankException {
		// FILL CODE
		this.setItemName(itemName);
		this.setPrice(0);
	}

	public Item(String itemName, int price) throws NameBlankException {
		// FILL CODE
		this.setItemName(itemName);
		this.setPrice(price);
	}

	// methods
	public boolean equals(Item other) {
		// FILL CODE
		if (this.getItemName().equals(other.getItemName()))
			return true;
		return false;
	}

	public String toString() {
		// FILL CODE
		return this.getItemName() + " $" + this.getPrice();
	}

	// getter & setter
	public String getItemName() {
		// FILL CODE
		return this.itemName;
	}

	public void setItemName(String itemName) throws NameBlankException {
		// FILL CODE
		if (itemName.isBlank()) {
			throw new NameBlankException();
		}
		this.itemName = itemName;
	}

	public int getPrice() {
		// FILL CODE
		return this.price;
	}

	public void setPrice(int price) {
		// FILL CODE
		if (price < 0)
			this.price = 0;
		else
			this.price = price;
	}

}
