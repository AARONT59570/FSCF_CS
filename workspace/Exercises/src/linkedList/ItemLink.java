package linkedList;

public class ItemLink {
	private ItemLink nextLink=null;
	private ItemLink prevLink=null;
	private float price;
	private int qauntity;
	private String itemDesc;
	private float subTotal;
	
	 public ItemLink getNextLink() 
	 {

		 return nextLink;

	 }

	 public void setNextLink(ItemLink nextLink) 
	 {

		 this.nextLink = nextLink;
		 nextLink.setPrevLink(this);

	 }
	 public ItemLink getPrevLink() 
	 {

		 return prevLink;

	 }

	 public void setPrevLink(ItemLink prev) 
	 {

		 this.prevLink = prev;

	 }
	 public ItemLink(float price, int qty, String desc)
	 {
		 this.price = price;
		 this.qauntity = qty;
		 this.itemDesc = desc;
		 this.subTotal = price * qty;
	 }
	 public float getPrice()
	 {
		 return this.price;
	 }
	 public void setPrice(float price)
	 {
		 this.price = price;
	 }
	 public int getQauntity()
	 {
		 return this.qauntity;
	 }
	 public void setQauntity(int qty)
	 {
		 this.qauntity = qty;
	 }
	 public String getDesc()
	 {
		 return this.itemDesc;
	 }
	 public void setDesc(String desc)
	 {
		 this.itemDesc = desc;
	 }
	 public float getSubTotal()
	 {
		 this.subTotal = this.price * this.qauntity;
		 return this.subTotal;
	 }
	 public void displayItem()
	 {
		 System.out.println("************");
		 System.out.println("Item: " + this.itemDesc);
		 System.out.println("Price Per Unit: " + this.price);
		 System.out.println("Qauntity: " + this.qauntity);
		 System.out.println("Sub Total: �" + this.getSubTotal());
		 System.out.println("************");
	 }

}
