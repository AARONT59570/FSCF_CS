package binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 5, 8, 11, 90, 100, 111, 112};
		System.out.println(binarySearch(a, 5));

	}
	public static boolean binarySearch(int[] array, int value) {
		int first = 0;
		int last = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			int mid = (last - first)/2;
			if (array[mid] == value)
				return true;
			else if (array[mid] > value)
				last = mid - 1;
			else
				first = mid + 1;
		}
		return false;
		
	}

}
