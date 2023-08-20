package hackerrank30days;
import java.util.Scanner;


public class DataTypess_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int i = 4;
		double d = 4;
		String s = "HackerRank";
		
		
		System.out.println("Integer: ");
		int secondInt = input.nextInt();
		
		System.out.println("Double: ");
		double secondDouble = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("String: ");
		String secondString = input.nextLine();
		
		
		System.out.println(i + secondInt);
		System.out.println(d + secondDouble);
		System.out.println(s + " " + secondString);
		
		
		input.close();

	}

}
