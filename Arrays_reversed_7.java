package hackerrank30days;

import java.util.Scanner;

/*
 * print an array in reversed order
 * constraints: 1 <= n <= 1000;
                1 <= A[i] <= 10000 where A[i] is the ith integer of array
 */

public class Arrays_reversed_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int array_size = input.nextInt();
		int [] arr = new int [array_size];
		
		for (int i = 0; i < array_size; i++ ) {
			arr[i] = input.nextInt();
		}
		
		for (int i = array_size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		
		input.close();
	}

}
