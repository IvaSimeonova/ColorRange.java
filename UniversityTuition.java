package Iva;


public class UniversityTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double initialTuition = 10_000;	
		double increase = 0.06;
		double futureTuition = initialTuition;
		
		for (int i = 0; i < 10; i++) {
			futureTuition += increase*futureTuition;
		}
		double entireTuition = 0;
		for (int i = 1; i < 4; i++) {
			entireTuition += futureTuition;
			futureTuition += futureTuition*increase;
		}
		System.out.println("A four year studie in 10 years will cost " 
		+ entireTuition);
	}

}
