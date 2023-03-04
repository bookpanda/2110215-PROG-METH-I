import game.SimpleDice;

public class MyCasino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDice d1 = new SimpleDice();
		SimpleDice d2 = new SimpleDice(6);
		d1.setFaceValue(4);
		System.out.println(d1);
	}

}
