package application;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Reciept extends General {
	public Reciept() {
		super();
		// TODO Auto-generated constructor stub
	}
	@FXML
	private Label recieptLabel;
	 public Label getRecieptLabel() {
		return recieptLabel;
	}
	public void setRecieptLabel(Label recieptLabel) {
		this.recieptLabel = recieptLabel;
	}
	public void initialize() {
		Date d = new Date();
		String test="";
		String[] date= d.toString().split(":");
		for (int i = 0; i < date.length; i++) {
			test+=date[i];
		}
		String fileName=test+".txt";
		System.out.println(fileName);
		PrintWriter pwriter=null;
		try {
			
			if (General.selections.isEmpty() == false) {
				pwriter = new PrintWriter(fileName, "UTF-8");

				String list="\n";
				for(int i=0;i<selections.size();i++) {
					
					list+=General.selections.get(i)+"\n";
				}
				recieptLabel.setText("You have selected the following services" + " " +list
						+ "\nYour total is: D" + General.total+"\n"+d.toString());
				
				System.out.println("You have selected the following services" + " " + General.selections
						+ "\nYour total is: D" + General.total);
				
					pwriter.println("You have selected the following services" + " " +list
							+ "\nYour total is: D" + General.total+"\n\tThanks for visiting LIFA PLAZA\n"+d.toString());
					pwriter.close();
					System.out.println("written");
					General.selections.clear();
					General.total=0;

			} else {
				recieptLabel.setText("You have not selected any service");
				System.out.println("You have not selected any service");

			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File does not exist");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.err.println("Unsupported file format");
		}
		
		
		
//		FileWriter writer = null;
//		try {
//			writer = new FileWriter(
//					"C:\\Users\\welcome\\eclipse-workspace\\pleasework\\src\\application\\reciept.txt");
//
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			System.err.println("The receipt file is not found");
//
//		}
//
//		if (General.selections.isEmpty() == false) {
//			String list="\n";
//			for(int i=0;i<selections.size();i++) {
//				
//				list+=General.selections.get(i)+"\n";
//			}
//			recieptLabel.setText("You have selected the following services" + " " +list
//					+ "\nYour total is: D" + General.total);
//			
//			System.out.println("You have selected the following services" + " " + General.selections
//					+ "\nYour total is: D" + General.total);
//			try {
//				writer.write(General.selections.toString() + "\nYour total is: D" + General.total);
//				writer.close();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//
//		} else {
//			recieptLabel.setText("You have not selected any service");
//			System.out.println("You have not selected any service");
//
//		}
	 }
	
}
