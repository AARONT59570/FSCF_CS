package collectionsFramework;
import java.util.*;

public class LinkedListSort {
	private LinkedList<Integer> list;
	private  int values;
	
	public LinkedListSort(int values)
	{
		this.values = values;
		list = new LinkedList<Integer>();
		for (int i = 0; i < values; i++) {
			list.add(Integer.valueOf((int) Math.round(Math.random()*100)));
		}
		
	}
	public void SortList()
	{
		list.sort(super(<Integer>));
		
	}

}
