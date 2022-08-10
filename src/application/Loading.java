package application;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class Loading {
private Pane view;
public Pane getPage(String filename) {
try {
	URL fileUrl= Main.class.getResource(filename);
	if (fileUrl==null) {
		throw new java.io.FileNotFoundException("dosent exist");
	}
	new FXMLLoader();
	view = FXMLLoader.load(fileUrl);
} catch (Exception e) {
	// TODO Auto-generated catch block
System.err.println(filename+" does not exist");
}
	
	return view;
	
}
}
