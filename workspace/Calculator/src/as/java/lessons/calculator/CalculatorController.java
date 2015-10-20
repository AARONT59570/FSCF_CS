package as.java.lessons.calculator;
import java.util.Scanner;

public class CalculatorController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sumIn = new Scanner(System.in);
		while (true){
			String sum;
			System.out.print("Enter Equation: ");
			sum = sumIn.nextLine();
			Calculator calc = new Calculator(sum);
			calc.MakeEquation();
			System.out.println("Result: " + calc.Calculate());
		}
	}

}
