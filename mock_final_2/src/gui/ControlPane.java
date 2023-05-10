package gui;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

//You might need to do something to the following line
public class ControlPane extends VBox {

	private Text drawnNumberText;
	private Text drawCountText;
	private Text bingoText;
	private Button drawButton;
	private Button newRoundButton;
	private NumberGrid numberGrid;

	public ControlPane(NumberGrid numberGrid) {
		// TODO
		this.numberGrid = numberGrid;
		this.setAlignment(Pos.CENTER);
		this.setPrefWidth(300);
		this.setSpacing(20);
		this.setBorder(new Border(
				new BorderStroke(Color.LIGHTGRAY, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		this.drawnNumberText = new Text();
		this.drawnNumberText.setFont(new Font(20));
		this.drawCountText = new Text();
		initializeBingoText();
		initializeDrawButton();
		initializeNewRoundButton();

		this.getChildren().addAll(drawnNumberText, drawButton, newRoundButton, bingoText, drawCountText);
		BingoUtil.setTextsBeginning(drawnNumberText, drawCountText);
	}

	private void initializeBingoText() {
		// TODO
		this.bingoText = new Text();
		this.bingoText.setText("Bingo!!");
		this.bingoText.setFont(new Font(40));
		this.bingoText.setVisible(false);
	}

	private void initializeDrawButton() {
		// TODO
		this.drawButton = new Button();
		this.drawButton.setText("Draw a number");
		this.drawButton.setPrefWidth(100);
		this.drawButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				drawButtonHandler();
			}
		});
	}

	private void initializeNewRoundButton() {
		// TODO
		this.newRoundButton = new Button();
		this.newRoundButton.setText("New Round");
		this.newRoundButton.setPrefWidth(100);
		this.newRoundButton.setDisable(true);
		this.newRoundButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				newRoundButtonHandler();
			}
		});
	}

	private void drawButtonHandler() {
		// TODO
		int drawnNumber = BingoUtil.drawNumber();
		this.drawButton.setText(((Integer) drawnNumber).toString());
		ObservableList<NumberSquare> numbers = this.numberGrid.getNumberSquares();
		for (int i = 0; i < numbers.size(); i++) {
			NumberSquare num = numbers.get(i);
			if (num.getNumber() == drawnNumber) {
				this.numberGrid.highlightNumber(drawnNumber);
			}
		}
		if (BingoUtil.isBingo(this.numberGrid)) {
			this.bingoText.setVisible(true);
			this.drawButton.setDisable(true);
			this.newRoundButton.setDisable(false);
		}
		BingoUtil.updateTextsAfterDrawn(drawnNumber, this.drawnNumberText, this.drawCountText);

	}

	private void newRoundButtonHandler() {
		// TODO

		this.bingoText.setVisible(false);
		this.drawButton.setDisable(false);
		this.newRoundButton.setDisable(true);
		BingoUtil.assignRandomNumbers(this.numberGrid.getNumberSquares());
		BingoUtil.setTextsBeginning(this.drawnNumberText, this.drawCountText);
	}

	public Text getDrawnNumberText() {
		return drawnNumberText;
	}

	public Text getDrawCountText() {
		return drawCountText;
	}

	public Text getBingoText() {
		return bingoText;
	}

	public Button getDrawButton() {
		return drawButton;
	}

	public Button getNewRoundButton() {
		return newRoundButton;
	}

	public NumberGrid getNumberGrid() {
		return numberGrid;
	}

}
