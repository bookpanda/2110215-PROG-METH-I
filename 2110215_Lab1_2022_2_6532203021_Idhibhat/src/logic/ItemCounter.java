package logic;

public class ItemCounter {
	private Item item;
	private int count;

	public ItemCounter(Item item) {
		this.setItem(item);
		this.setCount(1);
	}

	public ItemCounter(Item item, int count) {
		this.setItem(item);
		if (count < 1)
			this.setCount(1);
		else
			this.setCount(count);
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		if (count < 0)
			this.count = 0;
		else
			this.count = count;
	}

	public String toString() {
		return this.getItem() + " x" + this.getCount();
	}
}
