package CourseworkS1;

import java.util.Random;

public class robotArena {
	private static String xmax;
	private static String ymax; //defines the size of the arena
	private static robot r;  //robot in the arena
	//Random randomGenerator;
	
	/**
	 * create the arena and add the robot in the middle
	 * 
	 */
	public robotArena(String s) {
		/*StringSplitter ss = new StringSplitter(s, ";");
		StringSplitter sbp = new StringSplitter(ss.getNth(0,"5 10"), " ");
		xmax = sbp.getNthInt(0,5);
		ymax = sbp.getNthInt(0,5);
		r=new robot(ss.getNth(1, "2 5"));*/
		String[] arenaCoordinates = s.split(",");
		xmax=arenaCoordinates[0];
		ymax=arenaCoordinates[1];
		//r=new robot(3,4);
	}
	
	public static void addRobot() {
		
		//task 3.3 placing the robot in the centre of the arena
		int xmax_to_int = Integer.parseInt(xmax);
		int halfx = xmax_to_int/2;
		int ymax_to_int = Integer.parseInt(ymax);
		int halfy = ymax_to_int/2;
		//r=new robot(halfx,halfy);
		
		//task 3.4 placing the robot in a random position in the arena
		Random randomGenerator;
		randomGenerator=new Random();
		int valx = randomGenerator.nextInt(0,xmax_to_int);
		int valy = randomGenerator.nextInt(0,ymax_to_int);
		System.out.println(valx);
		System.out.println(valy);
		r=new robot(valx,valy);
	}
	
	public String getXSize() {
		return xmax;
	}
	
	public String getYSize() {
		return ymax;
	}
	public String toString() {
		return "Arena size " + xmax + " by " +ymax + " with "+r.toString();
	}
	
	public static void main(String[] args) {
		//randomGenerator=new Random();
		//code to test the arena
		robotArena ra = new robotArena("20,12");
		addRobot();
		System.out.println(ra.toString());
	}
}
