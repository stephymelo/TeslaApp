package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class ModelS extends Tesla {
	
	
	private PImage modelS,bg;
	private int range;
	private int seats;
	private int safety;
	private String price;
	private String description;
	private String model;
	

	public ModelS(PApplet app,int posX,int posY) {
		super(app,posX,posY);
		// TODO Auto-generated constructor stub
		
		this.modelS=app.loadImage("assets/modelS.png");
		this.bg=app.loadImage("assets/modelMockup.png");
		this.description="Best performance in all weather conditions";
		this.seats=5;
		this.range=322;
		this.safety=5;
		this.price="$74,490";
		this.posX=posX;
		this.posY=posY;
		this.model="model S";
	}
	
	
	
	
	
	
	
	
	public void drawModelCar() {
		
//		app.image(bg,0,0);
		
		app.image(modelS,posX,posY,450,300);
		//informacion
		
		
		
	}








	public int getRange() {
		return range;
	}








	public void setRange(int range) {
		this.range = range;
	}








	public String getModel() {
		return model;
	}








	public void setModel(String model) {
		this.model = model;
	}








	public PImage getModelS() {
		return modelS;
	}








	public void setModelS(PImage modelS) {
		this.modelS = modelS;
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
