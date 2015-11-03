package numberTriangle;
import java.util.Scanner;

public class NumberTriangleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("How Many Rows?: ");
		int rows = Integer.parseInt(input.next());
		int currentRow = 0;
		int lastNumber = 0;
		for (int i = 0; i < rows; i++) {
			currentRow++;
			String row = new String();
			for (int j = 1; j <= currentRow; j++) {
				row += (lastNumber + j) + " ";
			}
			System.out.println(row);
			lastNumber += currentRow;
		}
	}

}
