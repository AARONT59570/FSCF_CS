package binaryCheck;
import java.util.Scanner;
public class CheckerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a binary number or denary number: ");
		long num = Long.parseLong(input.next());
		Boolean binary = true;
		while (true) {
			if (num == 0)
				break;
			if ((num%10) > 1) {
				binary = false;
				break;
			}
			num /= 10;
		}
		if (binary)
			System.out.println("Number is binary!");
		else
			System.out.println("Number is not binary!");
		
	}

}
