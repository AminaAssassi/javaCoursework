package week3ExtraTasksForPractice;
/**
 * @author shsmchlr
 *
 */
// class to print primes from 0.100 using Sieve of Erastothenes
// example aimed at beginners, where access modifiers private public not used
// better if variables were private and constructor and other methods public

public class primes {

	private int maxNum = 100;							// maximum number
	private boolean sieve[] = new boolean[maxNum];		// sieve is array of booleans

	/**
	 * construct class, initialising the array
	 */
	public primes()  {
		sieve[0]=false;
		sieve[1]=true;
		for(int i=2; i<sieve.length;i++)
			sieve[i]=true;
			// elements 0,1 set false, so not prime, 2..maxNum-1 are true - as possible primes
	}
	/**
	 * do the sieving algorithm
	 */
	//public void doSieving() {
	//		for(int i=0; i<sieve.length; i++)
	//			if sieve[i]=true;
	//				System.out.println("this value is prime");
	//				elseif sieve[i]=false;
					
				
				// for each element in array
				// if true, then this number is prime
				// but all multiples are not, so set false
	//}
	
	/**
	 * return as a string a list of all prime numbers
	 * @return string
	 */
	public String toString() {
		String s = "Primes are ";					// set up string
		for (int i=0;i<sieve.length; i++)			// for each element in sieve
			if (sieve[i]=true)
				s=s+sieve[i]+"\t";
			
													// if it is prime, add to string
		return s;									// return result
	}

	public static void main(String[] args) {
		// main function to test algorithm
		primes sieve = new primes();				// create sieve
		//sieve.doSieving();							// do the sieving process
		System.out.println(sieve.toString());		// get and print results
	}

}

