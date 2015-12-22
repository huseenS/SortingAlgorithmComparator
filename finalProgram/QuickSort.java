/**
 * 
 */
package finalProgram;

import java.util.Arrays;

/**
 * @author Huseen Sufi
 * implements the Quick Sort algorithm recursively
 * uses a partition method and swap method
 * counter for comparisons and swaps
 */
public class QuickSort {
	private int swapCount = 0;
	private int comparisonCount = 0;
	/**
	 * @return the swapCount
	 */
	public int getSwapCount() {
		return swapCount;
	}

	/**
	 * @return the comparisonCount
	 */
	public int getComparisonCount() {
		return comparisonCount;
	}
	
	public  int[] sort(int[] toSort) {
		int[] sorted = quickSort(toSort,0,toSort.length - 1);
		System.out.println("swap Count " + swapCount);
		System.out.println("comparison Count " + comparisonCount);
		System.out.println(Arrays.toString(toSort));
		return sorted;
		
	}
	/**
	 * @param toSort
	 * @param left
	 * @param right
	 * @return i
	 * partition the array via a pivot point
	 * if the current pos at i is less/equal to pos at j then swap 
	 * so that left partition only includes all elements less than pivot
	 * and right partition includes all elements greater than pivot
	 * Includes Recursive calls on both partitions
	 */
	public int [] quickSort(int[] toSort, int left, int right) {
		
		int pivotPoint = toSort[left + (right - left)/2]; //pivot is set to highest element
		int i = left;
		int j = right;
		while (i <= j) {
			comparisonCount++;
			while (toSort[i] < pivotPoint) {
				comparisonCount++;
				i++; //increment left pointer
			}//end first while
			
			while (toSort[j] > pivotPoint) {
				comparisonCount++;
				j--; //decrement right pointer
			} //end second while
			
			//swap the left and right if the left pointer is less than the right pointer 
			if (i <= j) { 
				swap(toSort,i,j); //call swap
				i++; //increment
				j--; //decrement
			} 
		} //end outside While
		if (left < j) {
			quickSort(toSort, left, j);// recursive call on left half
		}
		if (i < right) {
			quickSort(toSort, i, right); //recursive call on right half
		}
		return toSort;
	}
	/** 
	 * @param 
	 * @param i
	 * @param j
	 * swaps values using a temp variable
	 */
	public void swap( int[] a , int i, int j ) {
		int swap = a[i]; //set temp to hold i ref
		a[i] = a[j]; //set i to pos at j
		a[j] = swap; //set pos at j to temp
		swapCount++;
	}

	
}
