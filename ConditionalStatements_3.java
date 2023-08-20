package hackerrank30days;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
 * Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

1 <= n <= 100

 */

public class ConditionalStatements_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		 System.out.println("Enter n");

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        while (n < 1  || n > 100) {
        	 System.out.println("N must be inside the range 1-100! Enter new n:"); // displays the message that n is outside the allowed range
        	 n = Integer.parseInt(bufferedReader.readLine().trim());
        }
        
    	   
    	   if (n % 2 == 0) {     // checks if n is even
    		   
               if (n >= 2 && n < 5 || n > 20) { // checks if 2 <= n <= 5 or n > 20 when n is even
                System.out.println("Not weird");
           }
       
               else if (n >= 6 && n <= 20) { // checks if 6 <= n <= 20 when n is even
                System.out.println("Weird");
           }
               
    	  } else {                            
    		   System.out.println("Weird"); // it is already confirmed that n is odd so it prints "weird"
    	   }


        bufferedReader.close();

	}

}
