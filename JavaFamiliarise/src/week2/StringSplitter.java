package week2;

public class StringSplitter {
	public StringSplitter(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// main function to test class
		StringSplitter ME = new StringSplitter("2 5 6 9", " ");
												// create example
		System.out.println(ME.toString());
		
		String[] temp = ME.getStrings(); // get a copy of strings
		
		for (int ct=0; ct<temp.length; ct++)
			System.out.print(temp[ct] + "\t");
		System.out.println();
		
		temp[0] = "fred"; 		// change the copy of the first element
		
		for (int ct=0; ct<temp.length; ct++)
			System.out.print(temp[ct] + "\t");
		System.out.println();
		
		System.out.println(ME.toString());

	}
	public String[] getStrings() {
		return Arrays.copyof(manyStrings, manyStrings.length);
	}

	public int[] getIntegers() {
		// TODO Auto-generated method stub
		return null;
	}

}