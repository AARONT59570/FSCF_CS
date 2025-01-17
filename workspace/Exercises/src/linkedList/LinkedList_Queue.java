package linkedList;

public class LinkedList_Queue extends Linked_List {
	private Link rear = null;
	private int nItems = 0;
	public void addItem(String Name,int age,String favBand,boolean inARelationship)
	{
		if (nItems == 0)
		{
			insertFirst(Name, age, favBand, inARelationship);
			rear = first;
		}
		else
		{
			Link link = new Link(Name,age,favBand,inARelationship);
			rear.setNextLink(link);
			rear = link;
		}
		nItems++;
	}
	public Link removeItem()
	{
		Link tempFirst = first;
		first = tempFirst.getNextLink();
		nItems--;
		return tempFirst;
	}

}
