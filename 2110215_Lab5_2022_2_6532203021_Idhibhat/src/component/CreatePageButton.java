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

public class CreatePageButton extends StackPane {
	public CreatePageButton() {
		Circle circle = new Circle();
		circle.setRadius(20);
		circle.setFill(Color.LIGHTGRAY);
		Text text = new Text();
		text.setText("+");
		text.setStyle("-fx-font: 20 arial;");
		this.setCursor(Cursor.HAND);
		this.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				NavigationPane np = RootPane.getNavigationPane();
				np.addPage();
			}
		});

		this.getChildren().addAll(circle, text);
	}

}
