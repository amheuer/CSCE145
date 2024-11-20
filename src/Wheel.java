/*
 * Written by Andrew Heuer
 * A class to hold the information of a wheel
 */
public class Wheel {
	double diameter;
	double width;
	
	//Default Constructor
	public Wheel() {
		setDiameter(16);
		setWidth(1);
	}
	
	//Parameterized Constuctor
	public Wheel(double d, double w) {
		setDiameter(d);
		setWidth(w);
	}
	
	//Setters
	public void setDiameter(double d) {
		if(d <= 55 && d >= 16) {
			this.diameter = d;
		}
		else {
			this.diameter = 16;
		}
	}
		
	public void setWidth(double w) {
		if(w <= 2.5 && w >= 1) {
			this.width = w;
		}
		else {
			this.width = 1;
		}
	}
	
	//Getters
	public double getDiameter() {
		return this.diameter;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	// An equals method to check if 2 wheels have the same width and diameter
	public boolean equals(double d, double w) {
		if(this.diameter == d && this.width == w) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//A two string method to print all of a wheels information
	public String toString() {
		return "[Wheel] Diameter: " + getDiameter() + " Width: " + getWidth();
	}
}
