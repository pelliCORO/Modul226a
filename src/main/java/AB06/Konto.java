package AB06;

public class Konto {


    private int laufzeit = 0;
    private double saldo = 0;
    private double zinssatz = 0.01;

    public Konto (double betrag){
        saldo = betrag;
    }


    public void einzahlen(double betrag) {

        saldo = saldo + betrag;

    }

    public void verzinsen(int laufzeit){

        if(saldo>= 500000){
            zinssatz= 0;
        }
        else if(saldo>=50000){
            zinssatz= zinssatz/2;
        }
        else{
            zinssatz = 0.01;
        }

        double zins = saldo* zinssatz * laufzeit/365;
        saldo = saldo + zins;

    }

    public double getSaldo(){

        return saldo;
    }

}
