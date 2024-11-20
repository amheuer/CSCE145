/*
 * Written by Andrew Heuer
 * A class to hold the information of a bicycle
 */
public class Bicycle {
	String make;
	Wheel frontWheel;
	Wheel backWheel;
	Frame frame;
	
	//Default Constructor
	public Bicycle() {
		setMake("none");
		setFrontWheel(new Wheel());
		setBackWheel(new Wheel());
		setFrame(new Frame());
	}
	
	//Parameterized Constructor
	public Bicycle(String m, Wheel fw, Wheel bw, Frame f) {
		setMake(m);
		setFrontWheel(fw);
		setBackWheel(bw);
		setFrame(f);
	}
	
	//Setters
	public void setMake(String m) {
		if(m != null) {
			this.make = m;
		}
		else {
			this.make = "none";
		}
	}
		
	public void setFrontWheel(Wheel fw) {
		if(fw != null) {
			this.frontWheel = fw;
		}
		else {
			this.frontWheel = new Wheel();
		}
	}
	
	public void setBackWheel(Wheel bw) {
		if(bw != null) {
			this.backWheel = bw;
		}
		else {
			this.backWheel = new Wheel();
		}
	}
	
	public void setFrame(Frame f) {
		if(f != null) {
			this.frame = f;
		}
		else {
			this.frame = new Frame();
		}
	}
	
	//Getters
	public String getMake() {
		return this.make;
	}
	
	public Wheel getFrontWheel() {
		return this.frontWheel;
	}
	
	public Wheel getBackWheel() {
		return this.backWheel;
	}
	
	public Frame getFrame() {
		return this.frame;
	}
	
	//An equals method that checks if two bikes have the same value for all variables
	public boolean equals(String m, Wheel fw, Wheel bw, Frame f) {
		if(this.make.equals(m) && this.frontWheel.equals(fw) && this.backWheel.equals(bw) && this.frame.equals(f)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//A toString method that returns all bicycle info in a String
	public String toString() {
		return "[Bicycle] Make: " + getMake() + " Front Wheel: " + getFrontWheel() + " Back Wheel: " + getBackWheel() + " Frame: " + getFrame();
	}
}
