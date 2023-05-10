package gui;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class NumberSquare extends HBox {

	private int number;
	private boolean isDrawn;
	private Text numberText;

	public NumberSquare() {
		BingoUtil.initializeNumberSquare(this);
	}

	public void setupNumber(int number) {
		// TODO
		this.number = number;
		this.isDrawn = false;
		this.numberText.setText(String.valueOf(number));
//		this.numberText = ((Integer) number).toString());
//		this.numberText = new Text();
//		this.numberText.setText(((Integer) number).toString());
		this.setBackground(new Background(new BackgroundFill(Color.WHITE, null, getInsets())));
	}

	public void highlight() {
		// TODO
		this.isDrawn = true;
		this.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, getInsets())));
	}

	public int getNumber() {
		return number;
	}

	public boolean isDrawn() {
		return isDrawn;
	}

	public void setNumberText(Text numberText) {
		this.numberText = numberText;
	}
}
