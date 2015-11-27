package linkedList;

public class LinkedList_Stack {
	private Link top = null;
	private Linked_List stack = new Linked_List();
	public void push(String Name,int age,String favBand,boolean inARelationship){

		Link link = new Link(Name,age,favBand,inARelationship);
	
		 if(top!=null) {
			 link.setNextLink(top);
			 top = link;// new object is placed at the start
	
		 }
	
		 else{
	
			 top=link;
	
		 }

	}
	public Link pop()
	{
		 Link deletedLink = top;

		 top = top.getNextLink();

		 return deletedLink;
	}

}
