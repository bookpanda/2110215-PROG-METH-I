package component;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import pane.DisplayPane;
import pane.RootPane;

public class TodoItem extends HBox {
	public TodoItem(String value) {
		this.setSpacing(10);
		Text text = new Text();
		text.setText(value);
		text.setStyle("-fx-font: 20 arial;");
		Button button = new Button();
		button.setText("Delete");
		final TodoItem _self = this;
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				DisplayPane dp = RootPane.getDisplayPane();
				dp.removeTodoItem(_self);
			}
		});

		this.getChildren().addAll(text, button);
	}
}
