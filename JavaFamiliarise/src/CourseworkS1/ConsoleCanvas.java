package CourseworkS1;

public class ConsoleCanvas {
	
	private int xSize, ySize;
	private char[][] displayChars;  //2D array of characters
	
	ConsoleCanvas(int xS, int yS, String userStr){
		xSize = xS+2;				//2D array needs to be size +2 for border
		ySize = yS+2;
		displayChars = new char [xSize][ySize];			//creating an array big enough for canvas and border
		padChars(' ', '#', userStr);			//sets up the array spaces and border
	}
	
	/**
	 * function to fill the disaplyChars array with either blank spaces or hashtags for the border.
	 * @param pchar		character to pad array
	 * @param bchar		character used for the border
	 * @param userStr	8 character string used for the student number
	 */
	
	private void padChars(char pchar, char bchar, String userstr) {
		int checkNumbersAtTop = Math.max((xSize-8)/2,0);
		
		for (int x=0; x<xSize;x++)
			for(int y=0;y<ySize;y++)
				if(x>0 && x<xSize-1 && y>0 && y<ySize-1)
					displayChars[x][y] = pchar;
				else if (x>=checkNumbersAtTop && x<8+checkNumbersAtTop && y==0)displayChars[x][y] = userstr.charAt(x-checkNumbersAtTop);
				else displayChars[x][y]=bchar;
	}
	
	/**
	 * specifies what is shown at position x,y
	 * @param x
	 * @param y
	 * @param ch
	 */
	
	public void showRobot(int x, int y, char ch) {
		displayChars[x+1][y+1] = ch; //puts ch into position x,y in displayChars arena
	}
	
	/**
	 * function to output a row of the building with walls/objects in it if necessary
	 * does so by outputting displayChars array, preceded and followed by pchar characters
	 * @param pchar
	 */
	
	public String toString() {
		String ans = "";
		for (int y=0; y<ySize; y++) {
			for(int x=0; x<xSize; x++) ans+= displayChars[x][y];
			ans+='\n';
		}
		return ans;
	}
	
	public static void main (String[] args) {
		ConsoleCanvas c = new ConsoleCanvas (20,12, "32025204");
		c.showRobot(4,3,'R');
		System.out.println(c.toString());
	}

}
