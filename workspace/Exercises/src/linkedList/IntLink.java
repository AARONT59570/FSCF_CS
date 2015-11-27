package linkedList;

public class IntLink {
	private IntLink nextLink=null;
	private IntLink prevLink=null;
	private int value;
	 public IntLink getNextLink() 
	 {

		 return nextLink;

	 }

	 public void setNextLink(IntLink nextLink) 
	 {

		 this.nextLink = nextLink;
		 nextLink.setPrevLink(this);

	 }
	 public IntLink getPrevLink() 
	 {

		 return prevLink;

	 }

	 public void setPrevLink(IntLink prev) 
	 {

		 this.prevLink = prev;

	 }
	 public IntLink(int val)
	 {
		 this.value = val;
	 }
	 public int getValue()
	 {
		 return this.value;
	 }
	 public void setValue(int val)
	 {
		 this.value = val;
	 }

}
