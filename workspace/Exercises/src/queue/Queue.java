package queue;

public class Queue {

	 private int maxSize;

	 private long[] queueArray; // declare array variable

	 private int front; // another name for the head of the queue

	 private int rear; // another name for the tail of the queue

	 private int nItems; // returns the total number of items in the queue

	 //-------------------------------------------------------------------

	 public Queue(int s){

		 maxSize=s;
		 queueArray=new long[maxSize];
		 front=0;
		 rear = -1 ;
		 nItems = 0;
	 }
	 public void insert(long j) {
		 if (rear == maxSize - 1 && front != 0)
		 {
			for (int i = 0; i < queueArray.length; i++) {
				queueArray[i] = queueArray[front + i];
				queueArray[front + i] = 0;
				rear--;
			}
			front = 0;
		 }

		 String result = rear == maxSize - 1 ? "Queue full " : addItem(j);
	
		 System.out.println(result);

	 }

	 public String addItem(long j){

		 queueArray[++rear]=j;
	
		 nItems++;
	
		 return "Item added";

	 }

	 public void remove(){// always remove from the front end (or the head end)

		 // first check if the queue is empty
	
		 String result= rear==-1?"Empty Queue": removeItem();
	
		 System.out.println(result);

	 }

	 public String removeItem(){

		 long removedItem = queueArray[front++];
	
		 nItems--;
	
		 return "The item " + removedItem + " from the queue";

	 }
	// check if the queue is empty

	 public boolean isEmpty(){

		 return nItems==0;

	 }

	 //check if the queue is full

	 public boolean isFull(){
	
		 return nItems==maxSize;

	 }

	 //check number of items in the queue

	 public int numItemsInQueue(){

	 return nItems;

	 }

	 public long peek(){

		 return queueArray[front];

	 }

	 public long[] getArray(){

		 return queueArray;

	 }

	}