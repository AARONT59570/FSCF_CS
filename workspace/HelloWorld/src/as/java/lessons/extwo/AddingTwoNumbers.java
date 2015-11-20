package as.java.lessons.extwo;

public class AddingTwoNumbers {
	public static void main(String[] args) {
		int numOne, numTwo;
		numOne = Integer.parseInt(args[0]);
		numTwo = Integer.parseInt(args[1]);
		int sum = numOne + numTwo;
		System.out.println("The Sum is: " + sum);
	}
}