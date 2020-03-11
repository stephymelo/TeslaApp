package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelTres extends Tesla {
	
	private PImage modelThree,bg;
	private String description;
	private int range;
	private int seats;
	private int safety;
    private String price;
	private String model;
	public ModelTres(PApplet app,int posX,int posY) {
		super(app,posX, posY);
		
		this.modelThree=app.loadImage("assets/modelThreeC.png");
		this.bg=app.loadImage("assets/modelThreeMockup.png");
		this.posX=posX;
		this.posY=posY;
		this.description="Unparelled acceleration and performace";
		this.seats=5;
		this.range=390;
		this.safety=5;
		this.price="$35,690";
		this.model="Model Tres";
	}
	
	
	
	

	public void drawModelCar() {
		
		
//		app.image(bg,0,0);
		app.image(modelThree,posX,posY,325,220);
		
		
		
	}
	
	


	public String getModel() {
		return model;
	}





	public void setModel(String model) {
		this.model = model;
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
