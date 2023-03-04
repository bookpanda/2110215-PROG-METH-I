package logic.unit;

public class Tiger extends BaseCompetitor {

	public Tiger(String name) {
		super(name, 7, 5);
	}

	public Tiger(String name, int hp, int power) {
		super(name, hp, power);
	}

	public void attack(BaseCompetitor enemy) {
		if (enemy.getType().equals("ToughMan")) {
			enemy.setHp((int) Math.round(enemy.getHp() - this.getPower() / 2));
		} else if (enemy.getType().equals("Sorcerer")) {
			enemy.setHp((int) Math.round(enemy.getHp() - this.getPower() * 1.5));
		} else {
			enemy.setHp(enemy.getHp() - this.getPower());
		}
	}

	public void train(int addPower) {
		if(addPower > 0)
		this.setPower(this.getPower() + addPower);
	}

}
