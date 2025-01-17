package linkedList;

public class Linked_List {

	 protected Link first;
	 private int links = 0;

	 public Linked_List(){ 
		 first = null;
	 }

	 public boolean isEmpty(){

	 return (first==null); 

	 }

	 

	public void insertFirst(String Name,int age,String favBand,boolean inARelationship){

		Link link = new Link(Name,age,favBand,inARelationship);
		links++;
	
		 if(first!=null) {
			 link.setNextLink(first);
			 first = link;// new object is placed at the start
	
		 }
	
		 else{
	
			 first=link;
	
		 }

	}
	public Link deleteFirst(){
		links--;

		 Link deletedLink = first;

		 first = first.getNextLink();

		 return deletedLink;

	}
	public Link delete(int linkNum){
		Link current = first;
		if (linkNum == 1)
			return deleteFirst();
		for (int i = 0; i < linkNum - 2; i++) {
			current=current.getNextLink();
		}
		Link deletedLink = current.getNextLink();
		current.setNextLink(deletedLink.getNextLink());
		links--;
		return deletedLink;
	}
	public Link delete(String name){
		if (first.getName().equalsIgnoreCase(name))
			return deleteFirst();
		
		Link current = this.findPrev(name);
		if (current == null)
			return null;
		Link deletedLink = current.getNextLink();
		current.setNextLink(deletedLink.getNextLink());
		links--;
		return deletedLink;
	}
	public Link findPrev(String name)
	{
		Link current = first;
		if (current.getName().equalsIgnoreCase(name))
			return current;
		while(current!=null)
		{
			if (current.getNextLink().getName().equalsIgnoreCase(name))
				return current;
			current = current.getNextLink();
		}
		return null;
	}
	public Link find(String name)
	{
		Link current = first;
		while(current!=null)
		{
			if (current.getName().equalsIgnoreCase(name))
				return current;
			current = current.getNextLink();
		}
		return null;
	}
	public Link insert(String Name,int age,String favBand,boolean inARelationship){
		Link link = new Link(Name,age,favBand,inARelationship);
	
		 if(links==0) {
			 first = link;
			 links++;
			 return link;
		}
		Link current = first;
		for (int i = 0; i < links - 1; i++) {
			current=current.getNextLink();
		}
		current.setNextLink(link);
		links++;
		return link;
	}

	public void displayList(){

		 System.out.print("list (first-->last): ");

		 Link current = first;

		 while(current!=null){
			 current.displayLink();
			 current=current.getNextLink();
		 }

		 System.out.println(" ");
	}
}
