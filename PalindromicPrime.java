package Iva;

public class PalindromicPrime {
	public static void main(String[] args) {
		System.out.print(2 + "\t");
		int count = 1;
		int number = 3;
		
		while(count < 120){
			boolean isPalindrom = isPalindrom(number);
	        if(! isPalindrom ){
		       number++;
		       continue;
	}
        	boolean isPrime = isPrime(number);
        	if(! isPrime){
		       number++;
		       continue;
	}
	
	System.out.println(number + "\t");
	count++;
	number++;
	if( count % 10 == 0 ){
		System.out.println();
	  }
	}
  }
	
	public static boolean isPrime(int aNumber){
		int maxDivider = ( int ) Math.ceil(Math.sqrt(aNumber));
		boolean isPrime = true;
		for( int i = 2; i <= maxDivider; i++ ){
		     if(aNumber % i == 0){
		    	 isPrime = false;
		    	 break;
		     }	
		}
		return isPrime;
	}
	public static boolean isPalindrom(int aNumber){
		int copyNumber = aNumber;
		int reversedNumber = 0;
		while( copyNumber != 0){
			int remainder = copyNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			copyNumber /= 10;
		}
		return aNumber == reversedNumber;
	}

}
