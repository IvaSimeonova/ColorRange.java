package Iva;

public class RP {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	
	public RP(){
		
	}
	
	public RP(int aN, double aSideLength){
		setN(aN);
		setSideLength(aSideLength);
	}
	
	public RP(int aN, double aSideLength, double x, double y){
		setN(aN);
		setSideLength(aSideLength);
		setX(x);
		setY(y);
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea(){
		return (n*sideLength*sideLength)/(4*Math.tan(Math.PI/n));
	}
	
	public double getPerimeter(){
		return n*sideLength;
	}

}
