package recursion;

public class Task_4_2 {

	public static void main(String[] args) {
		System.out.print(powRecursive(3, 2));
	}
	
	public static int powRecursive(int x, int n){
		return powRecursive(x, n, 1);
	}
	
	public static int powRecursive(int x, int n, int result){
		if (n == 0){
			return result;
		}
		return powRecursive(x, n-1, result*x);
	}

}
