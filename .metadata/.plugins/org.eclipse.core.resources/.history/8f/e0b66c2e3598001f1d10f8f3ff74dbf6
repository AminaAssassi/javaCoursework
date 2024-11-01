package CourseworkS1;

import java.util.Random;


/**
 * enumration type for the 4 directions
 *
 */
public enum Direction{
	North, East, South, West;


	public Direction randomDirection(){
		Random generator = new Random(); //creating a random object called generator, 
										//when used generator will generate random numbers.
		return values()[generator.nextInt(values().length)]; //generating a random value from 0 to 3
															//the value will be used to get the direction
															//from the array containing the directions
	}
	
	public Direction next() {
		//calculate numerical value of the direction and add 1
		//use mod so one after west is north
		return values()[(ordinal() +1)% values().length];
	}
	
	public static void main(String[] args) {
		Direction d = Direction.West;
		System.out.println(d.toString());
		d = d.next();
		System.out.println(d.toString());
		d= d.randomDirection();
		System.out.println(d.toString());
		}
	}

