package linkedList;

public class LinkedList_ShoppingCart {
	private ItemLink first = null;
	private float total = 0;
	public void addItem(float price, int qty, String desc)
	{
		ItemLink item = new ItemLink(price, qty, desc);
		if (first == null)
			first = item;
		else
		{
			item.setNextLink(first);
			first = item;
		}
			
	}
	public ItemLink deleteFirst(){

		ItemLink deletedLink = first;

		 first = first.getNextLink();

		 return deletedLink;

	}
	public ItemLink delete(String name){
		if (first.getDesc().equalsIgnoreCase(name))
			return deleteFirst();
		
		ItemLink current = this.findPrev(name);
		if (current == null)
			return null;
		ItemLink deletedLink = current.getNextLink();
		current.setNextLink(deletedLink.getNextLink());
		return deletedLink;
	}
	public ItemLink findPrev(String name)
	{
		ItemLink current = first;
		if (current.getDesc().equalsIgnoreCase(name))
			return current;
		while(current!=null)
		{
			if (current.getNextLink().getDesc().equalsIgnoreCase(name))
				return current;
			current = current.getNextLink();
		}
		return null;
	}
	public ItemLink find(String name)
	{
		ItemLink current = first;
		while(current != null)
		{
			if (current.getDesc().equalsIgnoreCase(name))
				return current;
			current = current.getNextLink();
		}
		return null;
	}
	public void displayItems()
	{
		ItemLink currentItem = first;
		while(currentItem != null)
		{
			currentItem.displayItem();
			System.out.println("");
			currentItem = currentItem.getNextLink();
		}
	}
	public float getTotal()
	{
		total = 0;
		ItemLink currentItem = first;
		while(currentItem.getNextLink() != null)
		{
			total += currentItem.getSubTotal();
			currentItem = currentItem.getNextLink();
		}
		return this.total;
	}
}
