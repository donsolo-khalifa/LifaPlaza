package application;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class General {
	
	@FXML
	private BorderPane changer;

	@FXML
	private ImageView gym;

	@FXML
	private ImageView movie;

	@FXML
	private ImageView recipt;

	@FXML
	private ImageView spa;
	@FXML
	private ImageView receiptfx;
	
	static ArrayList<Object> selections = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int total = 0;

	private String name;
	private int price;
	static int service;

	

	public General() {

	}

	public General(String name, int price) {
		this.name = name;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@FXML
	public void onclick(MouseEvent e) {

		String id = ((Node) e.getSource()).getId().toString();
		System.out.println(id);
		if (id.equalsIgnoreCase("movie")) {
			Loading object = new Loading();
			Pane view = object.getPage("MovieFx.fxml");
			changer.setCenter(view);

		} else if (id.equalsIgnoreCase("gym")) {
			Loading object = new Loading();
			Pane view = object.getPage("Gym.fxml");
			changer.setCenter(view);

		} else if (id.equalsIgnoreCase("spa")) {
			Loading object = new Loading();
			Pane view = object.getPage("Spa.fxml");
			changer.setCenter(view);

		} else {
			Loading object = new Loading();
			Pane view = object.getPage("Reciept.fxml");
			changer.setCenter(view);
			
			
			
		}

	}

}
