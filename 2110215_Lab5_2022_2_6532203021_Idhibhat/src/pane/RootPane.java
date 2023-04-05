package pane;

import javafx.scene.layout.BorderPane;

public class RootPane extends BorderPane {
	private static NavigationPane navigationPane;
	private static DisplayPane displayPane;
	private static InputPane inputPane;

	public RootPane() {
		// TODO: FILL CODE
		navigationPane = new NavigationPane();
		displayPane = new DisplayPane();
		inputPane = new InputPane();
		navigationPane.addPage();
		this.setLeft(getNavigationPane());
		this.setCenter(getDisplayPane());
		this.setBottom(getInputPane());
	}

	public static NavigationPane getNavigationPane() {
		return navigationPane;
	}

	public static DisplayPane getDisplayPane() {
		return displayPane;
	}

	public static InputPane getInputPane() {
		return inputPane;
	}
}
