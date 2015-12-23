
package finalProgram;

//all imports
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Huseen Sufi
 *
 */
public class Gui extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//initial Variables for Gui
	private JPanel containerPanel;
	private JScrollPane scrollPaneOutput;
	private JTable table;
	private JPanel buttonPanel;
	private JButton insertionSort,selectionSort,bubbleSort,quickSort,mergeSort,shellSort,radixSort; //all buttons
	
	public Gui() {
		//Gui initialization
		setSize(800,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Sorting Algorithms");

		//container for all panels
		containerPanel = new JPanel();
		containerPanel.setLayout(new BorderLayout(25,25));
		
		//table
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Sort");
		model.addColumn("ArraySize");
		model.addColumn("swaps");
		model.addColumn("comparisons");
		model.addColumn("Time in milliseconds");
		table = new JTable(model);
		//scroll Pane
		scrollPaneOutput = new JScrollPane(table);
		containerPanel.add(scrollPaneOutput,BorderLayout.CENTER);
		
		//button panel containing all buttons
		buttonPanel = new JPanel();
		insertionSort = new JButton("Insert Sort");
		insertionSort.addActionListener(this);
		selectionSort = new JButton("Selection Sort");
		selectionSort.addActionListener(this);
		bubbleSort = new JButton("Bubble Sort");
		bubbleSort.addActionListener(this);
		quickSort = new JButton("Quick Sort");
		quickSort.addActionListener(this);
		mergeSort = new JButton("Merge Sort");
		mergeSort.addActionListener(this);
		shellSort = new JButton("Shell Sort");
		shellSort.addActionListener(this);
		radixSort = new JButton("Radix Sort");
		radixSort.addActionListener(this);
		buttonPanel.add(insertionSort);
		buttonPanel.add(selectionSort);
		buttonPanel.add(bubbleSort);
		buttonPanel.add(quickSort);
		buttonPanel.add(mergeSort);
		buttonPanel.add(shellSort);
		buttonPanel.add(radixSort);
		containerPanel.add(buttonPanel,BorderLayout.NORTH);
		
		add(containerPanel); //add container to JFrame
		setVisible(true);
		
	}
	
	/**
	 * @param myFile
	 * @return
	 * helper method to call readFile Method
	 */
	public int[] read (String myFile) {
		ReadFile reader = new ReadFile(); 
		int[] array = reader.readFile(myFile);
		return array;
	}
	
	//Arrays to Sort
	int[] a100 = read("nums100.txt");
	int[] a1000 = read("nums1000.txt");
	int[] a10000 = read("nums10000.txt");
	
	
	/*Too much repeated code below
	 * To DO: Implement function to call sorts and Time
	 */
	public void callSortandTime() {
		
	}

	//method when buttons are pressed, calls sorts and adds values to table
	@Override 
	public void actionPerformed(ActionEvent e) {
		//insertion Sort
		if (e.getSource() == insertionSort) {
			Timer insertTimer = new Timer();
			InsertionSort myInsertSort = new InsertionSort();
			//100case
			insertTimer.start();
			myInsertSort.insertSort(a100);
			insertTimer.end();
			long totalTime = insertTimer.getTotalTime();
			int insertSwaps100 = myInsertSort.getSwaps();
			int insertComps100 = myInsertSort.getComparisons();
			//1000 case
			insertTimer.start();
			myInsertSort.insertSort(a1000);
			insertTimer.end();
			long time1000 = insertTimer.getTotalTime();
			int insertSwaps1000 = myInsertSort.getSwaps();
			int insertComps1000 = myInsertSort.getComparisons();
			//10000 case
			insertTimer.start();
			myInsertSort.insertSort(a10000);
			insertTimer.end();
			long time10000 = insertTimer.getTotalTime();
			int insertSwaps10000 = myInsertSort.getSwaps();
			int insertComps10000 = myInsertSort.getComparisons();
			//add rows to table
			Object[] insertSize100 = {"insert Sort","100",insertSwaps100,insertComps100,totalTime};
			Object[] insertSize1000 = {"insert Sort","1000",insertSwaps1000,insertComps1000,time1000};
			Object[] insertSize10000 = {"insert Sort","10000",insertSwaps10000,insertComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(insertSize100);
			model.addRow(insertSize1000);
			model.addRow(insertSize10000);
			
		//select sort
		} 
		else if (e.getSource() == selectionSort) {
			Timer selectTimer = new Timer();
			SelectionSort mySelectionSort = new SelectionSort();
			//100case
			selectTimer.start();
			mySelectionSort.sort(a100);
			selectTimer.end();
			long totalTime = selectTimer.getTotalTime();
			int selectSwaps100 = mySelectionSort.getSwapCount();
			int selectComps100 = mySelectionSort.getComparisonCount();
			//1000 case
			selectTimer.start();
			mySelectionSort.sort(a1000);
			selectTimer.end();
			long time1000 = selectTimer.getTotalTime();
			int selectSwaps1000 = mySelectionSort.getSwapCount();
			int selectComps1000 = mySelectionSort.getComparisonCount();
			//10000 case
			selectTimer.start();
			mySelectionSort.sort(a10000);
			selectTimer.end();
			long time10000 = selectTimer.getTotalTime();
			int selectSwaps10000 = mySelectionSort.getSwapCount();
			int selectComps10000 = mySelectionSort.getComparisonCount();
			//add rows to table
			Object[] size100 = {"Select Sort","100",selectSwaps100,selectComps100,totalTime};
			Object[] size1000 = {"Select Sort","1000",selectSwaps1000,selectComps1000,time1000};
			Object[] size10000 = {"Select Sort","10000",selectSwaps10000,selectComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(size100);
			model.addRow(size1000);
			model.addRow(size10000);
		}
		//bubbleSort
		else if (e.getSource() == bubbleSort) {
			Timer bubbleTimer = new Timer();
			BubbleSort myBubbleSort = new BubbleSort();
			//100case
			bubbleTimer.start();
			myBubbleSort.sort(a100);
			bubbleTimer.end();
			long totalTime = bubbleTimer.getTotalTime();
			int bubbleSwaps100 = myBubbleSort.getSwapCount();
			int bubbleComps100 = myBubbleSort.getComparisonCount();
			//1000 case
			bubbleTimer.start();
			myBubbleSort.sort(a1000);
			bubbleTimer.end();
			long time1000 = bubbleTimer.getTotalTime();
			int bubbleSwaps1000 = myBubbleSort.getSwapCount();
			int bubbleComps1000 = myBubbleSort.getComparisonCount();
			//10000 case
			bubbleTimer.start();
			myBubbleSort.sort(a10000);
			bubbleTimer.end();
			long time10000 = bubbleTimer.getTotalTime();
			int bubbleSwaps10000 = myBubbleSort.getSwapCount();
			int bubbleComps10000 = myBubbleSort.getComparisonCount();
			//add rows to table
			Object[] size100 = {"Bubble Sort","100",bubbleSwaps100,bubbleComps100,totalTime};
			Object[] size1000 = {"Bubble Sort","1000",bubbleSwaps1000,bubbleComps1000,time1000};
			Object[] size10000 = {"Bubble Sort","10000",bubbleSwaps10000,bubbleComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(size100);
			model.addRow(size1000);
			model.addRow(size10000);
		 }	
		//Quick Sort
		 else if (e.getSource() == quickSort) {
			Timer quickTimer = new Timer();
			QuickSort myQuickSort = new QuickSort();
			//100case
			quickTimer.start();
			myQuickSort.sort(a100);
			quickTimer.end();
			long totalTime = quickTimer.getTotalTime();
			int quickSwaps100 = myQuickSort.getSwapCount();
			int quickComps100 = myQuickSort.getComparisonCount();
			//1000 case
			quickTimer.start();
			myQuickSort.sort(a1000);
			quickTimer.end();
			long time1000 = quickTimer.getTotalTime();
			int quickSwaps1000 = myQuickSort.getSwapCount();
			int quickComps1000 = myQuickSort.getComparisonCount();
			//10000 case
			quickTimer.start();
			myQuickSort.sort(a10000);
			quickTimer.end();
			long time10000 = quickTimer.getTotalTime();
			int quickSwaps10000 = myQuickSort.getSwapCount();
			int quickComps10000 = myQuickSort.getComparisonCount();
			//add rows to table
			Object[] size100 = {"Quick Sort","100",quickSwaps100,quickComps100,totalTime};
			Object[] size1000 = {"Quick Sort","1000",quickSwaps1000,quickComps1000,time1000};
			Object[] size10000 = {"Quick Sort","10000",quickSwaps10000,quickComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(size100);
			model.addRow(size1000);
			model.addRow(size10000);
		 }
		//Merge Sort	
		 else if (e.getSource() == mergeSort) {
			Timer mergeTimer = new Timer();
			MergeSort myMergeSort = new MergeSort();
			//100case
			mergeTimer.start();
			myMergeSort.sort(a100);
			mergeTimer.end();
			long totalTime = mergeTimer.getTotalTime();
			int mergeSwaps100 = myMergeSort.getSwapCount();
			int mergeComps100 = myMergeSort.getComparisonCount();
			//1000 case
			mergeTimer.start();
			myMergeSort.sort(a1000);
			mergeTimer.end();
			long time1000 = mergeTimer.getTotalTime();
			int mergeSwaps1000 = myMergeSort.getSwapCount();
			int mergeComps1000 = myMergeSort.getComparisonCount();
			//10000 case
			mergeTimer.start();
			myMergeSort.sort(a10000);
			mergeTimer.end();
			long time10000 = mergeTimer.getTotalTime();
			int mergeSwaps10000 = myMergeSort.getSwapCount();
			int mergeComps10000 = myMergeSort.getComparisonCount();
			//add rows to table
			Object[] size100 = {"Merge Sort","100",mergeSwaps100,mergeComps100,totalTime};
			Object[] size1000 = {"Merge Sort","1000",mergeSwaps1000,mergeComps1000,time1000};
			Object[] size10000 = {"Merge Sort","10000",mergeSwaps10000,mergeComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(size100);
			model.addRow(size1000);
			model.addRow(size10000);
		 }
		//shellSort
		 else if (e.getSource() == shellSort) {
			Timer shellTimer = new Timer();
			ShellSort myShellSort = new ShellSort();
			//100case
			shellTimer.start();
			myShellSort.sort(a100);
			shellTimer.end();
			long totalTime = shellTimer.getTotalTime();
			int shellSwaps100 = myShellSort.getSwapCount();
			int shellComps100 = myShellSort.getComparisonCount();
			//1000 case
			shellTimer.start();
			myShellSort.sort(a1000);
			shellTimer.end();
			long time1000 = shellTimer.getTotalTime();
			int shellSwaps1000 = myShellSort.getSwapCount();
			int shellComps1000 = myShellSort.getComparisonCount();
			//10000 case
			shellTimer.start();
			myShellSort.sort(a10000);
			shellTimer.end();
			long time10000 = shellTimer.getTotalTime();
			int shellSwaps10000 = myShellSort.getSwapCount();
			int shellComps10000 = myShellSort.getComparisonCount();
			//add rows to table
			Object[] size100 = {"Shell Sort","100",shellSwaps100,shellComps100,totalTime};
			Object[] size1000 = {"Shell Sort","1000",shellSwaps1000,shellComps1000,time1000};
			Object[] size10000 = {"Shell Sort","10000",shellSwaps10000,shellComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(size100);
			model.addRow(size1000);
			model.addRow(size10000);
		 }	
		 else if (e.getSource() == radixSort) {
			Timer radixTimer = new Timer();
			radixSort myRadixSort = new radixSort();
			//100case
			radixTimer.start();
			myRadixSort.sort(a100);
			radixTimer.end();
			long totalTime = radixTimer.getTotalTime();
			int radixComps100 = myRadixSort.getComparisonCount();
			//1000 case
			radixTimer.start();
			myRadixSort.sort(a1000);
			radixTimer.end();
			long time1000 = radixTimer.getTotalTime();
			int radixComps1000 = myRadixSort.getComparisonCount();
			//10000 case
			radixTimer.start();
			myRadixSort.sort(a10000);
			radixTimer.end();
			long time10000 = radixTimer.getTotalTime();
			int radixComps10000 = myRadixSort.getComparisonCount();
			//add rows to table
			Object[] size100 = {"Radix Sort","100",0,radixComps100,totalTime};
			Object[] size1000 = {"Radix Sort","1000",0,radixComps1000,time1000};
			Object[] size10000 = {"Radix Sort","10000",0,radixComps10000,time10000};
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(size100);
			model.addRow(size1000);
			model.addRow(size10000);
		}
	}
}
