package askAgeLoop;
import java.util.Scanner;

public class AgeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age;
		while(true) {
			System.out.print("What is your age?: ");
			age = Integer.parseInt(input.next());
			if (age == 999) {
				System.out.println("Rogue Value !!!");
				break;
			}
			System.out.println(String.format("Congratulations on being %1$d!", age));
		}
	}

}
