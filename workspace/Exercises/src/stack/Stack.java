package stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int maxSize)
	{
		this.maxSize = maxSize;
		this.top=-1;
		stackArray=new long[this.maxSize];
	}
	public void push(long val)
	{
		String result = top == stackArray.length-1? "Stack is full": pushItem(val);
		msgBox(result);
	}
	public void msgBox(String msg)
	{
		System.out.println("** " + msg + " **");
	}
	public String pushItem(long val)
	{
		stackArray[++top] = val;
		return "Item Added to stack";
	}
	public void pop()
	{
		msgBox(top==-1?"Stack is empty":popItem());
	}
	public String popItem()
	{
		return "Item at the top: " + stackArray[top--] + " removed";
	}
	public boolean isEmpty()
	{
		return(top==-1);
	}
	public boolean isFull()
	{
		return(top==stackArray.length-1);
	}
}
