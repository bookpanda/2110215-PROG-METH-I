package logic.unit;

public class ToughMan extends BaseCompetitor {
	private int maxHp;

	public ToughMan(String name) {
		super(name, 8, 4);
		this.setMaxHp(8);
	}

	public ToughMan(String name, int hp, int power) {
		super(name, hp, power);
		this.setMaxHp(hp);
	}

	public void attack(BaseCompetitor enemy) {
		if (enemy.getType().equals("Sorcerer")) {
			enemy.setHp((int) Math.round(enemy.getHp() - this.getPower() / 2));
		} else if (enemy.getType().equals("Tiger")) {
			enemy.setHp((int) Math.round(enemy.getHp() - this.getPower() * 1.5));
		} else {
			enemy.setHp(enemy.getHp() - this.getPower());
		}
	}

	public void heal(int healHp) {
		if(healHp > 0)
		this.setHp(Math.min(this.getHp() + healHp, this.getMaxHp()));
	}

	public int getMaxHp() {
		return this.maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = Math.max(maxHp, 0);
		this.setHp(Math.min(this.getHp(), maxHp));
	}

}
