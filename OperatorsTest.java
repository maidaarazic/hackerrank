package hackerrank30days;
import java.io.Closeable;
import java.util.Scanner;

public class OperatorsTest {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int first;
		int sec;
		int th;
		
		first = input.nextInt();
		sec = input.nextInt();
		th = input.nextInt();
		
		double res1 = (sec / 100.0) * first; //calculations are not correct! cannot find why
        double res2 = (double)(sec * first) / 100;
		double res3 = (th / 100.0) * first;
		double res4 = (double)(th * first) / 100;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3); 
		System.out.println(res4);
		
		input.close();

	}

}
