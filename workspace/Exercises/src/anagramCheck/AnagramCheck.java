package anagramCheck;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		char[] word1 = input.next().toLowerCase().toCharArray();
		System.out.print("Enter another word: ");
		char[] word2 = input.next().toLowerCase().toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
//		System.out.println(word1);
//		System.out.println(word2);
		if (Arrays.equals(word1, word2))
			System.out.println("Words are anagrams!");
		else
			System.out.println("Words are not anagrams!");

	}

}
