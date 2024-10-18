package week2;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class task3 {

	private int[] numbers;
	// you may want more private variables
	
	/**
	 * create class : 
	 * @param instr	- string with series of numbers separated by space
	 */
	task3 (String instr) {
		StringSplitter S = new StringSplitter (instr, " ");
		numbers = S.getIntegers();
	}
	/**
	 * method to search through array of integers and find two pairs of adjacent numbers
	 * which are closest in value; note the difference and where in array
	 */
	public void findSmallest() {
	// you write this    		
    }
	/**
	 * return as string the result of analysis
	 */
	public String toString() {
		return "Smallest difference is ";		// you extend this
	}
	
	public static void main(String[] args) {
		String userIn = JOptionPane.showInputDialog(null, "Enter series of numbers separated by space > ");
		task3 sd = new task3(userIn);
		sd.findSmallest();
		JOptionPane.showMessageDialog(null, sd.toString());

	}

}
