package revenue;
import java.util.Scanner;

public class revenueProgram {
	public static void main(String[] args) {
		float price;
		int q;
		float discount = 0f;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Unit Price: ");
		price = input.nextFloat();
		System.out.print("Enter Quantity: ");
		q = input.nextInt();
		float rev = price * q;
		System.out.println("Revenue: �" + rev);
		if (q > 100) {
			discount = (q>120) ? 0.15f : 0.1f;
		}
		System.out.println(String.format("After Discount: �%1$.2f(%2$.1f%%)", rev - (rev * discount), discount * 100));
	}
}
