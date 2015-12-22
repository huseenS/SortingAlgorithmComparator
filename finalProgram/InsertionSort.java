/**
 * 
 */
package finalProgram;

 /* @author Huseen Sufi
 * Implements insertion Sort algorithm
 */
public class InsertionSort {
	private int swaps = 0;
	private int comparisons = 0;
	
	/**
	 * @return the swaps
	 */
	public int getSwaps() {
		return swaps;
	}

	/**
	 * @return the comparisons
	 */
	public int getComparisons() {
		return comparisons;
	}
	
	
	/**
	 * @param toInsertSort
	 * @return sorted Array via insertion sort
	 */
	public int[] insertSort (int[] toInsertSort) {
			for (int i = 1; i < toInsertSort.length; i++) {
				int toPlace = toInsertSort[i];  //number to move
				int j = i; //j is the index
				while (j > 0 && toInsertSort[j - 1] > toPlace) { //move larger elements up
					
					swap(toInsertSort, j, j-1); //swap elements
					j--; //decrement
				} //end while
				comparisons++;
			} //end for
		System.out.println("Insertion Sort Completed " + comparisons + " comparisons" );
		System.out.println("Insertion Sort Completed " + swaps + " swaps");//show the swap count
		return toInsertSort;
	}
	
	public void swap( int[] a , int min, int i ) {
		int swap = a[min]; //set temp to hold min ref
		a[min] = a[i]; //set min to pos at i
		a[i] = swap; //set pos at i to temp
		swaps++;
	}
}