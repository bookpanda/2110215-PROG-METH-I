package logic.unit;

public class BaseCompetitor {
	private String name;
	private int power;
	private int hp;

	public BaseCompetitor(String name) {
		this.setName(name);
		this.setHp(5);
		this.setPower(3);
	}

	public BaseCompetitor(String name, int hp, int power) {
		this.setName(name);
		this.setHp(hp);
		this.setPower(power);
	}

	public void attack(BaseCompetitor enemy) {
		enemy.setHp(enemy.getHp() - this.getPower() );
	}

	public String getType() {
		return this.getClass().getSimpleName();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = Math.max(power, 1);
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = Math.max(hp, 0);
	}
}
