package recursion;

import java.util.Scanner;

public class Task_2_2 {

	public static void main(String[] args) {
        System.out.print("Enter a number.");
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(decimalToBinary(n));
	}
	
	public static String decimalToBinary(int n){
		if (n == 1)
		return "1";
	else
    return decimalToBinary(n/2) + n%2;
}
}