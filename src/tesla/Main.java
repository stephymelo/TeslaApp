package tesla;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.core.PSurfaceNone.AnimationThread;

public class Main extends PApplet {

	private TarjetaCredito tarModelS, tarModelTres, tarModelY, tarModelX;
	private Historico historico;
	private ModelS modelS;
	private ModelTres modelTres;
	private ModelX modelX;
	private ModelY modelY;

	

	private ControlP5 cp5;
	private String[] inputs;
	private String[] tarjetaCreditoInput;

	private String fullname, username, password, email, confirmEmail;
	private String zipcode, cardNumber, state, city, cvc, mm, yy,street;

	private ArrayList<User> listUsers;
	private ArrayList<TarjetaCredito> tarjetaDeCredito;
	private ArrayList<Historico> historicoCompra;

	private int pantalla;
	private int carModel;
	private int buyModel;

	private int posXMenu, posYMenu;
	private boolean zipcodeB, cardNumberB, stateB, cityB, cvcB, mmB, yyB,streetB;


	private boolean showMenu, emailAut, emailNoMatch, botonConti, compareButton, fullnameBoolean, usernameBoolean,
			passwordBoolean, emailBoolean, confirmEmailBoolean,logIn,yaRegistro,registroTarjetaB;

	// Pantallas
	PImage loginFoto, registrationFoto, mainPage, buyModelX, buyModelY, buyModelS, buyModelTres;
	
