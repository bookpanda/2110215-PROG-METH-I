package game;

public class SimpleDice {
//	1) properties, fields
	public static final int MAX = 6;
	private int faceValue;

//	2) actions, methods  --> function

//	2.1) constructor
	public SimpleDice() {
		this.faceValue = 1;
		this.roll();
	}

	public SimpleDice(int value) {
		this.faceValue = value;
	}

//	2.2) setter method (modifier)
	public void setFaceValue(int faceValue) {
		if (faceValue > this.MAX) {
			this.faceValue = this.MAX;
		} else if (faceValue < 1) {
			this.faceValue = 1;
		} else
			this.faceValue = faceValue;
	}
	
//	2.3 getter
	public int getFaceValue() {
		return this.faceValue;
	}
	
//	2.4 recommended method
	public String toString() {
		return "My face value is " + this.faceValue;
	}
	
//	2.5 general method
	public int roll() {
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}

}
