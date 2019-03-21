package TalkBoxConfig;


import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class ButtonGui{
	
	

	
	private  ArrayList<CustomButton> buttonList;


	
	public ButtonGui() {
		
		 this.buttonList= new ArrayList<CustomButton>();
		 
		   String defaultName = "Sample Sound";
	    	  
    	   this.buttonList.add( new CustomButton(defaultName));
		
	}
	


	
	public void setHorizontal(int counter) {
		
		 GridPane.setHgrow(this.buttonList.get(counter), Priority.ALWAYS);
	}
	

	
	
	public void setVertical(int counter) {
		
	 GridPane.setVgrow(this.buttonList.get(counter), Priority.ALWAYS);
		
	}
	
	
	
	
	
	  public void addButton(GridPane btnGrid) throws IllegalArgumentException {
		  
		  try {
			
			  
			 
			 
			   
			 			 
			 int indexCounter = 0;
			   
			 this.buttonList.get(indexCounter).setMinSize(75, 75);
			 this.setHorizontal(indexCounter); 
			 this.setVertical(indexCounter);
			 btnGrid.setVgap(5);
			 this.buttonList.get(indexCounter).setColumn(0);
			 this.buttonList.get(indexCounter).setRow(0);
			 btnGrid.add(this.buttonList.get(0), 0, 0);
			 
			
			 
			 
		
//			 for(int j = 0; j <= Math.ceil(numButtons/5);j++) {
//				
//				 if(count >= 5) {
//				
//					 for(int k = 0; k < 5; k++) {
//						 
//						 this.buttonList.get(indexCounter).setMinSize(75, 75);
//						 this.setHorizontal(indexCounter); 
//						 this.setVertical(indexCounter);
//						 btnGrid.setVgap(5);
//						 this.buttonList.get(indexCounter).setColumn(k);
//						 this.buttonList.get(indexCounter).setRow(j);
//						 btnGrid.add(this.buttonList.get(indexCounter), k, j);
//						 indexCounter++;
//						 count--;}}
//				 else {
//					 for(int h = 0; h < count; h++) {
//						 
//						 this.buttonList.get(indexCounter).setMinSize(75, 75);
//						 this.setHorizontal(indexCounter); 
//						 this.setVertical(indexCounter);
//						 this.buttonList.get(indexCounter).setColumn(h);
//						 this.buttonList.get(indexCounter).setRow(j);
//						 btnGrid.add(this.buttonList.get(indexCounter), h, j);
//						 btnGrid.setVgap(5);
//						 indexCounter++; }
//					 }
//				 }
			 }
		  catch(IllegalArgumentException io) {
			  
			 System.out.println("Wrong input");
			  
		  }
		  }
	  
	  
	  
	  
	  
	  public void switchButtonAdder(int n,GridPane sp) throws IllegalArgumentException {
		  try {
			
			  
			  sp.getChildren().clear();
			  
			  
			
			 int indexCounter = 0;
			   int count = n;
			 for(int j = 0; j <= Math.ceil(n/5);j++) {
				 if(count >= 5 ) {
					 for(int k = 0; k < 5; k++) {
						 
					
						 this.buttonList.get(indexCounter).setMinSize(75, 75);
						 this.setHorizontal(indexCounter); 
						 this.setVertical(indexCounter);
						 sp.setVgap(5);
						 this.buttonList.get(indexCounter).setColumn(k);
						 this.buttonList.get(indexCounter).setRow(j);
						 sp.add(this.buttonList.get(indexCounter), k, j);
						 indexCounter++;
						 count--;}}
				 else {
					 for(int h = 0; h < count; h++) {
						 
						
						 this.buttonList.get(indexCounter).setMinSize(75, 75);
						 this.setHorizontal(indexCounter); 
						 this.setVertical(indexCounter);
						 this.buttonList.get(indexCounter).setColumn(h);
						 this.buttonList.get(indexCounter).setRow(j);
						 sp.add(this.buttonList.get(indexCounter), h, j);
						 sp.setVgap(5);
						 indexCounter++; }}}}
		  catch(IllegalArgumentException io) {
			 System.out.println("Wrong input");
			  
		  }
		  }
	  
	  
 
	  public ArrayList<CustomButton> getArray() {
		 
		  return this.buttonList;
		 
	  }
  
  
  
	public CustomButton getFirstSound(int position) {

		


				CustomButton button = this.buttonList.get(position-1);
				button.setOnAction(e -> {
					
					
					System.out.println("This is the first one" +button.getString());
					button.setPosition(position-1);
					System.out.println(button.getPosition());
					
				});
				
			return button;
				
			}
		
	
	public CustomButton getSecondSound(int position) {
	
	
		
			
				CustomButton button = this.buttonList.get(position-1);
				button.setOnAction(e -> {

					
					System.out.println("This is the second one" + button.getString());
					button.setPosition(position-1);
					System.out.println(button.getPosition());
					
				});
				  
			return button;	
				
			}

	   
	
	
	public void Switch(GridPane sp, int switch1, int switch2) {
		
		int size = this.buttonList.size();
		CustomButton button1 = this.getFirstSound(switch1);
		CustomButton button2 = this.getSecondSound(switch2);
		System.out.println(button1.getString());
		System.out.println(button2.getString());
		this.buttonList.set(switch2-1, button1);
		this.buttonList.set(switch1-1, button2);
		switchButtonAdder(size, sp);
	
	
		}
	
	
	
	
	
	
	





}

