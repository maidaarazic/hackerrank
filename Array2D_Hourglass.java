package hackerrank30days;
import java.util.Scanner;

public class Array2D_Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int arr [][] = new int [6][6];
		int max = -64;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = input.nextInt();
			}
			
		}
		
       for (int i = 0; i < 4; i++) {
    	   for (int j = 0; j < 4; j++) {
    		   int temp = 0;
    		   //top row
    		   temp += arr [i][j];
    		   temp += arr[i][j + 1];
    		   temp += arr[i][j + 2];
    		   //middle row
    		   temp += arr[i + 1][j + 1];
    		   //bottom row 
    		   temp += arr[i + 2][j];
    		   temp += arr[i + 2][j + 1];
    		   temp += arr[i + 2][j + 2];
    		   
    		   if (temp > max)
    			   max = temp;
    	   }
       }
       System.out.println(max);
		
	}

}
