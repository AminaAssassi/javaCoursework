package CourseworkS1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Simple program to show arena with multiple robots
* @author shsmchlr
 *
 */
public class RobotInterface {
	
	private Scanner s;								// scanner used for input from user
    private robotArena myArena;				// arena in which Robots are shown
    private ConsoleCanvas c;
    //private static String xMax,ymax;
    /**
    	 * constructor for RobotInterface
    	 * sets up scanner used for input and the arena
    	 * then has main loop allowing user to enter commands
     */
    public RobotInterface() {
    	 s = new Scanner(System.in);			// set up scanner for user input
    	 myArena = new robotArena("20,6");	// create arena of size 20*6
    	
        char ch = ' ';
        do {
        	System.out.print("Enter (A)dd Robot, get (I)nformation, do (D)isplay, (M)ove robot, or e(X)it > ");
        	ch = s.next().charAt(0);
        	s.nextLine();
        	switch (ch) {
    			case 'A' :
    			case 'a' :
        					myArena.addRobot();	// add a new Robot to arena
        					break;
        		case 'I' :
        		case 'i' :
        					System.out.print(myArena.toString());
            				break;
        		case 'D' :
        		case 'd' :
        					doDisplay();  //calls the doDisplay function
        					break;
        		case 'M' :
        		case 'm' :
        					robotArena.moveAllRobots();
        					doDisplay();
        					System.out.print(myArena.toString());
        					break;
        		case 'S' :
        		case 's' :
        					simulate(20);
        					break;
        		case 'x' : 	ch = 'X';				// when X detected program ends
        					break;
        	}
    		} while (ch != 'X');						// test if end
        
       s.close();									// close scanner
    }
    /**
     * returns the integer from the position of the x and y coordinates, takes in if they want x or y
     
    public static returnXOrY(String s, String xOrY) {
    	 String[] arenaCoordinates = s.split(",");
    	xMax=arenaCoordinates[0];
    	ymax=arenaCoordinates[1];
    }
   */
 
 
    /**
     * get x value of the arena size
     * @return x
     
    public int getXSize() {
    	int xmax_to_int = Integer.parseInt(xmax);
    	return xmax_to_int;
    }
    */
    
    /**
     * get y value of the arena size
     * @return y
     
    
    public int getYSize() {
    	int ymax_to_int = Integer.parseInt(ymax);
    	return ymax_to_int;
    }
    */
    
    
    /**
     * Display the Robot arena on the console
     */
    void doDisplay() {
    	c=new ConsoleCanvas(myArena.getXSize(), myArena.getYSize(), "32025204");
    	myArena.showRobots(c);
    	System.out.println(c.toString());
    }
    
    private void simulate (int nTimes) {
    	for(int ct=0; ct<nTimes; ct++) {
    		myArena.moveAllRobots();
    		System.out.println();
    		doDisplay();
    		try {
    			TimeUnit.MILLISECONDS.sleep(200);
    		}catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    		
    	}
    }
    
	public static void main(String[] args) {
		RobotInterface r = new RobotInterface();	// just call the interface
	}

}