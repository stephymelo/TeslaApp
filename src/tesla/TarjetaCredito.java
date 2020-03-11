package tesla;

import processing.core.PApplet;
import processing.core.PImage;

public class TarjetaCredito {

	private PApplet app;
    private PImage bg;
    private String cardNumber, mm, yy, cvc, street,state,city,zipcode;
    public TarjetaCredito(String cardNumber,String mm ,String yy,String cvc,String street,String state,String city,String zipcode) {
    	this.cardNumber=cardNumber;
		this.mm=mm;
		this.yy=yy;
		this.cvc=cvc;
		this.street=street;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
    }
	
	
	public TarjetaCredito(PApplet app,ModelS modelS) {
		this.app=app;
		
		bg=app.loadImage("assets/orderBgFinal.png");
		
		
	}
	
	public TarjetaCredito(PApplet app, ModelTres modelTres) {
		this.app=app;
	    bg=app.loadImage("assets/orderBgFinal.png");
		
	}
	
	
	public TarjetaCredito(PApplet app, ModelY modelY) {
		this.app=app;
	    bg=app.loadImage("assets/orderBgFinal.png");
		
	}
	
	public TarjetaCredito(PApplet app, ModelX modelX) {
		this.app=app;
	    bg=app.loadImage("assets/orderBgFinal.png");
		
	}
	
	
	

	public void drawScreenTarjeta() {
     	app.image(bg,0,0);
		
	}


	public PImage getBg() {
		return bg;
	}


	public void setBg(PImage bg) {
		this.bg = bg;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public String getMm() {
		return mm;
	}


	public void setMm(String mm) {
		this.mm = mm;
	}


	public String getYy() {
		return yy;
	}


	public void setYy(String yy) {
		this.yy = yy;
	}


	public String getCvc() {
		return cvc;
	}


	public void setCvc(String cvc) {
		this.cvc = cvc;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
}
	