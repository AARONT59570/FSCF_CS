package grades;
import java.util.Scanner;

public class gradesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] grades = new float[3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Quiz Grade: ");
		grades[0] = input.nextFloat();
		System.out.print("Enter Mid-term Grade: ");
		grades[1] = input.nextFloat();
		System.out.print("Enter Final Grade: ");
		grades[2] = input.nextFloat();
		float total = 0;
		for (float f : grades) {
			total += f;
		}
		float avg = total / 3;
		System.out.println("Average = " + avg);
		if (avg >= 90) {
			System.out.println("Grade: A");
		}
		else if (avg >= 70) {
			System.out.println("Grade: B");
		}
		else if (avg >= 50) {
			System.out.println("Grade: C");
		}
		else {
			System.out.println("Grade: F");
		}
	}

}
