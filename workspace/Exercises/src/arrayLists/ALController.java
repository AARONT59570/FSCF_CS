package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ALController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(5);
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		ALMethods.switchPairs((ArrayList) list);
		System.out.println(list);
		List<String> list2 = new ArrayList<String>(5);
		list2.add("aaaa");
		list2.add("b");
		list2.add("c");
		list2.add("dddd");
		list2.add("e");
		System.out.println(list2);
		ALMethods.markLength4((ArrayList<String>) list2);
		System.out.println(list2);
	}

}