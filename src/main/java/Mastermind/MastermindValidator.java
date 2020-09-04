package mastermind;


/**
 * this  java class is used to validate if the user input is correct and evaluate the result of the try
 *
 * @author Michael Pellicoro
 * @version 1.0
 */
public class MastermindValidator {
	

 
	/**
	* This Method checks first the lenght of user input and if any character of  
	* the input is  in the list of the colors   
	*
	* @param string userinput
	* @return boolean return true ist the input valid   
	*/	
	
	public boolean validateInput(String input) {
        if (input.length() != 6) {
            return false;
        }
        char[] ch = new char[input.length()];

        // Copy character by character into array
        for (int i = 0; i < input.length(); i++) {
            ch[i] = input.charAt(i);
            if (Mastermind.COLORS.get(ch[i]) == null) {
                return false;
            }
        }
        return true;
    }

	/**
	* This Method checks how many colors are in the right place and how many colors
	* are right but not in the right place    
	*

	* @param  int[]   the right solution of the the game  
	* @param  int[]   the attempt of the user
	* @return Result the result of the evaluation of the user try   
	*/	
	public Result evaluate(int[] randomCode, int input[]) {

        Result retVal = new Result();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == randomCode[i]) {
                retVal.setAllRight(retVal.getAllRight() + 1);
                randomCode[i] = 0;
                input[i]= 0;
            }
        }

        for (int i = 0; i < input.length; i++) {
            for (int y = 0; y < input.length; y++) {
                if (input[i] == randomCode[y] && input[i]!=0) {
                    retVal.setRightColor(retVal.getRightColor() + 1);
                    randomCode[y] = 0;
                    input[i]= 0;

                }
            }
        }
        return retVal;
    }
	
	
}
