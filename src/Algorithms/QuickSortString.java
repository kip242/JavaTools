
package Algorithms;

public class QuickSortString {
	
	//sorting work, recursive
	public void sort(String[] a){
		sort(a, 0, a.length-1);
	}
	
	private static void sort(String[] a, int lo, int hi){
		if (hi <= lo) {
			return;
		}
		int j = partition(a, lo, hi);
		sort(a, lo, j);
		sort(a, j+1, hi);
	}
	
	//create pivot point, this is first element in array in this case
	private static int partition(String[] a, int lo, int hi){
		String pivot = a[lo];
		int pivotLocation = lo;
		int i;
		for(i= lo + 1; i <= hi; i++){	
			if(a[i].compareToIgnoreCase(pivot) < 0){
				swap(a, i, pivotLocation);
				pivotLocation = pivotLocation + 1;
				swap(a, i, pivotLocation);
			}
		}	
		return pivotLocation;	
		}
	
	//swap method
	private static void swap(String[] a, int i, int j){
		String t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	//display contents of Array
	public void print(String[] a){
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	}

	





