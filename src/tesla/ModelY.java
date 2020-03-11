package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelY extends Tesla {
	
	private PImage modelY;
	private String description;	
	private int range;
	private int seats;
	private int safety;
	private String price;
	private String model;

	public ModelY(PApplet app,int posX,int posY) {
		super(app,posX,posY);
		
		this.modelY=app.loadImage("assets/modelY.png");
		
		this.description="Maximum versatility and all-wheel drive ";
		this.posX=posX;
		this.posY=posY;
		this.seats=7;
		this.range=220;
		this.price="$48,690";
		this.safety=4;
		this.model="Model Y";
	}

	
	
	
	
	

	public void drawModelCar() {
//		app.image(bg,0,0);
		app.image(modelY,posX,posY,300,180);
		
	}

	
	
	
	

	public String getModel() {
		return model;
	}







	public void setModel(String model) {
		this.model = model;
	}







	public PImage getModelY() {
		return modelY;
	}







	public void setModelY(PImage modelY) {
		this.modelY = modelY;
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
