package palindromeCheck;
import java.util.Scanner;
import java.util.Arrays;

public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String[] inputStr = input.next().split("");
		String[] strReverse = new String[inputStr.length];
		int curChar = 0;
		for (int i = inputStr.length; i < strReverse.length; i--) {
			strReverse[curChar++] = inputStr[i];
		}
		String str1 = Arrays.toString(strReverse).replaceAll(",\\[\\] ", "");
		String str2 = Arrays.toString(inputStr).replaceAll(",\\[\\] ", "");
		if (str1.equalsIgnoreCase(str2))
			System.out.println(str2 + " is a Palindrome!");
		else
			System.out.println(str2 + " is not a Palindrome!");
		

	}

}
