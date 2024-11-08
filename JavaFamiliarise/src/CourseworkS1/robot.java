package CourseworkS1;

public class robot {
	private int x,y,robotId, dx, dy;   //robot position in x and y coordinates, the id of the ball and the direction of movement in the x and y direction.
	private static int robotCount = 0;   //gives each robot its own number
	private Direction d; //direction the robot will travel in
	private String xVal,yVal;
	
	
	public robot (int rx, int ry, Direction dir) {
		x= rx;				//sets x and y starting position
		y=ry;
		robotId = robotCount++;			//sets the robots personal Id
		dx=1;					//sets the robots movement directions in x and y directions
		dy=1;
		d=dir;
	}
	
	/**
	 * get value of x
	 * @return x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * get value of y
	 * @return y
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * set values of x and y
	 * @param nx	new value of x
	 * @param ny	new value of y
	 */
	public void setXY(int nx, int ny) {
		x=nx;
		y=ny;
	}
	
	/**
	 * Is the robot at this x,y position
	 * @param sx x position
	 * @param sy y position
	 * @return true if robot is at sx,sy, false otherwise
	 *
	 */
	public boolean isHere(int sx, int sy) {
		if (getX()==sx) {
			if (getY()==sy) {
				return true;
			}
		}else {
			return false;
		}
		return false;
	}
	
	/**
	 * return information about the robot in a string
	 * 
	 */
	public String toString() {
		return "robot " + robotId + "  is at " + x + "," + y + " direction of travel is "+ d.toString()+"\n";
	}
	
	/**
	 * construct a robot object with its position defined by string s.
	 *
	 */
	public robot(String s,Direction dir) {
		this(0,0,dir);
		//stringSplitter ss=new StringSplitter(s, " ");
		//setXY(ss.getNthInt(0, 5), ss.getNthInt(1,8));
		//setXY(s.split(","));
		String[] xAndYValues = s.split(",");
		xVal=xAndYValues[0];
		yVal=xAndYValues[1];
		
		int xVal_to_int = Integer.parseInt(xVal);
		int yVal_to_int = Integer.parseInt(yVal);
		setXY(xVal_to_int,yVal_to_int);
		d=dir;
	}
	
	/**
	 * display the Robot in the canvas
	 * @param c the canvas used
	 */

	public void displayRobot(ConsoleCanvas c) {
		//call the showRobot method in c to put R where the robot is
		c.showRobot(getX(),getY(),'R');
	}
	
	public void tryToMove() {
		boolean moveCheck=false;
		while (moveCheck == false){
			int tempX = x;
			int tempY = y;
			if (d==Direction.North) {
				tempY=y+1;
			}else if (d==Direction.East) {
				tempX=x+1;
			}else if (d==Direction.South) {
				tempY=y-1;
			}else if (d==Direction.West) {
				tempX=x-1;
			}
			
			boolean canMove = robotArena.canMoveHere(tempX,tempY);
			if (canMove==true) {
				x=tempX;
				y=tempY;
				moveCheck=true;
			}else{
				d=d.next();
				d.toString();
			}
		}
		//might need to change x and y to temopX and tempY
		/*if (direction=north) then y value = y+1
		if (direction = east) then x value = x+1
		if (direction=south) then y value = y-1
		if (direction = west) then x value = x-1
		
		**/
		

	}
	
	
	
	
	
	//main class
	public static void main(String[] args) {
		//robot d = new robot(5,3); //creating a robot
		robot e = new robot("1,2", Direction.West);
		//System.out.println(d.toString());// print where the robot is
		System.out.println(e.toString());
	}
	
}
