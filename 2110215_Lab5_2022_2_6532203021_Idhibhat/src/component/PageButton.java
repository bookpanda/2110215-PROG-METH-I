package component;

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import pane.NavigationPane;
import pane.RootPane;

public class PageButton extends StackPane {
	private Circle circle;

	public PageButton(final int pageNumber) {
		circle = new Circle();
		circle.setRadius(25);
		circle.setFill(Color.LIGHTGRAY);
		Text text = new Text();
		text.setText(Integer.toString(pageNumber));
		text.setStyle("-fx-font: 25 arial;");
		this.setCursor(Cursor.HAND);
		this.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				NavigationPane np = RootPane.getNavigationPane();
				np.setCurrentPage(pageNumber);
			}
		});
		this.getChildren().addAll(circle, text);
	}

	public void setActive(boolean value) {
		if (value) {
			circle.setFill(Color.WHITE);
		} else {
			circle.setFill(Color.LIGHTGRAY);
		}
	}
}
