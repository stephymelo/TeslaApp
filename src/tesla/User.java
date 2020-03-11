package tesla;

import java.util.ArrayList;

import controlP5.ControlP5;
import controlP5.Textfield;

import processing.core.PApplet;
import processing.core.PFont;

public class User extends PApplet {

	
	private PApplet app;
//	private ControlP5 cp5;
//	private String[] inputs;
	private String fullname, username, password, confirmEmail, email;
	PFont raleway;

	public User(String fullname,String username,String password,String email) {
		this.username=username;
		this.fullname=fullname;
		this.confirmEmail=confirmEmail;
		this.password=password;
		this.email=email;

		
	


		

	}
	
	


	


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}






	public String getFullname() {
		return fullname;
	}






	public void setFullname(String fullname) {
		this.fullname = fullname;
	}






	public String getConfirmEmail() {
		return confirmEmail;
	}






	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	
}
