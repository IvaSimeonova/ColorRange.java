package recursion;

import java.util.Scanner;

public class Task_2_1 {
	public static void main(String[] args) {
		System.out.print("Enter a positive number.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n >= 0){
			System.out.println(evenRecursive(n)?"even":"odd");
		}
	}
	
	public static boolean evenRecursive(int n){
		if (n == 0)
			return true;
		else if (n == 1)
			return false;
		else 
		return evenRecursive(n-2);
	}
	
	public static boolean oddRecursive(int n){
		if (n == 0)
			return false;
		else if (n == 1)
			return true;
		else 
		return evenRecursive(n-2);
	}
}
