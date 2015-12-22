
package finalProgram;

/**
 * @author Huseen Sufi
 * implements shellSort
 */

public class ShellSort {
	int swapCount = 0;
	int comparisonCount = 0;
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
	
	/**
	 * @param toSort
	 * @return sorted Array
	 */
	public int[] sort(int[] toSort) {
		//initial variables
		int lower = 0; //lower index
		int upper = 0; //upper index
		int temp = 0;
		int interval = 1;
		
		//set interval for any sized array
		while (interval <= toSort.length / 3){

			interval = interval * 3 + 1; //set interval sequence
		} //end first while

		//start with largest interval and keep looping until 1, then insertion sort
		while (interval > 0) {
			for (upper = interval; upper < toSort.length; upper++) {
				temp = toSort[upper]; //save value
				lower = upper; //check all values below lower
				comparisonCount++;
				//move larger values up
				while (lower > interval - 1 && toSort[lower - interval] >= temp) {
					toSort[lower] = toSort[lower - interval]; //move value up
					swapCount++;
					lower -= interval; //decrement pointer
				} //end second while
				
				toSort[lower] = temp; ///put temp in correct location
			} //end for
			interval = (interval - 1) / 3; //decrement and repeat
		} //end third while
		
		System.out.println("Shell Sort Completed " + comparisonCount + " comparisons");
		System.out.println("Shell Sort Completed " + swapCount + " swaps"); //show the swap count
		return toSort;
	} //end method
} //end class
