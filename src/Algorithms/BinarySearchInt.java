package Algorithms;

public class BinarySearchInt {
	
	public static int NOT_FOUND = -1;
	
	public static int Search(Integer[] array, int key){
		int low = 0;
		int high = array.length - 1;
		while(low <= high) {
			int mid = (low + high)/2;
		
			if(array[mid] > key){
				high = mid - 1;
			} else if (array[mid] < key){
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return NOT_FOUND;	
	}

}
