package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Wizard extends Unit implements Attackable {
	public Wizard(int maxHealth, int speed, int power, int location) {
		super("Wizard", "w", maxHealth, speed, location, true);
		this.setPower(power);
		this.setRange(2);
	}

	public int attack(Unit e) {
		if (this.sameTeam(e) || !BattleUtils.validRange(this.getRange(), this.getLocation(), e.getLocation())) {
			return -1;
		} else {
			return this.getPower();
		}
	}

}
