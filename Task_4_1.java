package recursion;

public class Task_4_1 {

	public static void main(String[] args) {
		System.out.println("Sum is " + xMethod(5));
		System.out.println("Sum is " + yMethod(5));
	}
	
	public static int xMethod(int n){
		return xMethod(n, 1);
	}
	
	public static int xMethod(int n, int result){
		if(n == 1)
			return result;
		else
		    return xMethod(n-1, result + n);
	}
	
	public static int yMethod(int n){
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += 1;
		}
		    return sum;
	}
	
	

}
