package Iva;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c1 = new Circle();
        System.out.println("Area of c1 " + c1.getArea() + " perimeter of c1 " + c1.getPerimeter());
        
        Circle c2 = new Circle(5);
        System.out.println("Area of c2 " + c2.getArea() + " perimeter of c2 " + c2.getPerimeter());
        
        c1.setRadius(10);
        System.out.println("Area of c1 " + c1.getArea() + " perimeter of c1 " + c1.getPerimeter());
		
		//TV tv1 = new TV();
		//System.out.println("channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on );
		//tv1.switchOn();
		//tv1.channelDown();
		//tv1.volumeUp();
		//System.out.println("channel " + tv1.channel + " volume " + tv1.volume + " on: " + tv1.on );
	}

}
