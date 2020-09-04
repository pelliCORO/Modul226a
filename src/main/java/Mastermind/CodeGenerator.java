package mastermind;

/**
 * this simple java class is used to generate the solution  sequence for the Mastermind program.
 *
 * @author Michael Pellicoro
 * @version 1.0
 */
public class CodeGenerator {

	/**
	* This Method use the Method random() of the class Math to generate a Array of 
	* int in a given range form 1 to max 
	*
	* @param  max    the max value a single item can have 
	* @return retVal the random vales as  int[]   
	*/	
	public static int[] generateCode(int max) {
		
		 // this method return a random sequence of int in a range from 1 to lenght variable
	        int[] retVal = new int[max];
	        for (int i = 0; i < max; i++) {
	           int val = (int) ((Math.random() * (max - 1)) + 1);
	            retVal[i] = val;
	        }
	        return retVal;
	    }
}
