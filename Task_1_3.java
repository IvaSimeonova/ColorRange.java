package recursion;

import java.util.Scanner;

public class Task_1_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.print(pow2Recursive(n));
		sc.close();
	}
	
	/*public static int pow2Recursive(int n){
		int pow2Recursive = 1;
		for(int i = 0; i < n ;i++){
			pow2Recursive *= 2;
		}
		return pow2Recursive;
	}
	*/
	public static int pow2Recursive(int n){
		if(n == 0){
			return 1;
		}
		return 2* pow2Recursive(n - 1);
	}

}
