package oddOrEven;
import java.util.Scanner;

public class oddOrEvenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float num;
		System.out.print("Enter A Number: ");
		num = input.nextFloat();
		if (num % 2 > 0) {
			System.out.println("The Number Is Odd");
		}
		else {
			System.out.println("The Number Is Even");
		}
		
	}

}
