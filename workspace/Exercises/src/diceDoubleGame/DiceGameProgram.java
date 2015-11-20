package diceDoubleGame;
import java.util.Scanner;
public class DiceGameProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("How many sides does the dice have?: ");
		int sides = Integer.parseInt(input.next());
		int trys = 0;
		while(true) {
			trys++;
			if ((int)(Math.random() * sides) == (int)(Math.random() * sides)) {
				System.out.println(String.format("You Won in %1$d Goes!", trys));
				break;
			}
		}
	}

}
