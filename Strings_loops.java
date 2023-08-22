package hackerrank30days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Strings_loops {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int n = input.nextInt();
		String [] str = new String [n];
		
		for(int i = 0; i < n; i++) {
			str [i] = input.next();
		}
		
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < str[j].length(); k += 2) {
				System.out.print(str[j].charAt(k));
			}
			System.out.print(" ");
		
		
		    for (int k = 1; k < str[j].length(); k += 2) {
				System.out.print(str[j].charAt(k));
				}
		    
		    System.out.println();
			
			
		}
		
		
	}

}
