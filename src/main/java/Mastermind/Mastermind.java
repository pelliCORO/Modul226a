package mastermind;

import java.util.HashMap;
import java.util.Scanner;

/**
 * this  java class implement a non graphical version of the game Mastermind
 *
 * @author Michael Pellicoro
 * @version 1.0
 */
public class Mastermind  implements Game{

    private final int[] SECRET_CODE;
    public static final  HashMap<Character, Integer> COLORS=new HashMap<Character, Integer>();
    private Scanner scanner;
    private boolean valid = false;
        

    /**
    * default Constructor of the class Mastermind
    */
    public Mastermind() {
    	initializeClors();
    	SECRET_CODE = CodeGenerator.generateCode(6);
        scanner= new Scanner(System.in);

    }

    
    /**
    * this simple method is used in the default constructor and initialize a map of colors with an index
    */    
    private void initializeClors() {
    	COLORS.put('r', 1);
        COLORS.put('g', 2);
        COLORS.put('b', 3);
        COLORS.put('y', 4);
        COLORS.put('w', 5);
        COLORS.put('s', 6);
    }

    
    /**
    * the main method used to start the game
    */    
    public static void main(String[] args) {
        Game mastermind = new Mastermind();
        mastermind.play();
    }
    

    /**
    * this is the Methods which implements the logic of the game 
    */    
    public void play(){
    	int[] geheimParam = new int[SECRET_CODE.length] ;
        int[] usercode= new int[SECRET_CODE.length];
        String input="";
        boolean won = false ;
        while (!isValid()) {
            for(int i=0; i< SECRET_CODE.length; i++) {
            	geheimParam[i]=SECRET_CODE[i];
            }
        	input = getUserInput();
        	MastermindValidator validator = new MastermindValidator();
        	valid=validator.validateInput(input);
            if(valid) {
                usercode=Util.getIntArrayFromString(input);
            }else {
            	System.out.println(Util.NOT_VALID_STRING);
            }
            if(!won && isValid()) {
            	Result result= validator.evaluate(geheimParam,usercode);
                if(result.getAllRight()!=6) {
                	System.out.println(Util.TRY_AGAIN_STRING);
                	System.out.println(Util.HAVE_STRING+result.getAllRight()   +Util.RIGHT_PLACE_STRING);
                	System.out.println(Util.AND_STRING+result.getRightColor() +Util.RIGHT_COLOR_STRING);
                	setValid(false);
                }else {
                	won=true;
                }
            }
        } 
        if(won) {
            System.out.println(Util.WON_STRING);
            scanner.close();
        }
    }    

    
    /**
    * this  Methods read  the user attempt from inputline
    */    
    public String getUserInput() {
        System.out.println(Util.EINGABE_STRING);
        String input = scanner.nextLine();
        return input;
    }

    /**
    * return true if user attempt is correct  
    */    
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
		this.valid = valid;
	}
    
    
    
}
