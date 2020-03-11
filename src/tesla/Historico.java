package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class Historico {

	private PApplet app;
	private PImage bg;
	private String model,price,street;
	
	
	public Historico(String price, String street, String model ) {
		
		
		this.model=model;
		this.price=price;
		this.street=street;
		
	}
	
	

	public Historico(PApplet app) {
		this.app=app;
		this.bg=app.loadImage("assets/orderBg.png");
		
	}
	
	
	
	
	
	
	public void drawScreenHistorico() {
		app.image(bg, 0, 0);
		
		
	}








	public PImage getBg() {
		return bg;
	}








	public void setBg(PImage bg) {
		this.bg = bg;
	}



	


	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}















	
	
	
}
