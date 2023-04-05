package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class FXHelloWorld extends Application {

	// Override the start method in the Application class
	@Override
	public void start(Stage primaryStage) {
		// Create a scene and place a button in the scene
		Button btn = new Button("Hello world");

		btn.setOnAction(new EventHandler<ActionEvent>() {

//			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hwlloe");
			}
		});

		btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				System.out.println("mouse over");
			}
		});
		
		btn.setOnMouseExited(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent arg0) {
				System.out.println("bye bye");
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("MyJavaFX"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
