package pane;

import component.CreatePageButton;
import component.PageButton;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class NavigationPane extends VBox {
	private ArrayList<PageButton> pageButtons = new ArrayList<PageButton>();
	private int currentPage;

	public NavigationPane() {
		this.setPrefWidth(80);
		this.setBackground(new Background(new BackgroundFill(Color.GRAY, null, null)));
		this.setSpacing(15);
		this.setPadding(new Insets(15));

		CreatePageButton createPageButton = new CreatePageButton();
		this.getChildren().add(createPageButton);
	}

	public void addPage() {
		// TODO: FILL CODE HERE
		PageButton pageButton = new PageButton(pageButtons.size());
		pageButtons.add(pageButton);
		this.getChildren().add(pageButtons.size()-1, pageButton);
		DisplayPane dp = RootPane.getDisplayPane();
		dp.addTodoList();
		setCurrentPage(pageButtons.size() - 1);
	}

	public int getCurrentPage() {
		// TODO: FILL CODE HERE
		return currentPage;
	}

	public void setCurrentPage(int pageNumber) {
		// TODO: FILL CODE HERE
		if (0 <= pageNumber && pageNumber < pageButtons.size()) {
			pageButtons.get(currentPage).setActive(false);
			currentPage = pageNumber;
			pageButtons.get(currentPage).setActive(true);
			DisplayPane dp = RootPane.getDisplayPane();
			dp.setActiveTodoList(pageNumber);
		}
	}
}
