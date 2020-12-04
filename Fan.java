package Iva;

public class Fan {
	public final static int SLOW = 1;
	public final static int FAST = 3;
	public final static int MEDIUM = 2;
	
	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = new String("Blue");
	
    public Fan() {
    }
    
    public int getSpeed(){
    	return speed;
    }
    
    public void setSpeed(int speed){
    	this.speed = speed;
    }

	public boolean isSwitchedOn() {
		return switchedOn;
	}

	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString(){
		if(switchedOn){
			return "Speed: " + speed + ", color: " + color + ", radius: " + radius;
		}else{
			return "Color: " + color + ", radius: " + radius + ", the fan is turned off."; 
		}
	}

}
