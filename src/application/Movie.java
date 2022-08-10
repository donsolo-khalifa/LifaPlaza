package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Movie extends General {

	@FXML
	private VBox action;

	@FXML
	private Label actionName;

	@FXML
	private Label actionPrice;

	@FXML
	private VBox comedy;

	@FXML
	private Label comedyName;

	@FXML
	private Label comedyPrice;

	@FXML
	private VBox horror;

	@FXML
	private Label horrorName;

	@FXML
	private Label horrorPrice;

	public void initialize() {
		horrorName.setText(Main.movies[0].getName());
		horrorPrice.setText("D" + Main.movies[0].getPrice());
		comedyName.setText(Main.movies[1].getName());
		comedyPrice.setText("D" + Main.movies[1].getPrice());
		actionName.setText(Main.movies[2].getName());
		actionPrice.setText("D" + Main.movies[2].getPrice());
	}

	@FXML
	public void onclick(MouseEvent e) {
		String id = ((Node) e.getSource()).getId().toString();
		System.out.println(id);

		switch (id) {
		case "horror": {
			horror.setStyle("-fx-border-color: black");
			General.total += Main.movies[0].getPrice();
			General.selections.add(Main.movies[0].getName());
			General.selections.add(Main.movies[0].getPrice());
			System.out.println("D" + Main.movies[0].getPrice());
			break;
		}
		case "comedy": {
			comedy.setStyle("-fx-border-color: black");

			General.total += Main.movies[1].getPrice();
			General.selections.add(Main.movies[1].getName());
			General.selections.add(Main.movies[1].getPrice());
			System.out.println("D" + Main.movies[1].getPrice());
			break;

		}
		case "action": {
			action.setStyle("-fx-border-color: black");

			General.total += Main.movies[2].getPrice();
			General.selections.add(Main.movies[2].getName());
			General.selections.add(Main.movies[2].getPrice());
			System.out.println("D" + Main.movies[2].getPrice());
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + id);
		}
	}

	Main t = new Main();

	public Movie(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	public Movie() {

	}

}
