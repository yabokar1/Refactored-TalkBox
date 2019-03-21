package TalkBoxConfig;

import javafx.scene.control.Button;

public class CustomButton extends Button {
	
	 
	  private int column;
	  private int row;
	  private int position;
	
	
	public CustomButton(String name) {
		      super(name);
		      this.column=0;
		      this.row=0;
		
		}
	
	
	
	public String getString() {
		
		
		return this.getText();
		
	}
	
	public void setString(String name) {
		
		this.setText(name);
		
	}
	
    
	public void setColumn(int column) {
		
		this.column=column;
	}
	
	public void setRow(int row) {
		
		this.row = row;
	}
	
	public int getColumn() {
		
		return this.column;
	}
	
	public int getRow() {
		
		return this.row;
	}
	public void setPosition(int position) {
		
		this.position = position;
	}
	
	public int getPosition() {
		
		return this.position;
	}
}
