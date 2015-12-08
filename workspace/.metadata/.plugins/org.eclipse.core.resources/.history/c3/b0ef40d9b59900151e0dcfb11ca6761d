package arrayLists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ALMethods {
	public static void switchPairs(ArrayList list)
	{
		int currentIndex = 0;
		int passes = (int) list.size() / 2;
		for (int i = 0; i < passes; i++) {
			Object tempObj = list.get(currentIndex);
			list.set(currentIndex, list.get(currentIndex+1));
			list.set(currentIndex+1, tempObj);
			currentIndex += 2;
		}
	}
	public static void markLength4(ArrayList<String> list)
	{
		int initSize = list.size();
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.length() == 4)
			{
				list.ensureCapacity(list.size() + 1);
				list.add(i, "****");
				i++;
			}
		}
	}
}
