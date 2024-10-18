package week2;

import java.util.Arrays;

/**
 * @author shsmchlr
 * class for handling multiple strings generated from a string
 */

public class task2 {
	
    private String[] manyStrings;
    
    /**
     * Create multiple strings passing the source string and the string used to split it
     * @param s		original string
     * @param spl	string used to split the elements
     */
    public task2(String s, String spl) {
    	manyStrings = s.split(spl);		// split the strings
    }
    
    /**
     * report how many strings there are
     * @return how many
     */
    public int numElement() {
    	return manyStrings.length;
    }
    /**
     * get nth String. but return defStr if n out of range
     * @return
     */
    public String getNth (int n, String defStr) {
    	if (n<manyStrings.length) return manyStrings[n]; else return defStr;
    }
    
    /**
     * get nth element returning as int, returning defInt if n out of range
     * @return
     */
    public int getNthInt (int n, int defInt) {
    	if (n<manyStrings.length) return Integer.parseInt(manyStrings[n]); else return defInt;
    	
    }
    
    /** 
     * return all elements as an array of strings
     * @return
     */
   public String[] getStrings() {
    	return Arrays.copyOf(manyStrings, manyStrings.length);   // this is right version
//    	 return manyStrings;			/// don't use this as it returns address of string
    }
    /** 
     * return all elements as an array of integers
     * @return
     */
    public int[] getIntegers() {
    	int res[] = new int [manyStrings.length];
    	for (int ct=0; ct<manyStrings.length; ct++) res[ct] = Integer.parseInt(manyStrings[ct]);
    	return res;
    }
    
    /** 
     * return contents of class as a string (each substring is separated by a tab)
     */
    public String toString() {
    	String res = "";
    	for (int ct=0; ct<numElement(); ct++) res = res + getNth(ct, "") + "\t";
    	return res;
    }
    
	public static void main(String[] args) {
		// main function to test class
		task2 ME = new task2("2 5 6 9", " ");		// create example
		System.out.println(ME.toString());

		String[] temp = ME.getStrings();			// get a copy of the strings
		
		for (int ct=0; ct<temp.length; ct++) System.out.print(temp[ct] + "\t");
		System.out.println();

		temp[0] = "fred";			// change the copy of the first element
		
		for (int ct=0; ct<temp.length; ct++) System.out.print(temp[ct] + "\t");
		System.out.println();

		System.out.println(ME.toString());
	}

}

