package M226A;
import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
    System.out.println(calc());
    }

    public static int calc(){

        int Ergebnis=0;

        Scanner operator_eins = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Geben sie eine Zahl ein:");
        int zahl1 = operator_eins.nextInt();  // Read user input

        Scanner operator_zwei = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Geben sie eine zweite Zahl ein:");
        int zahl2 = operator_zwei.nextInt();  // Read user input

        Scanner opperations_zeichen = new Scanner(System.in);
        System.out.println("Geben sie einen Operand ein");
        int opp = operator_zwei.nextInt();  // Read user input




        switch (opp) {

            default:
                
            case 1:
                return zahl1+zahl2;
            case 2:
                return zahl1-zahl2;
            case 3:
                return zahl1*zahl2;
            case 4:
                return zahl1/zahl2;
            case 5:
                return zahl1%zahl2;




        }



    }
}
