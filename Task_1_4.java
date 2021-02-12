package recursion;

import java.util.Scanner;

public class Task_1_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a real number x.");
		double x = sc.nextDouble();
		System.out.println("Enter a positive integer n.");
		int n = sc.nextInt();
		System.out.println(powRecursive(n,x));
		sc.close();
	}
	
	/*public static double powRecursive(int n, double x){
		double powRecursive = 1;
		for (int i = 0; i < n; i++){
			powRecursive *= x;
		}
		return powRecursive;
	}
	*/
	public static double powRecursive(int n, double x){
		if (n == 0){
			return 1;
		}
		return x * powRecursive(n - 1,x);
	}

}
