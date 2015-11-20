package primeCheck;
import java.util.Scanner;

public class PrimeCheckProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number: ");
			int num = Integer.parseInt(input.next());
			int curFactors = 0;
			for (int i = 1; i <= num; i++) {
				if (num%i == 0)
					curFactors++;
			}
			if (curFactors <= 2)
				System.out.println(num + " is a prime number !");
		}
	}

}