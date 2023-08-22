package hackerrank30days;
import java.util.Scanner;

public class ToBinary_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

Scanner input = new Scanner (System.in);

int n = input.nextInt();

input.close();

int max = 0, count = 0;

while (n > 0) {
	int rem = n % 2;
	n /= 2;
	
	if (rem == 1) {
		count++;
		if(max < count) {
			max = count;
		}
		
	}
	else {
		count = 0;
	}
}
System.out.println(max);
		
	}

}
