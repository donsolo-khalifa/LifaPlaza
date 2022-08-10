package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
public class Spa extends General{

    @FXML
    private Label cat1name;

    @FXML
    private Label cat1price;

    @FXML
    private Label cat2name;

    @FXML
    private Label cat2price;

    @FXML
    private Label cat3name;

    @FXML
    private Label cat3price;

    @FXML
    private VBox category1;

    @FXML
    private VBox category2;

    @FXML
    private VBox category3;
    
     static int selection;
    
    public void initialize() {
		cat1name.setText(Main.spa[0].getName());
		cat1price.setText("D" + Main.spa[0].getPrice());
		cat2name.setText(Main.spa[1].getName());
		cat2price.setText("D" + Main.spa[1].getPrice());
		cat3name.setText(Main.spa[2].getName());
		cat3price.setText("D" + Main.spa[2].getPrice());
	}
	 @FXML
	 public void onclick(MouseEvent e) {
	  String id=((Node) e.getSource()).getId().toString();
	  switch (id) {
		case "category1": {
			category1.setStyle("-fx-border-color: black");

			General.total += Main.spa[0].getPrice();
			General.selections.add(Main.spa[0].getName());
			General.selections.add(Main.spa[0].getPrice());
			System.out.println("D" + Main.spa[0].getPrice());
			break;
		}
		case "category2": {
			category2.setStyle("-fx-border-color: black");

			General.total += Main.spa[1].getPrice();
			General.selections.add(Main.spa[1].getName());
			General.selections.add(Main.spa[1].getPrice());
			System.out.println("D" + Main.spa[1].getPrice());
			break;

		}
		case "category3": {
			category3.setStyle("-fx-border-color: black");

			General.total += Main.spa[2].getPrice();
			General.selections.add(Main.spa[2].getName());
			General.selections.add(Main.spa[2].getPrice());
			System.out.println("D" + Main.spa[2].getPrice());
			break;

		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + id);
		}
	 }
	 
	Main t= new Main();
	public Spa(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	public Spa() {
		
	}
	/*
	 * static void displaySpa() { try { // TODO Auto-generated method stub
	 * System.out.println("\nPlease select an option"); for (int i = 0; i <
	 * Main.spa.length; i++) { int j = i + 1; System.out.println("\t" + j + " " +
	 * Main.spa[i].getName()); }
	 * System.out.println("\nType any other key to go back");
	 * 
	 * String compare = null; compare.equalsIgnoreCase(select); int
	 * choose=selection; switch (choose) { case 1: { General.total +=
	 * Main.spa[0].getPrice(); General.selections.add(Main.spa[0].getName());
	 * General.selections.add(Main.spa[0].getPrice()); System.out.println("D" +
	 * Main.spa[0].getPrice()); System.out.println(General.total);
	 * displayServices(); break; } case 2: {
	 * General.selections.add(Main.spa[1].getName());
	 * General.selections.add(Main.spa[1].getPrice()); General.total +=
	 * Main.spa[1].getPrice(); System.out.println("D" + Main.spa[1].getPrice());
	 * System.out.println(General.total);
	 * 
	 * displayServices(); break;
	 * 
	 * } case 3: { General.selections.add(Main.spa[2].getName());
	 * General.selections.add(Main.spa[2].getPrice()); General.total +=
	 * Main.spa[2].getPrice(); System.out.println("D" + Main.spa[2].getPrice());
	 * System.out.println(General.total);
	 * 
	 * displayServices(); break;
	 * 
	 * } default: displayServices(); break; } } catch (InputMismatchException e) {
	 * // TODO Auto-generated catch block
	 * System.err.println("You can only select numbers"); General.scan.nextLine();
	 * displaySpa(); }
	 * 
	 * }
	 */
}
