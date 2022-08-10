package application;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Gym extends General {
	 @FXML
	    private VBox boxing;

	    @FXML
	    private Label boxingName;

	    @FXML
	    private Label boxingPrice;

	    @FXML
	    private VBox regular;

	    @FXML
	    private Label regularName;

	    @FXML
	    private Label regularPrice;

	    @FXML
	    private VBox trainer;

	    @FXML
	    private Label trainerName;

	    @FXML
	    private Label trainerPrice;
	    

	    public void initialize() {
			regularName.setText(Main.gym[0].getName());
			regularPrice.setText("D" + Main.gym[0].getPrice());
			trainerName.setText(Main.gym[1].getName());
			trainerPrice.setText("D" + Main.gym[1].getPrice());
			boxingName.setText(Main.gym[2].getName());
			boxingPrice.setText("D" + Main.gym[2].getPrice());
		}
		 @FXML
		 public void onclick(MouseEvent e) {
		  String id=((Node) e.getSource()).getId().toString();
		  System.out.println(id);
		  switch (id) {
			case "regular": {
				regular.setStyle("-fx-border-color: black");

				General.total += Main.gym[0].getPrice();
				General.selections.add(Main.gym[0].getName());
				General.selections.add(Main.gym[0].getPrice());
				System.out.println("D" + Main.gym[0].getPrice());
				break;
			}
			case "trainer": {
				trainer.setStyle("-fx-border-color: black");

				General.total += Main.gym[1].getPrice();
				General.selections.add(Main.gym[1].getName());
				General.selections.add(Main.gym[1].getPrice());
				System.out.println("D" + Main.gym[1].getPrice());
				break;

			}
			case "boxing": {
				boxing.setStyle("-fx-border-color: black");

				General.total += Main.gym[2].getPrice();
				General.selections.add(Main.gym[2].getName());
				General.selections.add(Main.gym[2].getPrice());
				System.out.println("D" + Main.gym[2].getPrice());
				break;

			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + id);
			}
			 }
		 
	Main t= new Main();
	
	
	public Gym(String name, int price) {
		super(name, price);
		
		
		// TODO Auto-generated constructor stub
		
	}
	 public Gym() {
		
	}
	/*
	 * static void displayGym() { General g = new General(); try { // TODO
	 * Auto-generated method stub System.out.println("\nPlease select an option");
	 * for (int i = 0; i < Main.gym.length; i++) { int j = i + 1;
	 * System.out.println("\t" + j + " " + Main.gym[i].getName()); }
	 * System.out.println("\nType any other key to go back");
	 * 
	 * int selection = General.scan.nextInt(); switch (selection) { case 1: {
	 * General.total += Main.gym[0].getPrice();
	 * General.selections.add(Main.gym[0].getName());
	 * General.selections.add(Main.gym[0].getPrice()); System.out.println("D" +
	 * Main.gym[0].getPrice()); displayServices(); break; } case 2: {
	 * General.selections.add(Main.gym[1].getName());
	 * General.selections.add(Main.gym[1].getPrice()); General.total +=
	 * Main.gym[1].getPrice(); System.out.println("D" + Main.gym[1].getPrice());
	 * 
	 * displayServices(); break;
	 * 
	 * } case 3: { General.selections.add(Main.gym[2].getName());
	 * General.selections.add(Main.gym[2].getPrice()); General.total +=
	 * Main.gym[2].getPrice(); System.out.println("D" + Main.gym[2].getPrice());
	 * 
	 * displayServices(); break;
	 * 
	 * } default: displayServices(); break; } } catch (InputMismatchException e) {
	 * // TODO Auto-generated catch block
	 * System.err.println("You can only select numbers"); General.scan.nextLine();
	 * displayGym(); } }
	 */
}
