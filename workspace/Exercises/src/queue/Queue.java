package queue;

public class Queue {

	 private int maxSize;

	 private long[] queueArray; // declare array variable

	 private int front; // another name for the head of the queue

	 private int rear; // another name for the tail of the queue

	 private int nItems; // returns the total number of items in the queue

	 //-------------------------------------------------------------------

	 public Queue(int s){ //constructor init blud!

		 maxSize=s;//set the maximum size of the array
	
		 queueArray=new long[maxSize];//instantiate the array
	
		 front=0; // array indexes always start from zero- we KNOW this by now!
	
		 rear = -1 ; // nothing there yet, you could set it to zero but it can 
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
	
		//same as if(rear==maxSize-1) yadi yadi yada
	
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
	
		 //queueArray[--front]=-1;
	
		 // all in one go: All hail the power of post incrementor! mwaahaaaha!
	
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