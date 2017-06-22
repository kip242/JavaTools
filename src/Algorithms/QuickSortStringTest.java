package Algorithms;

public class QuickSortStringTest {

	public static void main(String[] args) {
		String[] a = {"b", "a", "z", "y", "s"};
		QuickSortString sorter = new QuickSortString();
		sorter.print(a);
		sorter.sort(a);
		sorter.print(a);
		
	}

}
