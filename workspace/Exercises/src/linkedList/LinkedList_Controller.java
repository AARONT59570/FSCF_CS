package linkedList;

public class LinkedList_Controller {

	 public static void main(String[] args) {

	 Linked_List studentDataList= new Linked_List();

	 studentDataList.insertFirst("Wendy",100,"One Direction",true);
	 studentDataList.insertFirst("Peter Pan",10,"Little Mix",true);

	 studentDataList.insertFirst("Cap'n Hook",50,"Cheeky Girls",true); 
	 studentDataList.insertFirst("Smee",100,"Cheeky Girls",true);
	 studentDataList.delete("peter pan");
	 studentDataList.insert("Peter Pan",10,"Little Mix",true);

	 studentDataList.displayList();

	 }

}