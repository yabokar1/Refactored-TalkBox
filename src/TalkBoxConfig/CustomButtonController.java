package TalkBoxConfig;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class CustomButtonController {
	
	
	private CustomButton model;
	private GridPane view;
	private  ArrayList<CustomButton> buttonList;
	private int buttonCounter;
	private int customButtonColumn;
	private int cutomButtonRow;

	
	
	public CustomButtonController(GridPane view, CustomButton custombutton) {

		this.view = view;
		this.model = custombutton;
		this.buttonList = new ArrayList<CustomButton>();
		buttonCounter++;
	
		
	}

	
	public void addToButtonList() {
		
		
		this.buttonList.add(this.model);
		
	}



	
	public int columnCounter() {
		
		return customButtonColumn++;
		
	}
	
	public void setHorizontal() {
		
		 GridPane.setHgrow(this.model, Priority.ALWAYS);
	}
	
	public void setVertical() {
		
		 GridPane.setVgrow(this.model, Priority.ALWAYS);
			
		}
		
	

		
	
	  public void addButton() throws IllegalArgumentException {
		  
		  try {
			
			  
			 
			 
			   
			
			 this.model.setMinSize(75, 75);
			 this.setHorizontal(); 
			 this.setVertical();
			 this.view.setVgap(5);
			 buttonCounter++;
		
			 
			this.view.add(this.model, 0, 0);
			 System.out.println(this.view);
		  }
			 

		  catch(IllegalArgumentException io) {
			  
			 System.out.println("Wrong input");
			  
		  	}
		  }
	  
	  
	
	
	
	
	
	

}
