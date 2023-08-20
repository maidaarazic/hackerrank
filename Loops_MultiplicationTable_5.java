package hackerrank30days;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/*
 * Write a multiplication table program
 * n * i = result
 */


public class Loops_MultiplicationTable_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter an integer for multiplication table: ");

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int result;
        
        for (int i = 1; i <= 10; i++ ){
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        bufferedReader.close();

	}

}
