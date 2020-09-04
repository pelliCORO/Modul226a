package mastermind;

public class Util {

	
    public static final String EINGABE_STRING="Bitte geben einen sechsstelligen Farbcode ein: ";
    public static final String NOT_VALID_STRING ="input not valid";
    public static final String TRY_AGAIN_STRING ="Nice try";
    public static final String WON_STRING="Congratulation, you win";
    public static final String HAVE_STRING="you have :";
    public static final String RIGHT_PLACE_STRING=" colors at the right place";
    public static final String RIGHT_COLOR_STRING=" colors at the wrong place";
    public static final String AND_STRING="and      :";

	
	
	
    public static  int[] getIntArrayFromString(String str) {
        // Creating array of string length 
        char [] ch = new char[str.length()]; 
        int[] retVal = new int[str.length()];
        // Copy character by character into array bei getting the int from colors
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i);
            int val = Mastermind.COLORS.get(ch[i]);
            retVal[i]=val;
        } 
   	return retVal;

    }
    
    
    public static  char[] getCharArrayFromString(String str) {
        // Creating array of string length 
        char [] ch = new char[str.length()]; 
        // Copy character by character into array bei getting the int from colors
        for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i);
        } 
   	return ch;
    }

	
}
