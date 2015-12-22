/**
 * 
 */
package finalProgram;

import java.util.Random;

/**
 * @author Huseen Sufi
 *
 */
/**
 * @author Huseen Sufi
 * writes a random array to a txt file
 */
public class RandomArrays {

	/**
	 * @param min
	 * @param max
	 * @return random integer value within range of specified min and max
	 */
	public int randInt(int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((100 + 1) + 0);

		return randNum;
	}
	
	/**
	 * @param arraySize
	 * @return random integer array of specified size
	 */
	public int[] randArray(int arraySize) {
		int [] random = new int[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			random[i] = randInt(0, arraySize); //fill with random integers from 0-100
		}
		return random;
		
	}
	
}
