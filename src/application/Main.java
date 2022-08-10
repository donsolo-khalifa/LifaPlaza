package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	//Sir you will have to change the file path to your computer's file path for the file
	static File file = new File("C:\\Users\\welcome\\eclipse-workspace\\pleasework\\src\\application\\filedata.txt");
	static Scanner inputREad;
    static ArrayList<Object> lines = new ArrayList<>();
    static String[] cats1;
	static String[] cats2;
	static String[] cats3;
	static Movie[] movies =new Movie[3];
	static Spa[] spa=new Spa[3] ;
	static Gym[] gym =new Gym[3];
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			//Sir you will have to change the file path to your computer's file path for the icon
			primaryStage.getIcons().add(new Image("C:\\Users\\welcome\\eclipse-workspace\\pleasework\\src\\application\\plaza logo.jpeg"));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			inputREad= new Scanner(file);
			String line;

			while(inputREad.hasNextLine()) {
				line=inputREad.nextLine();
				
				lines.add(line);
				}
			
			cats1=(lines.get(0).toString().split(","));
			cats2=(lines.get(1).toString().split(","));
			cats3=(lines.get(2).toString().split(","));
			for(int i=0;i<lines.size();i++) {
				int categoryNameIndex=2*i;
				int categoryPriceIndex=(2*i)+1;
				movies[i]=new Movie(cats1[categoryNameIndex], Integer.parseInt(cats1[categoryPriceIndex]));
				spa[i]=new Spa(cats2[categoryNameIndex], Integer.parseInt(cats2[categoryPriceIndex]));
				gym[i]=new Gym(cats3[categoryNameIndex], Integer.parseInt(cats3[categoryPriceIndex]));
				inputREad.close();

				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("The file You Inputed does not exist");
			System.exit(0);

		}
		launch(args);
	}
}
