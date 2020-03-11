package tesla;

import processing.core.PApplet;
import processing.core.PImage;
abstract class Tesla extends Carro {
	
	
	protected int posX;
    protected int posY;
    protected int seats;
    protected int range;
    protected int safety;
    protected String description;
   
	
	

	public Tesla(PApplet app,int posX,int posY) {
		super(app);
		this.description=description;
		this.seats=seats;
		this.range=range;
		this.safety=safety;
		
	}
	
	
	
	
	
	
	
	






	public int getPosX() {
		return posX;
	}







	public void setPosX(int posX) {
		this.posX = posX;
	}







	public int getPosY() {
		return posY;
	}







	public void setPosY(int posY) {
		this.posY = posY;
	}







	public int getSeats() {
		return seats;
	}







	public void setSeats(int seats) {
		this.seats = seats;
	}







	public int getRange() {
		return range;
	}







	public void setRange(int range) {
		this.range = range;
	}







	public String getDescription() {
		return description;
	}







	public void setDescription(String description) {
		this.description = description;
	}







	
	

}

