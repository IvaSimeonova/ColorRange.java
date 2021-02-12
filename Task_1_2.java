package recursion;

public class Task_1_2 {
	
	public static void main(String[] args){
		System.out.println("Sum is " + xMethod(5));
	}
	
	public static int xMethod(int n){
		if(n == 1)
			return 1;
		else
			return n + xMethod(n - 1);
	}
	
	public static int yMethod(int n){
		int sum = 0;
		for (int i=1; i<=n; i++){
			sum += 1;
		}
		return sum;
	}

}
