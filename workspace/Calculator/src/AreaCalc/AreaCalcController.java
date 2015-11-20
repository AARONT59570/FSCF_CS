package AreaCalc;
import java.util.Scanner;

public class AreaCalcController {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AreaCalc calc = new AreaCalc();
		String inputString;
		System.out.print("What Shape: ");
		inputString = input.next();
		System.out.println(calc.InputString(inputString));
		
	}
}