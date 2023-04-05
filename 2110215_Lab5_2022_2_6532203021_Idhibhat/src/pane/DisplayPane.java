package pane;

import component.TodoItem;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class DisplayPane extends VBox {
	private ArrayList<ArrayList<TodoItem>> todoLists = new ArrayList<ArrayList<TodoItem>>();

	public DisplayPane() {
		// TODO: FILL CODE HERE
		this.setStyle("-fx-background-color: #ffffff");
		this.setPadding(new Insets(20));
		this.setSpacing(10);
	}

	public void addTodoList() {
		// TODO: FILL CODE HERE
		this.todoLists.add(new ArrayList<TodoItem>());
	}

	public void setActiveTodoList(int index) {
		// TODO: FILL CODE HERE
		if (0 <= index && index < this.todoLists.size()) {
			this.getChildren().clear();
			for (TodoItem item : this.todoLists.get(index)) {
				this.getChildren().add(item);
			}
		}
	}

	public void addTodoItem(TodoItem todoItem) {
		int currentPage = RootPane.getNavigationPane().getCurrentPage();
		this.todoLists.get(currentPage).add(todoItem);
		this.getChildren().add(todoItem);
	}

	public void removeTodoItem(TodoItem todoItem) {
		int currentPage = RootPane.getNavigationPane().getCurrentPage();
		this.todoLists.get(currentPage).remove(todoItem);
		this.getChildren().remove(todoItem);
	}
}
