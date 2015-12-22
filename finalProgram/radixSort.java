/**
 * 
 */
package finalProgram;

import java.util.Arrays;

/**
 * @author Huseen Sufi
 * Implements Radix Sort
 */
public class radixSort {
/**
	 * @return the comparisonCount
	 */
	public int getComparisonCount() {
		return comparisonCount;
	}

int comparisonCount = 0;

	/**
	 * @param toSort the unsorted Array
	 * @return the sorted array
	 */
	public int[] sort(int[] toSort) {
		int i;
		int m = toSort[0];
		int exp = 1;
		int n = toSort.length;
	    int[] b = new int[n];
	    
	    //find the maximum number
        for (i = 1; i < n; i++) {
        	if (toSort[i] > m)
        		m = toSort[i]; //set new max
        } //end for
        
        //divide by 10 until max is less than 0
        while (m / exp > 0){
            int[] bucket = new int[10]; //temp bucket
            
            //count frequencies
            for (i = 0; i < n; i++) {
            	 comparisonCount++;
                bucket[(toSort[i] / exp) % 10]++;
            }
            
            //bucket[i] contains position of digit
            for (i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];
            }
            //move from buckets
            for (i = n - 1; i >= 0; i--) {
                b[--bucket[(toSort[i] / exp) % 10]] = toSort[i];
            }
            //copy the now sorted values from b to toSort
            for (i = 0; i < n; i++)
                toSort[i] = b[i];
            exp *= 10;        
        }//end while
		System.out.println("ComparisonCount " + comparisonCount);
		System.out.println(Arrays.toString(toSort));
		return toSort;
		
	} //end method
	
} //end class
