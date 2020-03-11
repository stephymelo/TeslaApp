package tesla;

import processing.core.PApplet;

public class BrandX extends Carro {
	private int display;
	private int batteryRange;
	private int cargo;

	public BrandX(PApplet app) {
		super(app);
		this.batteryRange=batteryRange;
		this.display=display;
		this.cargo=cargo;
	
	}

	public int getDisplay() {
		return display;
	}

	public void setDisplay(int display) {
		this.display = display;
	}

	public int getBatteryRange() {
		return batteryRange;
	}

	public void setBatteryRange(int batteryRange) {
		this.batteryRange = batteryRange;
	}

	public int getCargo() {
		return cargo;
	}

	public void setCargo(int cargo) {
		this.cargo = cargo;
	}

}
