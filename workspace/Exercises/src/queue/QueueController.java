package queue;
import java.util.Scanner;

public class QueueController {

	 public static void main(String[] args) {

		 int queueSize =0;
	
		 System.out.print("enter a queue size ");
	
		 Scanner sc = new Scanner(System.in);
	
		 queueSize=sc.nextInt();
	
		 Queue linearQueue = new Queue(queueSize);
	
		 //add items
	
		 for(int i=0; i<queueSize;i++){
	
			 	linearQueue.addItem((long)
	
				(Math.random()*queueSize));
	
		 }

	 //check the contents

		 long[] x = linearQueue.getArray();
	
		 for(int i=0; i<queueSize; i++){
	
			 System.out.print(x[i] + " ");
	
		 }

	 //remove an item

		 System.out.println();
	
		 linearQueue.remove();

		 for(int i=0; i<queueSize; i++){
	
		 System.out.print(x[i] + " ");

	 	}

	 }

}