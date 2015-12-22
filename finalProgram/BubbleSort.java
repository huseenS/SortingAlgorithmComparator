package finalProgram;

/**
 * 
 * @author Huseen Sufi
 * Implementation of bubble sort algorithm
 * counters for comparisons and swaps
 */
public class BubbleSort {
	private int bubbleswapCount;
	private int bubblecomparisonCount;
		/**
	 * @return the swapCount
	 */
	public int getSwapCount() {
		return bubbleswapCount;
	}

	/**
	 * @return the comparisonCount
	 */
	public int getComparisonCount() {
		return bubblecomparisonCount;
	}

	
		public int[] sort(int[] toSort) {
			int[] sorted = bubbleSort(toSort);
			return sorted;
		}
		/**
		 * @param toBubbleSort
		 * @return sorted Array
		 * sorts a random array and displays in increasing order using bubble sort algorithm
		 * reports # swaps made and time it took in milliseconds
		 */
	public int [] bubbleSort( int[] toBubbleSort ) {
		boolean isSwapped = true; //boolean flag
		while (isSwapped) {
			isSwapped = false; //waiting for swap
			for (int i = 0; i < toBubbleSort.length -1; i++) {
				bubblecomparisonCount++; //a comparison is made
					if (toBubbleSort[i] > toBubbleSort[i+1]) { //if the current index value is larger than the next value
						swap(toBubbleSort, i, i+1); //swap the two elements 
						isSwapped = true; //swap flag is set to true per iteration of loop
					} //end if
			} //end for
		}// end while
		System.out.println("Bubble Sort Completed " + bubblecomparisonCount + " comparisons");
		System.out.println("\n" + "Bubble Sort Completed " + bubbleswapCount + " swaps"); //show the swap count
		return toBubbleSort;
	}
		
	public void swap( int[] a , int i, int j ) {
		int swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		bubbleswapCount++;
	}
}

