/*
 * Written by Andrew Heuer
 * A class to hold the information of a bike frame
 */
public class Frame {
	double size;
	String type;
	
	//Default Constructor
	public Frame() {
		setSize(18.5);
		setType("Diamond");
	}
	
	//Parameterized Constructor
	public Frame(double s, String t) {
		setSize(s);
		setType(t);
	}
	
	//Setters
	public void setSize(double s) {
		if(s <= 60 && s >= 18.5) {
			this.size = s;
		}
		else {
			this.size = 18.5;
		}
	}
		
	public void setType(String t) {
		if(t == "Diamond" || t == "Step-Through" || t == "Truss" || t == "Penny-Farthing") {
			this.type = t;
		}
		else {
			this.type = "Diamond";
		}
	}
	
	//Getters
	public double getSize() {
		return this.size;
	}
	
	public String getType() {
		return this.type;
	}
	
	//An equals method to check if two Frames have the same size and type
	public boolean equals(double s, String t) {
		if(this.size == s && this.type.equals(t)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//A toString method that returns a String with all of the information stored in a wheel
	public String toString() {
		return "[Frame] Size: " + getSize() + " Type: " + getType();
	}
}
