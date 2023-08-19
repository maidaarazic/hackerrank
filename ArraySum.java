package hackerrank_problem_solving;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		
		int [] arr = new int [n];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println(ArraySum(arr));
	
	}
	
	
	
	public static int ArraySum ( int [] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}


}

