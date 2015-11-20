package computerChat;
import java.util.Scanner;

public class computerChatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = new String[10];
		int[] intArray;
		int nameCount = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Whats Your Full Name?: ");
		String[] name = input.nextLine().split(" ");
		for (String curString : name) {
			stringArray[nameCount] = curString;
			nameCount++;
		}
		System.out.println(String.format("Hello %1$s!", stringArray[0]));
		
		
	}

}
