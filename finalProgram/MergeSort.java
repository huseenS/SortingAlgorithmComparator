/**
 * 
 */
package finalProgram;

/**
 * @author Huseen Sufi
 * implementation of MergeSort algorithm
 * counters for comparisons and swaps
 */
public class MergeSort {
	private int comparisonCount = 0;
	private int swapCount = 0;
	
	
	/**
	 * @return the comparisonCount
	 */
	public int getComparisonCount() {
		return comparisonCount;
	}
	/**
	 * @return the swapCount
	 */
	public int getSwapCount() {
		return swapCount;
	}
	/**
	 * @param toSort
	 * @return sorted Array
	 * method that calls recursive mergeSort method
	 */
	public int[] sort(int[] toSort) {
		comparisonCount = 0;
		int[] Sorted = 	mergeSort(toSort,0,toSort.length-1);
		return Sorted;
	}
	/**
	 * @param toSort
	 * @param low lowerBound
	 * @param high upperBound
	 * @return sorted toSort using mergeSort algorithm
	 */
	public int[] mergeSort(int[] toSort, int low, int high) {
		//base case a one element array
		if (high <= low) {
			return toSort;
		} else {
			int mid = (low + high)/2; //midpoint
			mergeSort(toSort,low,mid);//recursive call for left side
			mergeSort(toSort,mid+1,high);//recursive call for right side
			merge(toSort,low,high); //merge both together
		} //end else
		return toSort;
	} //end method
	
	/**
	 * @param toSort
	 * @param low lower bound
	 * @param mid 
	 * @param high upper bound
	 * merges the two toSorts together
	 */
	public void merge(int[] toSort, int low, int high) {
		int[] temp = copy(toSort); //instantiate temp array
		int mid = (low+high)/2; //midpoint
		int i = 0;
		int j = low;
		int k = mid+1;
		
		//compare the items in the 2 halves and place in order
		while (j <= mid && k <= high) {
			comparisonCount++;
			if (toSort[j] < toSort[k]) { 
				swapCount++;
				temp[i] = toSort[j];
				i++;
				j++;
			} else {
				temp[i] = toSort[k];
				swapCount++;
				i++;
				k++;
			}
		} //end first while
		
		// move left side over from temp to toSort
		while (j <= mid) {
			temp[i] = toSort[j];
			swapCount++;
			i++;
			j++;
		} //end second while
		
		//  move right over from temp to toSort
		while (k <= high) {
			temp[i] = toSort[k];
			swapCount++;
			i++;
			k++;
		} //end third while

		//copy temp values into toSort
		for (int l=low, m=0; l<=high; l++, m++) {
			toSort[l] = temp[m];
			swapCount++;
		} //end for
		
    } //end method
	
	 /**
	 * @param array
	 * @return a temp copy of the array to be sorted
	 */
	public int[] copy(int[] array) {
			int[] temp = new int[array.length];
			for (int k=0; k<array.length; k++) {
	 			temp[k] = array[k];
	 		} //end for
			return temp;
	    } //end method
	
} //end class

	
	