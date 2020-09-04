package Pi;

public class Pi {

    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static double calculate() {

        double PiSquared = 0;
        double Zaehler = 1;
        double Nenner = 1;
        for (int i = 0; i < 2000000; i++) {
            PiSquared = PiSquared + Zaehler / Nenner;
            Zaehler = -Zaehler;
            Nenner = Nenner + 2;
        }

        return (PiSquared * 4);

    }
}
