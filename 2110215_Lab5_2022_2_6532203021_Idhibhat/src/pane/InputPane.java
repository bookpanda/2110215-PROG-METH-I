package pane;

import component.TodoItem;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class InputPane extends HBox {
	public InputPane() {
		// TODO: FILL CODE
		this.setPrefHeight(70);
		this.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setSpacing(20);
		this.setAlignment(Pos.CENTER);
		final TextField tf = new TextField();
		tf.setPrefWidth(300);
		Button btn = new Button();
		btn.setText("Submit");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (!tf.getText().equals("")) {
					TodoItem td = new TodoItem(tf.getText());
					DisplayPane dp = RootPane.getDisplayPane();
					dp.addTodoItem(td);
					tf.clear();
				}
			}
		});
		this.getChildren().addAll(tf, btn);
	}
}
