package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelX extends Tesla {
	
	private PImage modelX;
	private String description;
	private int range;
	private int seats;
	private int safety;
	private String price;
	private String model;
	

	public ModelX(PApplet app,int posX, int posY) {
		super(app,posX, posY);
		
		this.modelX=app.loadImage("assets/modelX.png");

		
		this.posX=posX;
		this.posY=posY;
		this.description="Safest and best storage in SUV";
		this.seats=7;
		this.range=594;
		this.price="$79,690";
		this.safety=5;
		this.model="Model X";
	}
	
	
	

	
	public void drawModelCar() {
//		app.image(bg,0,0);
		
		app.image(modelX,posX,posY,330,180);
		
	}


	
	
	
	
	public String getModel() {
		return model;
	}





	public void setModel(String model) {
		this.model = model;
	}





	public PImage getModelX() {
		return modelX;
	}





	public void setModelX(PImage modelX) {
		this.modelX = modelX;
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


	public void setDescription(String info) {
		this.description = info;
	}
	public int getSeats() {
		return seats;
	}








	public void setSeats(int seats) {
		this.seats = seats;
	}








	public int getSafety() {
		return safety;
	}








	public void setSafety(int safety) {
		this.safety = safety;
	}





	public String getPrice() {
		return price;
	}





	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	

}
