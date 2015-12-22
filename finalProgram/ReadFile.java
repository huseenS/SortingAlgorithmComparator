/**
 * 
 */
package finalProgram;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Huseen Sufi
 *read file using scanner
 */
public class ReadFile {
	
	public int[] readFile(String fileName) {
		ArrayList<Integer> numList = new ArrayList<>();
		try(FileReader fr = new FileReader(fileName)){//try with resources, auto close
			Scanner myScanner = new Scanner(fr);
			while (myScanner.hasNext()) {
				numList.add(myScanner.nextInt());
			} //end while
			myScanner.close();
			System.out.println("Array: " + numList.size() +  numList);
		} catch (IOException e) {
			e.printStackTrace();
		} //end catch
		
		//ArrayList to primitive array
				int [] numArray = new int[numList.size()];
				for (int i = 0; i < numList.size(); i++) {
					numArray[i] = numList.get(i);
				} //end for
		return numArray;
	} //end method
	
}
