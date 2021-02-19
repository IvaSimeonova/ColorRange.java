package recursion;

public class Task_4_3 {

	public static void main(String[] args) {
		int[] list = {1,4,2,5};
		System.out.print(average(list, 4));
	}
	
	public static double average(int[]arr, int n){
		return average(arr, n, 0)/n;
	}
	
	public static double average(int[] arr, int n, int result){
		if(n == 0)
			return result;
		else
			return average(arr, n-1, result + arr[n-1]);
	}

}
