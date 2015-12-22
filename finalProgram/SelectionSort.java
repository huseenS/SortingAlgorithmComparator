/**
 * 
 */
package finalProgram;

/**
 * @author Huseen Sufi
 * implements Selection Sort
 * counter  for comparisons ands swaps
 */
public class SelectionSort {
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
	
	
	public int[] sort(int[] toSort) {
		int[] sorted = selectSort(toSort);
		return sorted;
	}
	/**
	 * @param toSelectionSort
	 * @return sorted array
	 * sorts a random array using selection sort algorithm
	 * reports # of swaps made
	 */
	public int[] selectSort(int[] toSelectionSort) {
		for (int i = 0; i < toSelectionSort.length -1; i++) {
			int min = i; //set min to current pos
			//find the minPos
			
			for (int j = i + 1; j < toSelectionSort.length; j++) {
				comparisonCount++; //count comparisons
				if (toSelectionSort[j] < toSelectionSort[min]) { //if the current pos is less than the min
					
					min = j; // set the new minimum to the current pos\
				} //end first if
			} //end inner for
			if (min != i) {
				selectSwap(toSelectionSort, min, i); //swap the current pos with the current min
			}
			
		} //end outer for
		System.out.println("Selection Sort completed " + comparisonCount + " comparisons");
		System.out.println( "Selection Sort Completed " + swapCount + " swaps"); //show the swap count
		return toSelectionSort;
	}
	
	/** 
	 * @param a
	 * @param i
	 * @param j
	 * swaps values using a temp variable
	 */
	public void selectSwap( int[] a , int min, int i ) {
		int swap = a[min]; //set temp to hold min ref
		a[min] = a[i]; //set min to pos at i
		a[i] = swap; //set pos at i to temp
		swapCount++;
	}
}
