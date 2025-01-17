package bubbleSort;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Array Length: ");
		int arrayCount =  input.nextInt();
		int[] a = new int[arrayCount];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*arrayCount);
		}
		int[] b = a;

		int tempVal=0;
		long startTime = System.currentTimeMillis();

	 //the outer for loop manages the passes (4 in this case)

		for(int j=0;j<a.length-1;++j){

	 //the inner loop does the swapping 

			for(int k=0;k<a.length-1-j;++k){
		
				if(a[k]>a[k+1]){
			
				tempVal = a[k];
			
				a[k]=a[k+1];
			
				a[k+1]=tempVal;
		
				}

			}
		}
		long elapsedTime = System.currentTimeMillis() - startTime;
		
		int tempVal2 = 0;

		int currentPos=1;
		long startTime2 = System.currentTimeMillis();

		for (currentPos=1;currentPos<b.length;++currentPos){

			while(currentPos> 0 && b[currentPos]<b[currentPos-1]){

				tempVal2 = b[currentPos];

				b[currentPos]=b[currentPos-1];

				b[currentPos-1]=tempVal;

				--currentPos;//pre-decrement

			}

		}
		long elapsedTime2 = System.currentTimeMillis() - startTime2;

	 //let�s print the sorted array

		for(int i=0; i<a.length; ++i){
	
			System.out.print((a[i] + " "));
	
		}
		System.out.println("");
		System.out.println(String.format("Bubble Sorting took %1$d ms ", elapsedTime));
		System.out.println(String.format("Insertion Sorting took %1$d ms ", elapsedTime2));

	}

}
