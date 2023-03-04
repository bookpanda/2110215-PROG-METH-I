package logic.unit;

public class Sorcerer extends BaseCompetitor {

	public Sorcerer(String name) {
		super(name, 4, 2);
	}

	public Sorcerer(String name, int hp, int power) {
		super(name, hp, power);
	}

	public void attack(BaseCompetitor enemy) {
		if (enemy.getType().equals("Tiger")) {
			enemy.setHp((int) Math.round(enemy.getHp() - this.getPower() / 2));
		} else if (enemy.getType().equals("ToughMan")) {
			enemy.setHp((int) Math.round(enemy.getHp() - this.getPower() * 1.5));
		} else {
			enemy.setHp(enemy.getHp() - this.getPower());
		}
	}

	public void lowerPower(BaseCompetitor enemy, int powerDown) {
		if(powerDown > 0)
		enemy.setPower(Math.max(enemy.getPower() - powerDown, 1));
	}

}
