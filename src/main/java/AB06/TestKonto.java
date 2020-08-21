package AB06;

public class TestKonto {

    public static void main(String[] args) {
        Konto  konto1= new Konto (500.75);
        Konto  konto2 = new Konto (720.50);

        konto1.verzinsen(365);
        System.out.println("Konto1: "+konto1.getSaldo());

        konto2.verzinsen(750);
        konto2.einzahlen(50);
        System.out.println("Konto2: "+konto2.getSaldo());

    }

}