	PImage compareImage[];
	// botones
	PImage menu, signupBoton, compareBoton, compareBotonON, orderButton, backButton,seatIcon;
	PFont raleway, ralewayBold, teslaFont;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("tesla.Main");
	}

	public void settings() {
		size(375, 667);
	}

	public void setup() {
		PFont font = createFont("raleway", 16);
		listUsers = new ArrayList<User>();
		tarjetaDeCredito = new ArrayList<TarjetaCredito>();
		historicoCompra = new ArrayList<Historico>();


		////////// PANTALLA
		pantalla = 0;
		registroTarjetaB=true;
		yaRegistro=false;
		logIn=false;
       
		showMenu = false;
		emailAut = false;
		emailNoMatch = false;
		botonConti = false;
		compareButton = false;
		fullnameBoolean = true;
		usernameBoolean = true;
		passwordBoolean = true;
		emailBoolean = true;
		confirmEmailBoolean = true;
		stateB = true;
		yyB = true;
		mmB = true;
		cityB = true;
		zipcodeB = true;
		cardNumberB = true;
		cvcB = true;
		streetB = true;

		cp5 = new ControlP5(this);
		tarjetaCreditoInput = new String[8];
		tarjetaCreditoInput[0] = "cardNumber";
		tarjetaCreditoInput[1] = "mm";
		tarjetaCreditoInput[2] = "yy";
		tarjetaCreditoInput[3] = "cvc";
		tarjetaCreditoInput[4] = "street";
		tarjetaCreditoInput[5] = "state";
		tarjetaCreditoInput[6] = "city";
		tarjetaCreditoInput[7] = "zipcode";
		
		
		/////
		inputs = new String[5];
		inputs[0] = "fullname";
		inputs[1] = "username";
		inputs[2] = "password";
		inputs[3] = "email";
		inputs[4] = "confirmEmail";

		for (int i = 0; i < inputs.length; i++) {

			cp5.addTextfield(inputs[i]).setPosition(50, 200 + (i * 70)).setSize(200, 30).setAutoClear(true)
					.setColorValue(color(255)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
					.setColorActive(color(0, 0, 0, 1)).setColorForeground(color(0, 0, 0, 1)).getCaptionLabel().hide();

		}

		for (int i = 0; i < tarjetaCreditoInput.length; i++) {
//
//			cp5.addTextfield(tarjetaCreditoInput[i]).setPosition(50, 200 + (i * 70)).setSize(200, 30).setAutoClear(true)
//					.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
//					.setColorActive(color(0, 0, 0,1)).setColorForeground(color(255, 0, 0)).getCaptionLabel().hide();

		
			
			//card
			cp5.addTextfield(tarjetaCreditoInput[0]).setPosition(37, 275).setSize(260, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			//mm
			cp5.addTextfield(tarjetaCreditoInput[1]).setPosition( 37, 347 ).setSize(40, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			//yy
			cp5.addTextfield(tarjetaCreditoInput[2]).setPosition(130, 347 ).setSize(60, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			//cvc
			cp5.addTextfield(tarjetaCreditoInput[3]).setPosition( 255, 347).setSize(100, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			//street
			cp5.addTextfield(tarjetaCreditoInput[4]).setPosition(37, 450).setSize(300, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			//state
			cp5.addTextfield(tarjetaCreditoInput[5]).setPosition(37, 500).setSize(100, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			//city
			cp5.addTextfield(tarjetaCreditoInput[6]).setPosition(205, 500).setSize(120, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
	        //zipcode
			cp5.addTextfield(tarjetaCreditoInput[7]).setPosition(37, 540).setSize(100, 25).setAutoClear(true)
			.setColorValue(color(0)).setColorBackground(color(0, 0, 0, 1)).setFont(font)
			.setColorActive(color(0, 0, 0,1)).setColorForeground(color(0, 0, 0,1)).getCaptionLabel().hide();
			

		}
		


		textFont(font);

		// CAR MODELS
		modelS = new ModelS(this, -70, 130);

		modelTres = new ModelTres(this, 30, 140);

		modelY = new ModelY(this, 30, 150);

		modelX = new ModelX(this, 40, 150);

		tarModelS = new TarjetaCredito(this, modelS);
		tarModelTres = new TarjetaCredito(this, modelTres);
		tarModelY = new TarjetaCredito(this, modelY);
		tarModelX = new TarjetaCredito(this, modelX);

		historico = new Historico(this);
		
		//animacion
		
		compareImage = new PImage[59];
		for (int i = 0; i <59; i++) { 
		    compareImage[i] = loadImage("assets/gifimages/"+(i+1)+".png");

		}
//images
		loginFoto = loadImage("assets/loginBgNew.png");
		registrationFoto = loadImage("assets/registrationBg.png");
		mainPage = loadImage("assets/mainPage.png");
		menu = loadImage("assets/menu.png");
		signupBoton = loadImage("assets/signUp.png");
		orderButton = loadImage("assets/orderNow.png");
		compareBoton = loadImage("assets/compareButton.png");
		compareBotonON = loadImage("assets/compareButtonON.png");
		backButton = loadImage("assets/backIcon.png");
		seatIcon = loadImage("assets/chair.png");

		// buy images
		buyModelX = loadImage("assets/buyModelX.png");
		buyModelY = loadImage("assets/buyModelY.png");
		buyModelS = loadImage("assets/buyModelS.png");
		buyModelTres = loadImage("assets/buyModelThree.png");

		raleway = createFont("assets/Raleway-Regular.ttf", 14);
		ralewayBold = createFont("assets/Raleway-SemiBold.ttf", 30);
		teslaFont = createFont("assets/TESLA.ttf", 16);

		buyModel = 0;
		carModel = 0;
		posXMenu = 50;
		posYMenu = 20;

	}

	public void draw() {
		background(22, 22, 38);
		if(pantalla==0) {
			username = cp5.get(Textfield.class, "username").setVisible(false).getText();
			fullname = cp5.get(Textfield.class, "fullname").setVisible(false).getText();
			password = cp5.get(Textfield.class, "password").setVisible(false).getText();
			email = cp5.get(Textfield.class, "email").setVisible(false).getText();
			confirmEmail = cp5.get(Textfield.class, "confirmEmail").setVisible(false).getText();
			
		}
		
//		if (pantalla == 4) {
//		
//			zipcode = cp5.get(Textfield.class, "zipcode").setVisible(true).getText();
//			street = cp5.get(Textfield.class, "street").setVisible(true).getText();
//			cvc = cp5.get(Textfield.class, "cvc").setVisible(true).getText();
//			city = cp5.get(Textfield.class, "city").setVisible(true).getText();
//			state = cp5.get(Textfield.class, "state").setVisible(true).getText();
//			cardNumber = cp5.get(Textfield.class, "cardNumber").setVisible(true).getText();
//			mm = cp5.get(Textfield.class, "mm").setVisible(true).getText();
//			yy = cp5.get(Textfield.class, "yy").setVisible(true).getText();
//
//		}
		
		


		switch (pantalla) {

		case 0:
			drawLogin();

			break;

		case 1:
			drawRegistration();

			break;
//Main
		case 2:
			drawMainPage();

			if (showMenu == true) {

				drawMenu();

				for (User listUser : listUsers) {
					fill(95, 95, 95);
					textSize(24);
					text(listUser.getUsername(), 36, 60);
				}
			}

			break;
//Cars
		case 3:

			textFont(teslaFont);
			textSize(14);
			text("TESLA", 150, 14);
			image(orderButton, 70, 570);
			drawCar();

			break;
//Tarjeta de Credito
		case 4:
			if (pantalla == 4) {
				fill(0);

			}
			textSize(16);

			switch (carModel) {

			case 0:

				tarModelS.drawScreenTarjeta();
				text("Model S", 240, 123);
				text(modelS.getPrice(), 240, 158);

				break;
			case 1:
				tarModelTres.drawScreenTarjeta();
				text("Model 3", 240, 123);
				text(modelTres.getPrice(), 240, 158);

				break;
			case 2:
				tarModelY.drawScreenTarjeta();
				text("Model Y", 240, 123);
				text(modelY.getPrice(), 240, 158);

				break;
			case 3:
				tarModelX.drawScreenTarjeta();
				text("Model X", 240, 123);
				text(modelX.getPrice(), 240, 158);

				break;

			}
			textSize(14);
			if (cardNumberB) {
				text("Card Number", 60, 288);
			}
			if (mmB) {
				text("MM", 40, 363);
			}
			if (yyB) {
				text("YY", 130, 363);
			}
			if (cvcB) {
				text("CVC", 255, 363);
			}
			if (streetB) {
				text("Street Address", 38, 465);
			}
			if (zipcodeB) {
				text("Zip code", 38, 555);
			}
			if (cityB) {
				text("City", 210, 515);
			}
			if (stateB) {
				text("State", 38, 515);

			}


			break;
//pagoBien
		case 5:
			
			switch (buyModel) {
			case 0:
				image(buyModelS, 0, 0);

				break;
			case 1:
				image(buyModelTres, 0, 0);

				break;
			case 2:
				image(buyModelY, 0, 0);

				break;
			case 3:
				image(buyModelX, 0, 0);
				
				break;
				
			}

			break;
//History
		case 6:
			historico.drawScreenHistorico();
			
         if(historicoCompra.size()>0) {
        	 int i = 0;
        	 for (Historico historico : historicoCompra) {
        		 for (TarjetaCredito tarjetica : tarjetaDeCredito) {
 				textSize(16);
 				
 				fill(0);
 				text(""+tarjetica.getStreet(), 60, (i*150)+150);
 				text(""+historico.getModel(),60,(i*150)+130);
 				text(""+historico.getPrice(),200,(i*150)+130);
 			    
 				stroke(255,110,97);
 				noFill();
 				
 				rect(20,(i*150)+100,300,100);
 				i++;
 			} 
         }
         }

			
			
			
			
			
			break;
		}
	}

	////////////////////

	public void drawMenu() {

		image(menu, 0, 0);


	}

	public void drawLogin() {
		image(loginFoto, 0, 0);
		fill(255);
		textFont(raleway);
		text("New User", 150, 600);

	}

	public void drawRegistration() {
		image(registrationFoto, 0, 0);
		image(signupBoton, 220, 600);
		fill(255);
		textFont(raleway);
		textSize(16);
		if (fullnameBoolean) {
			text("Full name", 50, 220);
		}
		if (usernameBoolean) {
			text("Username", 50, 288);
		}
		if (passwordBoolean) {
			text("Password", 50, 353);
		}
		if (emailBoolean) {
			text("Email", 50, 425);
		}
		if (confirmEmailBoolean) {
			text("Confirm Email", 50, 490);
		}

		if (emailAut == true) {
			text("Email Autheticated", 100, 550);
			botonConti = true;
		}
		if (emailNoMatch == true) {
			text("Email does not match", 100, 550);
		}

	}

	public void drawMainPage() {
		image(mainPage, 0, 0);

	}

	public void drawCar() {
		fill(255);

		image(backButton, 20, 30);
		
		

		if (compareButton == false) {
			image(compareBoton, 270, 340);
			stroke(255);
			strokeWeight(2);
			line(240, 430, 240, 500);
			line(130, 430, 130, 500);
			image(seatIcon,190,480,20,20);

		}else {
			
			image(compareBotonON, 270, 340);
			textFont(raleway);
			
         	fill(255);
			
			
//			System.out.println(frameCount % 59);
			image(compareImage[frameCount % 59],0,400);
			if(frameCount==59) {
				image(compareImage[59],0,400);
			}
			text("Battery Range",50,450);
			text("Display",50,530);
			text("Cargo",50,600);
			text("Tesla",250,415);
			text("BrandX",300,415);
			noStroke();
			fill(255,110,97);
			rect(250,425,30,10);
			fill(110,201,201);
			rect(300,425,30,10);
			
		}

		switch (carModel) {
		case 0:
			fill(255);
			textFont(raleway);
			textSize(18);
			text("Model S", 150, 130);
			textSize(16);

			if (compareButton == false && carModel == 0) {
				
				text(modelS.getDescription(), 30, 400);
				text("Range", 267, 450);
				text(modelS.getRange() + " km", 267, 495);
				text("Seats", 166, 450);
				text(modelS.getSeats(), 166, 495);
				text("Safety", 40, 450);
				text(modelS.getSafety() + " Stars", 40, 495);

			} 

			modelS.drawModelCar();

			break;
		case 1:
			fill(255);
			textFont(raleway);
			textSize(18);
			text("Model 3", 160, 130);

			if (compareButton == false && carModel == 1) {
				
				text(modelTres.getDescription(), 20, 400);
				text("Range", 267, 450);
				text(modelTres.getRange() + " km", 267, 495);
				text("Seats", 166, 450);
				text(modelTres.getSeats(), 166, 495);
				text("Safety", 40, 450);
				text(modelTres.getSafety() + "Stars", 40, 495);

			} 
			modelTres.drawModelCar();

			break;
		case 2:
			fill(255);
			textFont(raleway);
			textSize(18);
			text("Model Y", 160, 130);

			if (compareButton == false && carModel == 2) {
				
				text(modelY.getDescription(), 20, 400);
				text("Range", 267, 450);
				text(modelY.getRange() + " km", 267, 495);
				text("Seats", 166, 450);
				text(modelY.getSeats(), 166, 495);
				text("Safety", 40, 450);
				text(modelY.getSafety() + "Stars", 40, 495);
			} 

			modelY.drawModelCar();

			break;
		case 3:
			fill(255);
			textFont(raleway);
			textSize(18);
			text("Model X", 160, 130);

			if (compareButton == false && carModel == 3) {
				
				text(modelX.getDescription(), 60, 400);
				text("Range", 267, 450);
				text(modelX.getRange() + " km", 267, 495);
				text("Seats", 166, 450);
				text(modelX.getSeats(), 166, 495);
				text("Safety", 40, 450);
				text(modelX.getSafety() + "Stars", 40, 495);
			} 

			modelX.drawModelCar();

			break;

		}

	}

	public void getInfoForm() {
		fullname = cp5.get(Textfield.class, "fullname").getText();
		username = cp5.get(Textfield.class, "username").getText();
		password = cp5.get(Textfield.class, "password").getText();
		email = cp5.get(Textfield.class, "email").getText();
		confirmEmail = cp5.get(Textfield.class, "confirmEmail").getText();



		if (email.equals(confirmEmail)&&username != null && password != null && email != null) {
			registerUser(fullname, username, password, email);
			emailAut = true;
			emailNoMatch = false;

		} else {
			emailNoMatch = true;

		}

	}
	public void getInfoFormTarjeta() {
		zipcode = cp5.get(Textfield.class, "zipcode").getText();
		street = cp5.get(Textfield.class, "street").getText();
		cvc = cp5.get(Textfield.class, "cvc").getText();
		city = cp5.get(Textfield.class, "city").getText();
		state = cp5.get(Textfield.class, "state").getText();
		cardNumber = cp5.get(Textfield.class, "cardNumber").getText();
		mm = cp5.get(Textfield.class, "mm").getText();
		yy = cp5.get(Textfield.class, "yy").getText();
		
		if (cardNumber != null && cvc != null && street != null) {
			registerTarjeta(cardNumber, mm, yy, cvc, street, state, city, zipcode);

		}
		
	}
	

	public void registerUser(String fullname, String username, String password, String email) {
		listUsers.add(new User(fullname, username, password, email));

		for (User user : listUsers) {
			System.out.println("username");
			System.out.println(user.getFullname());
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			System.out.println(user.getEmail());
			System.out.println("====================");
		}
	}
	
	
	
	
	public void registerHistorial(String price, String street, String model) {
		historicoCompra.add(new Historico(price,street,model));

		
	}
	

	/// TARJETA DE CREDITO
	public void registerTarjeta(String cardNumber, String mm, String yy, String cvc, String street, String state,
			String city, String zipcode) {
		tarjetaDeCredito.add(new TarjetaCredito(cardNumber, mm, yy, cvc, street, state, city, zipcode));
		

		for (TarjetaCredito tarjeta : tarjetaDeCredito) {
			System.out.println("tarejtaCredito");
			System.out.println(tarjeta.getStreet());
			System.out.println(tarjeta.getState());
			System.out.println(tarjeta.getCity());
			System.out.println(tarjeta.getZipcode());
			System.out.println(tarjeta.getMm());
			
			System.out.println("====================");
		}
	}

	public void mouseClicked() {

		System.out.println(mouseX + " " + mouseY + " ");

		if (mouseX > 270 && mouseX < 300 && mouseY > 600 && mouseY < 630 &&pantalla==1&&yaRegistro==false ) {
			getInfoForm();
			yaRegistro=true;
		    
			
		}
		if (mouseX > 175 && mouseX < 350 && mouseY > 620 && mouseY < 660&&pantalla==4&&registroTarjetaB==true) {
			getInfoFormTarjeta();
			registroTarjetaB=false;
			
		}

		// LOGIN A REGISTRATION
		if (pantalla == 0 && mouseX > 125 && mouseX < 200 && mouseY > 580 && mouseY < 600) {
			pantalla = 1;
			username = cp5.get(Textfield.class, "username").setVisible(true).getText();
			fullname = cp5.get(Textfield.class, "fullname").setVisible(true).getText();
			password = cp5.get(Textfield.class, "password").setVisible(true).getText();
			email = cp5.get(Textfield.class, "email").setVisible(true).getText();
			confirmEmail = cp5.get(Textfield.class, "confirmEmail").setVisible(true).getText();
			
			zipcode = cp5.get(Textfield.class, "zipcode").setVisible(false).getText();
			street = cp5.get(Textfield.class, "street").setVisible(false).getText();
			cvc = cp5.get(Textfield.class, "cvc").setVisible(false).getText();
			city = cp5.get(Textfield.class, "city").setVisible(false).getText();
			state = cp5.get(Textfield.class, "state").setVisible(false).getText();
			cardNumber = cp5.get(Textfield.class, "cardNumber").setVisible(false).getText();
			mm = cp5.get(Textfield.class, "mm").setVisible(false).getText();
			yy = cp5.get(Textfield.class, "yy").setVisible(false).getText();

			return;
		}

		// boton login a mainpage
		if (pantalla == 0 && mouseX > 125 && mouseX < 200 && mouseY > 500 && mouseY < 530&& logIn==true) {
			pantalla = 2;
			showMenu = false;
			return;
		}

		// quitar textos de registro
		if (pantalla == 1 && mouseX > 50 && mouseX < 200 && mouseY > 200 && mouseY < 230) {
			fullnameBoolean = false;
		}
		if (pantalla == 1 && mouseX > 50 && mouseX < 200 && mouseY > 270 && mouseY < 300) {
			usernameBoolean = false;
		}
		if (pantalla == 1 && mouseX > 50 && mouseX < 200 && mouseY > 340 && mouseY < 380) {
			passwordBoolean = false;
		}
		if (pantalla == 1 && mouseX > 50 && mouseX < 200 && mouseY > 410 && mouseY < 430) {
			emailBoolean = false;
		}
		if (pantalla == 1 && mouseX > 50 && mouseX < 200 && mouseY > 480 && mouseY < 500) {
			confirmEmailBoolean = false;
		}

		////////
		if (pantalla == 4 && mouseX > 50 && mouseX < 350 && mouseY > 280 && mouseY < 290) {
			cardNumberB = false;
		}

		if (pantalla == 4 && mouseX > 50 && mouseX < 80 && mouseY > 340 && mouseY < 370) {
			mmB = false;
		}

		if (pantalla == 4 && mouseX > 120 && mouseX < 150 && mouseY > 350 && mouseY < 370) {
			yyB = false;
		}

		if (pantalla == 4 && mouseX > 250 && mouseX < 280 && mouseY > 340 && mouseY < 370) {
			cvcB = false;
		}

		if (pantalla == 4 && mouseX > 30 && mouseX < 80 && mouseY > 440 && mouseY < 470) {
			streetB = false;
		}
		if (pantalla == 4 && mouseX > 30 && mouseX < 80 && mouseY > 540 && mouseY < 580) {
			zipcodeB = false;
		}
		if (pantalla == 4 && mouseX > 30 && mouseX < 80 && mouseY > 500 && mouseY < 530) {
			stateB = false;
		}
		if (pantalla == 4 && mouseX > 210 && mouseX < 250 && mouseY > 500 && mouseY < 530) {
			cityB = false;
		}

		// REGISTRO PASAR A MAIN MENU

		if (pantalla == 1 && mouseX > 270 && mouseX < 300 && mouseY > 600 && mouseY < 630 && botonConti == true) {
			pantalla = 2;
			showMenu = false;
			username = cp5.get(Textfield.class, "username").setVisible(false).getText();
			fullname = cp5.get(Textfield.class, "fullname").setVisible(false).getText();
			password = cp5.get(Textfield.class, "password").setVisible(false).getText();
			email = cp5.get(Textfield.class, "email").setVisible(false).getText();
			confirmEmail = cp5.get(Textfield.class, "confirmEmail").setVisible(false).getText();
			
			return;
		}

		// CARRO A MAIN MENU
		if (pantalla == 3 && mouseX > 5 && mouseX < 50 && mouseY > 20 && mouseY < 50) {
			pantalla = 2;
			showMenu = false;
			return;
		}

		// CAMBIAR DE CARRO
		if (showMenu == false) {
			if (mouseX > 45 && mouseX < 340 && mouseY > 130 && mouseY < 243 && pantalla == 2) {
				pantalla = 3;
				carModel = 0;
				compareButton = false;
				return;
			}
			if (mouseX > 45 && mouseX < 340 && mouseY > 266 && mouseY < 384 && pantalla == 2) {
				pantalla = 3;
				carModel = 1;
				compareButton = false;
				return;
			}
			if (mouseX > 45 && mouseX < 340 && mouseY > 400 && mouseY < 520 && pantalla == 2) {
				pantalla = 3;
				carModel = 2;
				compareButton = false;
				return;
			}
			if (mouseX > 45 && mouseX < 340 && mouseY > 540 && mouseY < 660 && pantalla == 2) {
				pantalla = 3;
				carModel = 3;
				compareButton = false;
				return;
			}

		}

		/// COMPARE PAGE ponerlo no mas

		// cero

		if (carModel == 0 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == false) {
			compareButton = true;
			
			return;

		}
		if (carModel == 0 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == true) {
			compareButton = false;

		}

		// uno
		if (carModel == 1 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == false) {
			compareButton = true;
			return;
		}
		if (carModel == 1 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == true) {
			compareButton = false;

		}
		// two
		if (carModel == 2 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == false) {
			compareButton = true;
			return;
		}
		if (carModel == 2 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == true) {
			compareButton = false;

		}
		// tres
		if (carModel == 3 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == false) {
			compareButton = true;
			return;
		}
		if (carModel == 3 && mouseX > 270 && mouseX < 345 && mouseY > 330 && mouseY < 380 && compareButton == true) {
			compareButton = false;

		}

		/// COMPRAR CARRO
		if (mouseX > 70 && mouseX < 350 && mouseY > 570 && mouseY < 630 && pantalla == 3&&compareButton==false) {
		zipcode = cp5.get(Textfield.class, "zipcode").setVisible(true).getText();
		street = cp5.get(Textfield.class, "street").setVisible(true).getText();
		cvc = cp5.get(Textfield.class, "cvc").setVisible(true).getText();
		city = cp5.get(Textfield.class, "city").setVisible(true).getText();
		state = cp5.get(Textfield.class, "state").setVisible(true).getText();
		cardNumber = cp5.get(Textfield.class, "cardNumber").setVisible(true).getText();
		mm = cp5.get(Textfield.class, "mm").setVisible(true).getText();
		yy = cp5.get(Textfield.class, "yy").setVisible(true).getText();
		}
		if (carModel == 0 && mouseX > 70 && mouseX < 350 && mouseY > 570 && mouseY < 630 && pantalla == 3&&compareButton==false) {
			pantalla = 4;
			carModel = 0;
			return;
		}
		if (carModel == 1 && mouseX > 70 && mouseX < 350 && mouseY > 570 && mouseY < 630 && pantalla == 3&&compareButton==false) {
			pantalla = 4;
			carModel = 1;
			return;
		}

		if (carModel == 2 && mouseX > 70 && mouseX < 350 && mouseY > 570 && mouseY < 630 && pantalla == 3&&compareButton==false) {
			pantalla = 4;
			carModel = 2;
			return;
		}
		if (carModel == 3 && mouseX > 70 && mouseX < 350 && mouseY > 570 && mouseY < 630 && pantalla == 3&&compareButton==false) {
			pantalla = 4;
			carModel = 3;
			return;
		}
		if (pantalla == 4 && mouseX > 5 && mouseX < 45 && mouseY > 20 && mouseY < 50) {
			pantalla = 2;
			return;
		}
		
		// ORDER COMPLETE - pasar a historial o a main menu///  AGREGAR AL HISTORIAL
		if(pantalla == 4 && mouseX > 176 && mouseX < 350 && mouseY > 600 && mouseY < 640 ) {
			
			zipcode = cp5.get(Textfield.class, "zipcode").setVisible(false).getText();
			street = cp5.get(Textfield.class, "street").setVisible(false).getText();
			cvc = cp5.get(Textfield.class, "cvc").setVisible(false).getText();
			city = cp5.get(Textfield.class, "city").setVisible(false).getText();
			state = cp5.get(Textfield.class, "state").setVisible(false).getText();
			cardNumber = cp5.get(Textfield.class, "cardNumber").setVisible(false).getText();
			mm = cp5.get(Textfield.class, "mm").setVisible(false).getText();
			yy = cp5.get(Textfield.class, "yy").setVisible(false).getText();
		}
		
		
		///BUY MODEL ////
		if (carModel == 0 && mouseX > 176 && mouseX < 350 && mouseY > 600 && mouseY < 640 && pantalla == 4) {
			pantalla = 5;
			buyModel = 0;
			
			
			String precioModelS = modelS.getPrice();
			String streetS = tarModelS.getStreet();
			String modelSPrueba = modelS.getModel();
			registerHistorial(precioModelS,streetS,modelSPrueba);
			return;
		}
		if (carModel == 1 && mouseX > 176 && mouseX < 350 && mouseY > 600 && mouseY < 640 && pantalla == 4) {
			pantalla = 5;
			buyModel = 1;
			//
			
			String precioModelTres = modelTres.getPrice();
			String streetTres = tarModelTres.getStreet();
			String modelTresPrueba = modelTres.getModel();
			
			registerHistorial(precioModelTres,streetTres,modelTresPrueba);
			
			return;
		}

		if (carModel == 2 && mouseX > 176 && mouseX < 350 && mouseY > 600 && mouseY < 640 && pantalla == 4) {
			pantalla = 5;
			buyModel = 2;
			
			String precioModelY = modelTres.getPrice();
			String streetY = tarModelY.getStreet();
			String modelYPrueba = modelY.getModel();
			registerHistorial(precioModelY,streetY,modelYPrueba);
			return;
		}

		if (carModel == 3 && mouseX > 176 && mouseX < 350 && mouseY > 600 && mouseY < 640 && pantalla == 4) {
			pantalla = 5;
			buyModel = 3;
			//
			
			String precioModelX = modelTres.getPrice();
			String streetX = tarModelX.getStreet();
			String modelXPrueba = modelX.getModel();
			registerHistorial(precioModelX,streetX,modelXPrueba);
			return;

		}
		if (pantalla == 5 && mouseX > 5 && mouseX < 45 && mouseY > 20 && mouseY < 50) {
			pantalla = 2;
			return;
		}

		// PASAR A HISTORICO
		if (mouseX > 85 && mouseX < 300 && mouseY > 580 && mouseY < 625 && pantalla == 5) {
			pantalla = 6;
			return;

		}

		// HISTORICO A MAIN PAGE
		if (mouseX > 18 && mouseX < 45 && mouseY > 25 && mouseY < 40 && pantalla == 6) {
			pantalla = 2;
			showMenu = false;
			return;

		}

		// SHOW MENU MAIN PAGE

		if (pantalla == 2 && dist(mouseX, mouseY, posXMenu, posYMenu) < 100) {
			showMenu = true;

		}

		if (pantalla == 2 && dist(mouseX, mouseY, 300, 30) < 100 && showMenu == true) {
			showMenu = false;

		}
		// homepage
		if (pantalla == 2 && showMenu == true && mouseX > 9 && mouseX < 45 && mouseY > 140 && mouseY < 160) {
			showMenu = false;

		}

		// payment details que seria otra pagina si hay tiempo

		// history
		if (pantalla == 2 && showMenu == true && mouseX > 9 && mouseX < 45 && mouseY > 320 && mouseY < 350) {
			pantalla = 6;
			return;
		}

		// log out en menu
		if (pantalla == 2 && mouseX > 9 && mouseX < 45 && mouseY > 430 && mouseY < 460 && showMenu == true) {
			pantalla = 0;
			yaRegistro=true;
			
			

		}
		

		
		
		
		
		

	}

}
