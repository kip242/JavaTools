package Algorithms;

import java.util.*;

public class QuickSortTest {

	public static void main(String[] args) {
		int[] numbers = {5, 6, 1, 2, 8, 3, 9};
		//numbers = new int[5];
		//Random generator = new Random();
		/*for (int i = 0; i < numbers.length; i++){
			numbers[i] = generator.nextInt();
		}*/
		QuickSortInt sorter = new QuickSortInt();
		printResult(numbers);
		
		sorter.sort(numbers);
		
		printResult(numbers);
	}	
	
	private static void printResult(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
        }
        System.out.println();
}

}
