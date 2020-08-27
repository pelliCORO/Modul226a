package AB05;
import java.util.Scanner;



public class Rechner {

    public int zahl1;
    public int zahl2;
    public int opp;

    public static void main(String[] args) {
        Rechner rechner = new Rechner();
    rechner.benutzereingabe();
    System.out.println(rechner.calc());
    }


    public  void benutzereingabe(){

        Scanner operator_eins = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Geben sie eine Zahl ein:");
        zahl1 = operator_eins.nextInt();  // Read user input

        Scanner operator_zwei = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Geben sie eine zweite Zahl ein:");
        zahl2 = operator_zwei.nextInt();  // Read user input

        Scanner opperations_zeichen = new Scanner(System.in);
        System.out.println("Geben sie einen Operand ein");
        opp = opperations_zeichen.nextInt();  // Read user input

    }

    public void setZahl1(int zahl1) {
        this.zahl1 = zahl1;
    }

    public void setZahl2(int zahl2) {
        this.zahl2 = zahl2;
    }

    public void setOpp(int opp) {
        this.opp = opp;
    }

    public int calc(){


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
