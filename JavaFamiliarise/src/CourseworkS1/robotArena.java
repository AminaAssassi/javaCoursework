package CourseworkS1;

import java.util.ArrayList;
import java.util.Random;

public class robotArena {
	private static String xmax;
	private static String ymax; //defines the size of the arena
	private static robot r;  //robot in the arena
	static ArrayList<robot>manyRobots;
	
	//static //Random randomGenerator;
	//manyRobots();
	//manyRobots = new ArrayList<robot>();
	
	
	 static void manyRobots(){
		//manyRobots = new ArrayList<robot>();
		manyRobots.add(r);
	}
	
	/**
	 * Search arraylist of robots to see if there is a robot at x,y
	 * @param x
	 * @param y
	 * @return null if no robot there, otherwise return robot
	 */
	public static robot getrobotAt (int x, int y) {
		for (robot r:manyRobots){
			if(r.getX()==x) {
				if(r.getY()==y) {
					return r;
					
				}
			}else {
				return null;
			}
		}
		return null;
	}
	
	/**
	/**
	 * create the arena and add the robot in the middle
	 * 
	 */
	public robotArena(String s) {
		manyRobots = new ArrayList<robot>();
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
		int valx;// = randomGenerator.nextInt(0,xmax_to_int);
		int valy;//= randomGenerator.nextInt(0,ymax_to_int);
		robot robotAlready;// = getrobotAt(valx,valy);

		do{
			valx = randomGenerator.nextInt(0,xmax_to_int);
			valy = randomGenerator.nextInt(0,ymax_to_int);
			System.out.println(valx);
			System.out.println(valy);
			System.out.println(getrobotAt(valx,valy));
			robotAlready = getrobotAt(valx,valy);

		}
		while(robotAlready!= null);
		
		r=new robot(valx,valy,Direction.randomDirection());
		manyRobots();
		
	
	}
	
	public int getXSize() {
		int xmax_to_int = Integer.parseInt(xmax);
		return xmax_to_int;
	}
	
	public int getYSize() {
		int ymax_to_int = Integer.parseInt(ymax);
		return ymax_to_int;
	}
	public String toString() {
		String ans = "";
		System.out.println( "Arena size " + xmax + " by " +ymax);
		for (robot r:manyRobots) //ans += r.toString() + "\n";
			ans=ans +r.toString();
		return ans;
	}
	
	/**
	 * show all the Robots in the interface
	 * @param c the canvas in which Robots are shown
	 */
	public void showRobots(ConsoleCanvas c) {
		//loop through all the robots calling the displayRobot method
		for (robot r:manyRobots)
			r.displayRobot(c);
	}
	/*
	 * tests if the x and y values are within the arena
	 *  size and returns true if they are and false if not
	 */
	public static boolean canMoveHere(int x,int y) {
		boolean canMove = true;
		if (x<1 || x>(Integer.parseInt(xmax)-1)) {
			canMove=false;
		}else if(y<1 || y>((Integer.parseInt(ymax)-1))) {
			canMove=false;
		}else if(getrobotAt(x,y)!=null){
			canMove=false;//there is not a robot already there
		}
		
		return canMove;
		
	}
	
	public static void moveAllRobots() {
		for (robot r:manyRobots)
			r.tryToMove();
		
	}
	
	
	public static void main(String[] args) {
		//randomGenerator=new Random();
		//code to test the arena
		robotArena ra = new robotArena("20,12");
		addRobot();
		addRobot();
		addRobot();
		System.out.println(ra.toString());
	}
}
